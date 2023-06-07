package com;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class CountryDAOImpl implements CountryDAO {
	static SessionFactory sf;
	static {
		sf = new Configuration().configure().buildSessionFactory();
		
	}

	@Override
	public void retreiveSingleCountry() {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter country code to be searched");
		String code=sc.nextLine();
		Country country=session.find(Country.class,code);
		session.close();
		if(country!=null) {
			System.out.println(country.getName());
		}
		else {
			System.out.println("Country not available");
		}
		
	}

	@Override
	public void updateCountry() {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter country code");
		String code=sc.nextLine();
		System.out.println("Enter new country name ");
		String new_c_name=sc.nextLine();
		Country country=session.find(Country.class,code);
		if(country!=null) {
			country.setName(new_c_name);
			session.update(country);
			trans.commit();
			session.close();
			System.out.println(country.getCode()+"\t"+country.getName());
		}
		else {
			System.out.println("Country not available");
		}
	
	}

	@Override
	public void insertCountry() {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter country code");
		String code=sc.nextLine();
		System.out.println("Enter country name");
		String c_name=sc.nextLine();
		Country country=new Country(code,c_name);
		session.save(country);
		trans.commit();
		session.close();
		System.out.println("Country Saved!!!");
	}

	@Override
	public void deleteCountry() {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter country code to be deleted");
		String code=sc.nextLine();
		Country country=session.find(Country.class,code);
		if(country!=null) {
			session.remove(country);
			trans.commit();
			session.close();
			System.out.println("Country Deleted");
		}
		else {
			System.out.println("Country not available");
		}
			
		session.close();
	}

	@Override
	public void retrieveAllCountries() {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Query<Country> q=session.createQuery("select c from Country c");
		List<Country> countryList=q.list();
		session.close();
		countryList.stream().forEach(System.out::println);
	}

}
