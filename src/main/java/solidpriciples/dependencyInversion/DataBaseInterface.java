package solidpriciples.dependencyInversion;

public interface DataBaseInterface {
    void getConnection();
    void disconnected();
}
