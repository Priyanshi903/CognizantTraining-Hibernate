package com;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CountryMain {

	@SuppressWarnings({ "unchecked", "deprecation" })
	public static void main(String[] args) {

		CountryDAO countryDaoImpl = new CountryDAOImpl();
		Scanner sc = new Scanner(System.in);

		int choice = 0;
		do {
			System.out.println("1.Retreive Single Country\n2.Update Country\n3.Insert Country\n"
					+ "4.Delete Country\n5.Retrieve All Countries\n6.Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				countryDaoImpl.retreiveSingleCountry();
				break;
			case 2:
				countryDaoImpl.updateCountry();
				break;
			case 3:
				countryDaoImpl.insertCountry();
				break;
			case 4:
				countryDaoImpl.deleteCountry();
				break;
			case 5:
				countryDaoImpl.retrieveAllCountries();
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("Wrong Choice");
			}
			
		} while (choice != 6);

	}

}
