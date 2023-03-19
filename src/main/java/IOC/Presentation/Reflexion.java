package IOC.Presentation;
import IOC.Dao.IDao;
import IOC.Metier.IMetier;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Reflexion {

      public static void main(String[] args) throws FileNotFoundException,
              ClassNotFoundException, InstantiationException, IllegalAccessException,
              NoSuchMethodException, InvocationTargetException {

          Scanner sc = new Scanner(new File("src/main/java/IOC/config.txt"));

          String dao = sc.nextLine();
          System.out.println(dao);
          Class clsDao = Class.forName(dao);
          IDao objDao = (IDao) clsDao.newInstance();

          String metier = sc.nextLine();
          Class clsMetier = Class.forName((metier));
          IMetier objMetier = (IMetier) clsMetier.newInstance();

          Method method = clsMetier.getMethod("setDao",IDao.class );
          method.invoke(objMetier,objDao);

          System.out.println(objMetier.calcul());
    }
}
