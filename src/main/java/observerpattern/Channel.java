package observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{
    private List<Subscriber> subscribers = new ArrayList<>();
    private String channelName;

    @Override
    public void registerSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void unregisterSubscriber(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notifyAllSubscriber() {
        for(Subscriber subscriber:subscribers){
            subscriber.update();
        }
    }

    @Override
    public void uploadVideo(Channel channel) {
        this.channelName =channelName;
        notifyAllSubscriber();
    }
}
