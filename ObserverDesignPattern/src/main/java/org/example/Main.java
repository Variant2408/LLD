package org.example;

import Observable.SocialMediaAccount;
import Observer.Follower;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        Follower follower1=new Follower("Alice");
        Follower follower2=new Follower("Bob");

        SocialMediaAccount insta=new SocialMediaAccount();
        insta.addFollowers(follower1);
        insta.addFollowers(follower2);

        insta.uploadPost("image1");
    }
}