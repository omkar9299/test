package com.itemBiller;

import java.util.Scanner;

public class Item {
         private int id,price,quantity;
         private String name;
         
        public Item()
        {
        	name="";
        	id=0;
        	price=0;
        	quantity=0;        	
        }
        
        public void setItem(Scanner sc) 
        {
          System.out.println("Enter Name Of Product:");
          name=sc.nextLine();
          
          System.out.println("Enter Product Id:");
          id=sc.nextInt();
          
          System.out.println("Enter Product Price:");
          price=sc.nextInt();
          
          System.out.println("Enter Product Quantity:");
          sc.nextInt();	       	
        }
        
        @Override
        public String toString() 
        {
        	return	"Product Name \n"+name+"Product Id\n"+id+"Product Price\n"+price
            +"Product Quantity"+quantity ;
            }
  
        
        
        
        
        
}
