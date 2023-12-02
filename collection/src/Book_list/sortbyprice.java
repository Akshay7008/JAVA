package Book_list;

import java.util.Comparator;

public class sortbyprice implements Comparator<List_book>
{

	@Override
	public int compare(List_book o1, List_book o2) 
	{
		if (o1.getPrice()<o2.getPrice())
			return -1;
		else if (o1.getPrice()>o2.getPrice())	
			return 1;
		else
		return 0;
	}
	
}
