package IOC_SPRING.Annotation;

import IOC.Dao.IDao;
import org.springframework.stereotype.Component;

@Component
public class SQL implements IDao {
    @Override
    public double getData() {
        return 7;
    }
}
