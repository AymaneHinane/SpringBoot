package IOC_SPRING.Annotation;

import IOC.Dao.IDao;
import IOC.Metier.IMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierV3 implements IMetier {
    @Autowired
    IDao dao;
    @Override
    public double calcul() {
        double d = dao.getData();
        return d*2021;
    }
}
