package solidpriciples.dependencyInversion;

public class OracleDB implements DataBaseInterface{

    @Override
    public void getConnection(){
        System.out.println("Oracle DB gets connected");
    }

    @Override
    public void disconnected(){
        System.out.println("Oracle DB disconnected");
    }
}
