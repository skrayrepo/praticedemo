package observerpattern;

public interface Subject {
    void registerSubscriber(Subscriber subscriber);
    void unregisterSubscriber(Subscriber subscriber);
    void notifyAllSubscriber();
    void uploadVideo(Channel channelName);
}
