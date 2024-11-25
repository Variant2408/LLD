package SurveyManagement;

import model.Question;
import model.Response;
import model.Survey;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class SurveyService {
    private Map<String, Survey> surveys=new HashMap<>();
    private List<Response> responses= Collections.synchronizedList(new ArrayList<>());

    public Survey createSurvey(String surveyId,String name){
        Survey survey=new Survey(surveyId,name);
        surveys.put(surveyId,survey);
        return survey;
    }

    public void addQuestionToSurvey(String surveyId,Question question){
        Survey survey=surveys.get(surveyId);
        if(survey==null)
            throw new IllegalArgumentException("Survey not found: "+ surveyId);
        survey.addQuestions(question);
    }

    public void submitResponse(Response response){
        Survey survey=surveys.get(response.getSurveyId());
        if(survey==null)
            throw new IllegalArgumentException("Survey not found: "+response.getSurveyId());
        for(Map.Entry<String,String>entry:response.getAnswers().entrySet()){
            String questionId=entry.getKey();
            String option=entry.getValue();

            Optional<Question> questionOpt=survey.getQuestions().stream()
                    .filter(q->q.getQuestionId().equals(questionId))
                    .findFirst();
            if(questionOpt.isPresent())
                questionOpt.get().recordResponse(option);
            else
                throw new IllegalArgumentException("Question not found: "+ questionId);
        }
        responses.add(response);
    }

    public double calculateOverallRating(String surveyId){
        Survey survey=surveys.get(surveyId);
        if(survey==null)
            throw new IllegalArgumentException("Survey not found: "+surveyId);
        int totalWeight=0;
        int totalResponses=0;
        for(Question question: survey.getQuestions()){
            for(Map.Entry<String, AtomicInteger>entry: question.getResponseCount().entrySet()){
                String option=entry.getKey();
                int count=entry.getValue().get();
                totalWeight+=count*question.getOptions().get(option);
                totalResponses+=count;
            }
        }
        return totalResponses==0?0:(double)totalWeight/totalResponses;
    }

    public double calculateAverageRatingForQuestion(String surveyId, String questionId){
        Survey survey=surveys.get(surveyId);
        if(survey==null)
            throw new IllegalArgumentException("Survey not found: "+surveyId);

        Optional<Question>questionOpt=survey.getQuestions().stream()
                .filter(q->q.getQuestionId().equals(questionId))
                .findFirst();
        if(!questionOpt.isPresent())
            throw new IllegalArgumentException("Question not found: "+questionId);

        Question question=questionOpt.get();
        int totalWeight=0;
        int totalResponse=0;

        for(Map.Entry<String,AtomicInteger>entry:question.getResponseCount().entrySet()){
            String option= entry.getKey();
            int count=entry.getValue().get();
            totalWeight+=count*question.getOptions().get(option);
            totalResponse+=count;
        }
        return totalResponse==0?0: (double)totalWeight/totalResponse;
    }
}
