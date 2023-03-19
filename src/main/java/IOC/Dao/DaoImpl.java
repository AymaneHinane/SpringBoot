package IOC.Dao;

public class DaoImpl implements  IDao{
    @Override
    public double getData() {
        System.out.println("From Sql DB");
        return 7;
    }
}
