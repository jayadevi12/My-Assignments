package week3.homeassign;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> company = new ArrayList<String>();
company.add("HCL");
company.add("Wipro");
company.add("Aspire Systems");
company.add("CTS");

System.out.println("Add the Companies name: " +company);

//sort
Collections.sort(company);
for(int i=company.size()-1; i>=0; i--)
{
	System.out.println(company.get(i));
}
	}

}
