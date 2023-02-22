package designpattern.clonable.singleton;

public class MainClass {
    public static void main(String[] args) {
        SingletonClass instance1 = SingletonClass.getINSTANCE();
        SingletonClass instance2 = SingletonClass.getINSTANCE();
        if(instance1 == instance2){
            System.out.println("Objects are same");
        }
        //Through Enum we can also create singleton class by protecting private constructor used by reflection in above SingletonClass class
        Singleton instance4 = Singleton.INSTANCE;
        instance4.connection();
        Singleton instance5 = Singleton.INSTANCE;
        instance5.connection();
        if(instance4 == instance5){
            System.out.println("Enum singleton Objects are same");
        }
    }
}
