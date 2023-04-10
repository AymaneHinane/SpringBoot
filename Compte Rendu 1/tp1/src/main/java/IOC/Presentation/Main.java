package IOC.Presentation;

import IOC.Dao.DaoImpl;
import IOC.Dao.DaoNSQL;
import IOC.Metier.MetierImpl;

public class Main {

    public static  void main(String[] args)
    {
        MetierImpl metier = new MetierImpl();

        DaoImpl sql  = new DaoImpl();
        DaoNSQL nosql = new DaoNSQL();

       // metier.setDao(sql);
        metier.setDao(nosql);

        double result = metier.calcul();

        System.out.println("Result est: "+result);
    }
}
