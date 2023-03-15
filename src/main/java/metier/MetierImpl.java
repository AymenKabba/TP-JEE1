package metier;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier {

    /*Couplage faible*/
    private IDao dao;

    public MetierImpl(IDao dao){
        this.dao=dao;
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 66;
        return res;
    }
/* Setter pour injection des dépendances */
    public void setDao(IDao dao){
        this.dao=dao;
    }
}