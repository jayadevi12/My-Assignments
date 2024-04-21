package week3.homeassign;

//import java.awt.List;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ints = new ArrayList<Integer>();
	

ints.add(1);
ints.add(2);
ints.add(3);
ints.add(4);
ints.add(10);
ints.add(6);
ints.add(8);

System.out.println(ints);

System.out.println("Sorted array elements:");
Collections.sort(ints);
System.out.println(ints);
System.out.println(ints.size());


for(int i=1; i<ints.size(); i++)
{
	 if (ints.get(i) - ints.get(i-1) == 1) {

     } else {
         System.out.println("Missing number is " + (ints.get(i-1) + 1));
         ints.add((ints.get(i-1)+1));
         Collections.sort(ints);
     }
     i++;
     
}
System.out.println(ints);
	}
}