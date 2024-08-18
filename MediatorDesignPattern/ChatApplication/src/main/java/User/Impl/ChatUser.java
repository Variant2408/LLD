package User.Impl;

import ChatMediator.ChatMediator;
import User.User;

public class ChatUser extends User {

    public ChatUser(ChatMediator chatMediator,String name){
        super(chatMediator,name);

    }

    @Override
    public void sendMessage(String msg) {
        System.out.println(this.name+" sendsMessage: "+msg);
        chatMediator.sendMessage(msg,this);

    }

    @Override
    public void recieveMessage(String msg) {
        System.out.println(this.name+" recieves: "+msg);
    }
}
