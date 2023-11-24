package Client;

import BL.Product;

public class testerproduct1_array {

	public static void main(String[] args) {
		
//		int [] arr=new int[5];
		
		Product [] shop=new Product [5];
		
		Product p1=new Product(1, 120, "Copy", 1);
		shop[0]=p1;
		Product p2=new Product(2, 500, "Marker", 5);
		shop[1]=p2;
		Product p3=new Product(3, 1000, "Toys", 5);
		shop[2]=p3;
		Product p4=new Product(4, 10, "Pen", 1);
		shop[3]=p4;
		Product p5=new Product(5, 150, "Colour box", 1);
		shop[4]=p5;
		
		for (int i=0;i<shop.length;i++)
		{
			if (shop[i]!=null)
			{
				shop[i].display();
			}
		}
		
		

	}

}
