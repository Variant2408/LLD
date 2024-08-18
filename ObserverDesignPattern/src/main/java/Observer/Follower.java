package Observer;

public class Follower implements Observer{
    String name;

    public Follower(String name){
        this.name=name;
    }

    public void update(String post){
        System.out.println("========");
        System.out.println(post);
    }
}
