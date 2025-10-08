package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, FileNotFoundException {
        Scanner sc = new Scanner(new File("config.txt"));
        String daoClassname = sc.nextLine();
        Class cDao = Class.forName(daoClassname);
        IDao dao = (IDao) cDao.getConstructor().newInstance();
        System.out.println(dao.getData());

        String metierClassname = sc.nextLine();
        Class cMetier = Class.forName(metierClassname);
        IMetier metier = (IMetier) cMetier.getConstructor().newInstance();

        Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class);
        setDao.invoke(metier, dao); //injection des dependences

        System.out.println("Resultat : " + metier.calcul());
    }

}
