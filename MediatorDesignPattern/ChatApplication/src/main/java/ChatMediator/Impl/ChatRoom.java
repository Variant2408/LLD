package ChatMediator.Impl;

import ChatMediator.ChatMediator;
import User.User;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    List<User> userList;

    public ChatRoom(){
        userList=new ArrayList<>();
    }

    @Override
    public void registerUSer(User user) {
        this.userList.add(user);
    }

    @Override
    public void sendMessage(String msg, User user) {
        for(User obj: userList){
            if(obj!=user)
                obj.recieveMessage(msg);
        }
    }
}
