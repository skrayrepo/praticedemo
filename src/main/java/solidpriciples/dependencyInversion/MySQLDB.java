package solidpriciples.dependencyInversion;

public class MySQLDB implements DataBaseInterface{

    @Override
    public void getConnection(){
        System.out.println("MYSQL DB gets connected");
    }

    @Override
    public void disconnected(){
        System.out.println("MySQL DB disconnected");
    }
}
