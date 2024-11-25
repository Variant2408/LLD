package model;

import java.util.ArrayList;
import java.util.List;

public class Survey {
    private String surveyId;
    private String name;
    private List<Question> questions;

    public Survey(String survetyId,String name){
        this.surveyId=survetyId;
        this.name=name;
        this.questions=new ArrayList<>();
    }

    public void addQuestions(Question q){
        questions.add(q);
    }

    public String getSurveyId(){
        return this.surveyId;
    }

    public List<Question> getQuestions(){
        return this.questions;
    }
}
