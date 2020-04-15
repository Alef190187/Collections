package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

       LinkedList<String> ll = new LinkedList<String>();
       ll.add("test");
       ll.add("selenium");
       ll.add("QTP");
       System.out.println("the content of linkedlist ==>"+ ll);
       System.out.println("the size of linkedlist ==>"+ ll.size());
       
       ll.addFirst("Alef");
       ll.addLast("Uddin");
       System.out.println("the content of linkedlist ==>"+ ll);
       ll.add(0, "Khan");
       System.out.println("the content of linkedlist ==>"+ ll);
       System.out.println("the first value==>"+ ll.getFirst());
       System.out.println("the first value==>"+ ll.get(0));
       ll.set(0, "alif");
       System.out.println("the first value==>"+ ll.get(0));
       System.out.println("the content of linkedlist ==>"+ ll);
       ll.remove(0);
       System.out.println("the content of linkedlist ==>"+ ll);
       
       //getting values from the linkedlist
       
       //using for loop
       System.out.println("******using for loop****");
       for(int n=0; n<ll.size(); n++) {
    	   System.out.println("values are ==>"+ll.get(n));
       }
       //advance for loop
       System.out.println("******using advance for loop****");
       for(String str: ll) {
    	   System.out.println("values are ==>"+str);
       }
       //iterator
       System.out.println("******using iterator****");
       Iterator<String> it = ll.iterator();
       while(it.hasNext()) {
    	   System.out.println(it.next());
       }
       
       //while loop.
       System.out.println("******using while loop****");
       
       int num =0;
       while(ll.size()>num) {
    	   System.out.println(ll.get(num));
    	   num++;
    	   
       }
       
	}

}
