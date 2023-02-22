package solidpriciples.dependencyInversion;

public class MainClass {
    public static void main(String[] args) {
        //DataBaseInterface dataBaseInterface = new MySQLDB();
        DataBaseController dataBaseController = new DataBaseController(new MySQLDB());
        dataBaseController.connectDB();
        dataBaseController = new DataBaseController(new OracleDB());
        dataBaseController.connectDB();
    }
}
