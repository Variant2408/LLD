package User;

import ChatMediator.ChatMediator;

public abstract class User {
    protected ChatMediator chatMediator;
    protected  String name;

    public User(ChatMediator chatMediator,String name){
        this.chatMediator=chatMediator;
        this.name=name;
    }

    public abstract void sendMessage(String msg);
    public abstract void recieveMessage(String msg);
}
