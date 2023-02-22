package observerpattern;

public class MainClass {
    public static void main(String[] args) {

        Subscriber subscriber1 = new Subscriber("Santosh");
        Subscriber subscriber2 = new Subscriber("Tapaswini");
        Subscriber subscriber3 = new Subscriber("Sragvi");
        Subscriber subscriber4 = new Subscriber("Saurvi");

        Channel starchannel = new Channel();
        starchannel.registerSubscriber(subscriber1);
        starchannel.registerSubscriber(subscriber2);
        starchannel.registerSubscriber(subscriber3);
        starchannel.registerSubscriber(subscriber4);

        subscriber1.subscribeChannel(starchannel);
        subscriber2.subscribeChannel(starchannel);
        subscriber3.subscribeChannel(starchannel);
        subscriber4.subscribeChannel(starchannel);

        starchannel.uploadVideo(starchannel);


    }
}
