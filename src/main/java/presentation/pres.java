package presentation;
import metier.MetierImpl;
import dao.DaoImpl;
import ext.DaoImpl2;
public class pres {
    public static void main(String[] args) {
        DaoImpl dao=new DaoImpl();
        MetierImpl metier=new MetierImpl(dao); //L'injection via : Le constructeur

        metier.setDao(dao);

        //metier.setDao(new DaoImpl2());
        System.out.println(metier.calcul());
    }
}
