/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.IDao;
import entities.Machine;
import entities.Salle;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Hibernate;
import services.MachineService;
import services.SalleService;
import util.HibernateUtil;

/**
 *
 * @author Ismail
 */
public class Test {

    public static void main(String[] args) {
        SalleService ss=new SalleService();
        MachineService ms=new MachineService();
        Salle s1=new Salle("TestWEB");
        ss.create(s1);
            
        for(Salle s:ss.findAll()){
                System.out.println(s);
            }    

        ms.create(new Machine("WEB1", "TEST", 3000,s1));
        ms.create(new Machine("WEB2", "TEST", 2000,s1));
        ms.create(new Machine("WEB3", "TEST", 4000,s1));
        for(Machine m: ms.findAll()){
            System.out.println(m);        
            System.out.println(ms.findById(38));
    }
    }
}
