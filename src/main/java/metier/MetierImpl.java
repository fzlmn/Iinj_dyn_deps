package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
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
