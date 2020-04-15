package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//the size of arraylist is dynamic.
		ArrayList ar = new ArrayList();
		ar.add("Alif");
		ar.add("Khan");
		ar.add(101);
		
		System.out.println("the size of the arraylist is ==>"+ ar.size());
		System.out.println("the content of the arraylist is ==>"+ ar);
		//get all the values from a arraylist you must use--1. for loop and 2.iterator.
		
		ar.add(12.4);
		System.out.println("the size of the arraylist is ==>"+ ar.size());
		for(int i= 0; i<ar.size(); i++) {
			System.out.println("the values of the arraylist==>" +ar.get(i));
		}
		//only store integer values
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		ar1.add(200);
		for(int i =0; i<ar1.size(); i++) {
			System.out.println("the values=="+ ar1.get(i));
		}
		
		//only store String values
				ArrayList<String> ar2 = new ArrayList<String>();
				ar2.add("Test");
				ar2.add("Selenium");
				for(int i =0; i<ar1.size(); i++) {
					System.out.println("the values=="+ ar2.get(i));
				}
				
				//create employee object and initialize the constructor.
				Employee e = new Employee("Alif", 33, "QA");
				Employee e1 = new Employee("Sigma", 23, "Dev");
				Employee e2 = new Employee("Khan", 55, "Admin");
				//create arraylist
				ArrayList<Employee> ar3 = new ArrayList<Employee>();
				ar3.add(e);
				ar3.add(e1);
				ar3.add(e2);
				//use iterator to get all the values.
				Iterator<Employee> it = ar3.iterator();
					
				while(it.hasNext()) {
					Employee emp=it.next();
					System.out.println("Employee name=>" +emp.name);
					System.out.println("Employee age=>" +emp.age);
					System.out.println("Employee department=>"+ emp.dept);
					
				}
				System.out.println("***********************************");
				ArrayList<Object> ar4 = new ArrayList<Object>();
				ar4.add("Test");
				ar4.add("QTP");
				ar4.add(2020);
				for(int i= 0; i<ar4.size(); i++) {
					System.out.println("values ==>" +ar4.get(i));
				}
				//addAll used to add all values into a arraylist object.
				System.out.println("***********************************");
				ArrayList<Object> ar5 = new ArrayList<Object>();
				ar5.add("DevOps");
				ar5.add("Selenium");
				ar5.add(2022);
				ar4.addAll(ar5);
				for(int i= 0; i<ar4.size(); i++) {
					System.out.println("values ==>" +ar4.get(i));
				}
				
				System.out.println("***********************************");
				ar4.removeAll(ar5);
				for(int i= 0; i<ar4.size(); i++) {
					System.out.println("values ==>" +ar4.get(i));
				}
				//retainAll used to get common value in two array.
				System.out.println("***********************************");
				ArrayList<Object> ar6 = new ArrayList<Object>();
				ar6.add("DevOps");
				ar6.add("Selenium");
				ar6.add(2022);
				
				
				ArrayList<Object> ar7 = new ArrayList<Object>();
				ar7.add("MGR");
				ar7.add("Selenium");
				ar7.add(2023);
				ar7.retainAll(ar6);
				for(int i= 0; i<ar7.size(); i++) {
					System.out.println("values ==>" +ar7.get(i));
				}
	}

}
