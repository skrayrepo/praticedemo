package solidpriciples.dependencyInversion;

public class DataBaseController {
    private DataBaseInterface dataBaseInterface;
    DataBaseController(DataBaseInterface dataBaseInterface){
        this.dataBaseInterface= dataBaseInterface;
    }
    public void connectDB(){
        dataBaseInterface.getConnection();
    }
    public void disconnectDB(){
        dataBaseInterface.disconnected();
    }
}
