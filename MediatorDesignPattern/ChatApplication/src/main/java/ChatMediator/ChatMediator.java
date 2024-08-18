package ChatMediator;
import User.User;

public interface ChatMediator {
    void registerUSer(User user);
    void sendMessage(String msg,User user);
}
