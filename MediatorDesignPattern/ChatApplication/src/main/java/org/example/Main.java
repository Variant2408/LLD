package org.example;

import ChatMediator.ChatMediator;
import ChatMediator.Impl.ChatRoom;
import User.Impl.ChatUser;
import User.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        ChatMediator chatMediator=new ChatRoom();
        User user1=new ChatUser(chatMediator,"Alice");
        User user2=new ChatUser(chatMediator,"Bob");
        User user3=new ChatUser(chatMediator,"Alex");

        chatMediator.registerUSer(user1);
        chatMediator.registerUSer(user2);
        chatMediator.registerUSer(user3);

        user1.sendMessage("Hi EveryOne");
        user2.sendMessage("Hi Alice");
        user3.sendMessage("what's up");
    }
}