package presentation;
import dao.IDao;
import metier.IMetier;

import java.io.*;
import java.lang.reflect.Method;
import java.util.Scanner;


public class pres2 {
    public static void main(String[] args) throws Exception{
        Scanner scanner=new Scanner(new File("config.txt"));

        String daoClassname=scanner.next();
        Class cdao=Class.forName(daoClassname);
        IDao dao=(IDao) cdao.newInstance();

        String metierClassName=scanner.next();
        Class cmetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cmetier.getConstructor(IDao.class).newInstance(dao);

        //Method meth=cmetier.getMethod("setDao",IDao.class);
        //meth.invoke(metier,dao);
        System.out.println(metier.calcul());
    }
}
