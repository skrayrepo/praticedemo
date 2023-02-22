package observerpattern;

public class Subscriber implements Observer{
    public String name;
    public Channel channel = new Channel();
    Subscriber(String name){
        this.name = name;
    }
    @Override
    public void subscribeChannel(Channel channel) {
        this.channel = channel;
    }
    public void update(){
        System.out.println(this.name+" "+"New Channel has been uploaded");
    }
}
