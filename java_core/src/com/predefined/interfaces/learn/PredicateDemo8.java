package com.predefined.interfaces.learn;

import java.util.Objects;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo8 {
	
	public static void main(String []args)
	{
		/*I am testing 2 conditions here using carPredicate1 and carPredicate2  so instead of writing the condition inside the if()  can  check this both conditions using the Predicate method>>>> and<T>  
		 * if(carPredicate1 && carPredicate2)
		 * { print("Purchase it!!!") }
		 * else 
		 * {print("Not purchase it!!!")}
		 * */
		Predicate<CarRecordsDemo8> carPredicate1 = demo -> demo.price()<=450000;     
		Predicate<CarRecordsDemo8> carPredicate2 = demo -> demo.kmRange()>450;
		
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		Double price = sc.nextDouble();  
		Integer kmRange = sc.nextInt();
		
		CarRecordsDemo8 customer1 = new CarRecordsDemo8(name, price, kmRange);
		
	boolean isCarPrice  =	carPredicate1.test(customer1);   
 	boolean isKmRange   =	carPredicate2.test(customer1);	
 		
 		if(isCarPrice && isKmRange) 
 		{
 			System.out.println("Purchase it ");
 		}
 		else {
 			System.out.println("Dont Purchase it \n Price is"+isCarPrice + "\nKm Range: "+isKmRange);
 		}
 		
 	/*Another way is to use */		    // Observe the pattern and learn		
 		                               //  Predicate<T> and(Predicate<? super T> other)	
 		Predicate<CarRecordsDemo8> andlast = carPredicate1.and(carPredicate2);
 									//	 True && True   >>> True 
 		
 		CarRecordsDemo8 carShow = new CarRecordsDemo8("MG Window", 1000000D , 500);
 		
 		Predicate<CarRecordsDemo8> and0 = car-> car.price()<=450000D && car.kmRange()<450;
 		
 		boolean andeavour = and0.test(carShow); 
 		System.out.println( "endavour: " +andeavour); 

 		boolean isInBudget = andlast.test(carShow);   
 		
 		if(isInBudget) 
 		{
 			System.out.println("Purchase the car!!");
 		}
 		else {
 			
 			System.out.println("Do not purchase the car!!");
 		}
 		
 		/*  [and]
 		default Predicate<T> and(Predicate<? super T> other) {
        Objects.requireNonNull(other);
        return (t) -> test(t) && other.test(t);
    }
 		 * */
 		
 		
 		
 		//Try these below as well.
 		
 		
 	/*  [not]	
 		  @SuppressWarnings("unchecked")
 		    static <T> Predicate<T> not(Predicate<? super T> target) {
 		        Objects.requireNonNull(target);
 		        return (Predicate<T>)target.negate();
 		    }
 		*/ 
 		
 		
 		
 		
 		
 	/* [isEqual]	
 	 *  static <T> Predicate<T> isEqual(Object targetRef) {
        return (null == targetRef)
                ? Objects::isNull
                : object -> targetRef.equals(object);
    }  
 	 
 	 * */
 		
 		
 	/* [or]
 	 *  default Predicate<T> or(Predicate<? super T> other) {
        Objects.requireNonNull(other);
        return (t) -> test(t) || other.test(t);
    }
 	 * */
 		
 	/*  [negate]      
 	 *  default Predicate<T> negate() {
        return (t) -> !test(t);
    	}
 	 * 
 	 * */	
 		
	}

	private static Predicate<CarRecordsDemo8> not(Predicate<CarRecordsDemo8> and) {
		// TODO Auto-generated method stub
		return null;
	}
	

}

