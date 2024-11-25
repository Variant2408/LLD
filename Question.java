package model;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Question {
    private String questionId;
    private String text;
    private Map<String,Integer> options;
    private ConcurrentHashMap<String, AtomicInteger>responseCount;

    public Question(String questionId, String text){
        this.questionId=questionId;
        this.text=text;
        this.options=new HashMap<>();
        this.responseCount=new ConcurrentHashMap<>();

    }

    public void addOption(String option, int weight){
        options.put(option,weight);
        responseCount.put(option,new AtomicInteger(0));
    }

    public void recordResponse(String option){
        if(responseCount.containsKey(option))
            responseCount.get(option).incrementAndGet();
        else
            throw new IllegalArgumentException("Invalid option: "+option);
    }

    public Map<String,Integer> getOptions(){
        return options;
    }

    public Map<String,AtomicInteger> getResponseCount(){
        return responseCount;
    }

    public String getQuestionId(){
        return this.questionId;
    }

}
