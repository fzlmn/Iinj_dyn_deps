package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class MetierImpl implements IMetier {
    @Autowired
    private IDao dao;
    @Override
    public double calcul() {
        double data = dao.getData();
        double result = data * 9.72;
        return result;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
