package com.Sophia.web.hibernate.test;

import java.util.Date;
import java.util.List;
import java.awt.Font;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Sophia.web.hibernate.bean.Cat;
import com.Sophia.web.hibernate.util.HibernateUtil;


public class CatTest {

	public static void main(String[] args){
		Cat mother = new Cat();
		mother.setName("Mary White");
		mother.setDescription("The Mama cat.");
		mother.setCreateDate(new Date());
		
		Cat kitty = new Cat();
		kitty.setMother(mother);
		kitty.setName("Kitty");
		kitty.setDescription("Hello Kitty. ");
		kitty.setCreateDate(new Date());
		
		Cat mimmy = new Cat();
		mimmy.setMother(mother);
		mimmy.setName("Mimmy");
		mimmy.setDescription("Kitty's little twin sister . ");
		mimmy.setCreateDate(new Date());
		
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction trans = session.beginTransaction();
		session.persist(mother);
		session.persist(kitty);
		session.persist(mimmy);
		
		@SuppressWarnings("all")
		List<Cat> catList = session.createQuery(" from Cat ").list();
		
		StringBuffer result = new StringBuffer();
		result.append("All Cats in the database\r\n\r\n");
		
		for(Cat cc: catList){
			result.append("Cat"+ cc.getName() + ". ");
			result.append("Its Mother is " +(cc.getMother()==null ? "unknown" : cc.getMother().getName()));
			result.append("\r\n");
		}
		
		trans.commit();
		session.close();
		
		
		JOptionPane.getRootFrame().setFont(new Font("Arial", Font.BOLD, 14));
		JOptionPane.showMessageDialog(null, result.toString());
		
	}
}
