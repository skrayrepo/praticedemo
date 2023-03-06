package designpattern.singleton;

public enum Singleton {
    INSTANCE;

    public void connection(){
        System.out.println("DB connection established through Enum.....");
    }
}
