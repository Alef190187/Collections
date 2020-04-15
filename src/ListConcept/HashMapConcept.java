package ListConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {

		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Selenium");
		map.put(2, "Test");
		map.put(3, "QTP");
		System.out.println("content of hashmap==>"+map);
		map.remove(3);
		System.out.println("content of hashmap==>"+map);
		map.put(3, "QTP");
		System.out.println("content of hashmap==>"+map);
		map.replace(3, "RestAssured");
		System.out.println("content of hashmap==>"+map);
		
		System.out.println(map.get(3));
		//get all the values by using for loop.
		for(Entry<Integer, String> m :map.entrySet()) {
			System.out.println(m.getKey() +"  "+ m.getValue());
		}
		
		
		//create Hashmap
		HashMap<Integer, Employee> emp= new HashMap<Integer,Employee>();
		// Create employee class object and initialize the construtor.
		Employee e = new Employee("Alif", 25, "QA");
		Employee e1= new Employee("Khan", 45, "Admin");
		Employee e2 = new Employee("Peter", 50, "Dev");
		emp.put(100, e);
		emp.put(101, e1);
		emp.put(102, e2);
		
		//get all the employee information
		
		for(Entry<Integer, Employee> m :emp.entrySet()) {
			int key = m.getKey();
			System.out.println(key + " Employee Info" );
	     Employee employee = m.getValue();
	     System.out.println(employee.name+" "+ " "+ employee.age+ " "+ employee.dept);
		}
	}

}
