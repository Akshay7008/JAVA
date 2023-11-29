package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_List {

	public static void main(String[] args) {
		
		
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(50);
		l1.add(40);
		l1.add(10);
		
		for (int no:l1)
		{
			System.out.println(no);
		}
		
		Collections.sort(l1);
		
		for (int no:l1)
		{
			System.out.println(no);
		}
		

	}

}
