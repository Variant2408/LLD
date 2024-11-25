package org.example;

import SurveyManagement.SurveyService;
import model.Question;
import model.Response;
import model.Survey;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        SurveyService service = new SurveyService();

        // Admin creates a survey
        Survey survey = service.createSurvey("s1", "Customer Satisfaction Survey");

        // Admin adds questions to the survey
        Question q1 = new Question("q1", "How would you rate our service?");
        q1.addOption("Poor", 1);
        q1.addOption("Good", 3);
        q1.addOption("Very Good", 5);
        service.addQuestionToSurvey("s1", q1);

        Question q2 = new Question("q2", "Would you recommend us to others?");
        q2.addOption("No", 1);
        q2.addOption("Yes", 5);
        service.addQuestionToSurvey("s1", q2);

        // User submits a response
        Response response1 = new Response("r1","u1", "s1");
        response1.addAnswer("q1", "Good");
        response1.addAnswer("q2", "Yes");
        service.submitResponse(response1);

        Response response2 = new Response("r2","u2", "s1");
        response2.addAnswer("q1", "Very Good");
        response2.addAnswer("q2", "Yes");
        service.submitResponse(response2);

        // Admin calculates ratings
        double overallRating = service.calculateOverallRating("s1");
        System.out.println("Overall Rating for Survey: " + overallRating);

        double avgRatingQ1 = service.calculateAverageRatingForQuestion("s1", "q1");
        System.out.println("Average Rating for Question 1: " + avgRatingQ1);
    }
}