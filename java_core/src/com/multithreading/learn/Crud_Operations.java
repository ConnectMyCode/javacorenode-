package com.multithreading.learn;

public class Crud_Operations {

	
/* 
	 CRUD Operation :
--------------------------
package com.ravi.crud_operation;

import java.util.List;
import java.util.Vector;

record Product(Integer id, String name, Double price, Integer quantity)
{    
}

class ShoppingCart
{
   private String name;
   private List<Product> listOfProducts;
   
   public ShoppingCart(String name)
   {
       this.name = name;
       listOfProducts = new Vector<>(); //Composition
       
   }
   
   public void addProduct(Product product)
   {
       listOfProducts.add(product);
       IO.println("Product Object added successfully");
   }
   
   public void displayAllTheProducts()
   {
       for(Product product : listOfProducts)
       {
           IO.println(product);
       }
   }
   
   public void updateProductQuantity(Integer id, Integer newQuantity)
   {
       boolean isFound = false;
       
       for(int i=0; i<listOfProducts.size(); i++)
       {
           if(listOfProducts.get(i).id().equals(id))
           {
               listOfProducts.set(i, new Product(listOfProducts.get(i).id(), listOfProducts.get(i).name(), listOfProducts.get(i).price(), newQuantity));
               IO.println("Product Quantity Updated");
               isFound = true;
               break;
           }
       }
       
       if(!isFound)
       {
           IO.println("Product with "+id+" is not available");
       }
       
   }
   
   public void deleteProduct(Integer id)
   {        
       for(Product product : listOfProducts)
       {
           if(product.id().equals(id))
           {
               listOfProducts.remove(product);
               IO.println("Product with "+id+" is deleted....");
               break;
           }
       }    
   }
}


public class CRUDOperation {

   public static void main(String[] args)
   {
       String cartName = IO.readln("Enter your shopping cart name :");
       ShoppingCart myntra = new ShoppingCart(cartName);
       
       while(true)
       {
           IO.println("1) Add Product to cart..");
           IO.println("2) Display all the Products..");
           IO.println("3) Update Product Quantity...");
           IO.println("4) Delete Product Object from the Cart...");
           IO.println("5) Exit from the Application...");
           
           Integer choice = Integer.valueOf(IO.readln("Enter your Choice"));
           
           switch(choice)
           {
           case 1 ->
           {
               Integer id = Integer.valueOf(IO.readln("Enter Product id :"));
               String name = IO.readln("Enter Product Name :");
               Double price = Double.valueOf(IO.readln("Enter Product Price :"));
               Integer qty = Integer.valueOf(IO.readln("Enter Product Quantity :"));
               
               Product product = new Product(id, name, price, qty);
               myntra.addProduct(product);
               
           }
           
           case 2->
           {
               myntra.displayAllTheProducts();
           }
           
           case 3 ->
           {
            Integer id = Integer.valueOf(IO.readln("Enter Product id to update :"));
               Integer qty = Integer.valueOf(IO.readln("Enter new Quantity :"));                
               myntra.updateProductQuantity(id, qty);            
           }
           
           case 4->
           {
        Integer id = Integer.valueOf(IO.readln("Enter Product id to delete :"));
        myntra.deleteProduct(id);
           }
           
           case 5->
           {
               IO.println("Existing from the application");
               System.exit(0);
           }
           default ->
           {
               IO.println("Invalid Choice");
           }            
           
           }        
       }

   }

}
	 
	 
	 */
	
	
}
