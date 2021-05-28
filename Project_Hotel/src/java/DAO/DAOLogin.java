/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJOHotel.HotelUtil;
import POJOHotel.TblAdmin;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ADMIN
 */
public class DAOLogin {
    public List<TblAdmin> getBy(String username, String password){
        Transaction trans = null;
        TblAdmin us = new TblAdmin();
        List<TblAdmin> admin = new ArrayList();
        
        Session session = HotelUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from TblAdmin where username=: username AND password=: password");
            query.setString("username", username);
            query.setString("password", password);
            us = (TblAdmin) query.uniqueResult();
            admin = query.list();
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        } 
        return admin;
    }
    
    public void add_user(TblAdmin admin)
    {
        Transaction trans = null;
        Session session = HotelUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            session.save(admin);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
