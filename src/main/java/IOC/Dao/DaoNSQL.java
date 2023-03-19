package IOC.Dao;

public class DaoNSQL implements  IDao{
    @Override
    public double getData() {
        System.out.println("From No Sql DB");
        return 10;
    }
}
