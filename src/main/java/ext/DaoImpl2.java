package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {

    @Override
    public double getData() {
        System.out.println("version capteurs");
        double data=66;
        return data;
}
}
