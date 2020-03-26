package application;

import java.util.HashSet;
import java.util.Locale;

import aula2603.Admin;
import aula2603.Divisions;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Divisions div = new Divisions('a',"Primeiro");
		Admin admin1 = new Admin();
		admin1.addNewDivision(div);
//		System.out.println(admin1.toString());
		
		
//		HashSet<Admin> admins = new HashSet<Admin>();
//		Divisions newDivision = new Divisions((char) 1,"Primeiro");
//
//		admins.add(new Admin().addNewDivision(newDivision));
//		System.out.println(admins);

	}

}
