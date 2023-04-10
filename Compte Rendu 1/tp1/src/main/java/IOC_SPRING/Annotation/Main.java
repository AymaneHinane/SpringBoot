package IOC_SPRING.Annotation;

import IOC.Dao.IDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        SQL.class,MetierV3.class
                );

        MetierV3 metier =  context.getBean(MetierV3.class);
        System.out.println("R: "+metier.calcul());

    }
}
