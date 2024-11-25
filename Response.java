package model;

import java.util.HashMap;
import java.util.Map;

public class Response {
    private String responseId;
    private String userId;
    private String surveyId;
    private Map<String ,String> answers;

    public Response(String responseId,String userId, String surveyId){
        this.responseId=responseId;
        this.userId=userId;
        this.surveyId=surveyId;
        this.answers=new HashMap<>();
    }

    public void addAnswer(String questionId, String option){
        answers.put(questionId,option);
    }

    public Map<String,String> getAnswers(){
        return answers;
    }
    public String getSurveyId(){
        return surveyId;
    }

}
