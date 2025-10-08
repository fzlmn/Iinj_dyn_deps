package dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version BD");
        double data = 34;
        return data;
    }
}
