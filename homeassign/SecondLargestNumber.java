package week3.homeassign;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<Integer> l1 = new ArrayList<Integer>();
		 
		 l1.add(3);
		 l1.add(2);
		 l1.add(11);
		 l1.add(4);
		 l1.add(6);
		 l1.add(7);
		 
		 System.out.println(l1);
		 
		 Collections.sort(l1);
		 for(int i=0; i<l1.size();i++)
		 {
			 System.out.println(l1.get(i));
		 }
		 
		 
		 System.out.println("Second Largest number:" +l1.get(4));
		 
	}

}
