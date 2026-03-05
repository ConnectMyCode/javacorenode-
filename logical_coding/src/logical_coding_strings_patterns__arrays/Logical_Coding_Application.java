package logical_coding_strings_patterns__arrays;  
import java.util.*;
public class Logical_Coding_Application { 
 
	public static void main(String Args[])     //This is java-21  so write (String args[])   inside the paranthesis so that it a proper main()  method. 
{
	//fIBONNACI SERIES 	
	Logical_Coding_UTILS.fibonnact_Series(10);
	
	//Armstrong_number
	Logical_Coding_UTILS.find_Armstrong(100); 
	
	//Factorial
	Logical_Coding_UTILS.factorial(35);
	
	//prime_no,,,
	Logical_Coding_UTILS.prime_no(36);
	
	//Palindrome 
	System.out.println(Logical_Coding_UTILS.palindrome_no(111));
		
	//Reversed number
	System.out.println(Logical_Coding_UTILS.reverse_num(0000));
	
	// Counting and Sum of Digits
	System.out.println(Logical_Coding_UTILS.count_and_sum_of_digits(12345));
	
	//Strong NUmber
	Logical_Coding_UTILS.strong_number(40586);

	//HCF of 2 numbers 
	System.out.println(Logical_Coding_UTILS.find_hcf(118,96));
	
	
	//Arrays large and sma;l element. 
	int[] arrr={9,1,4,0,5,10,7,8,9,-1,99, -100,-1000};
	System.out.println(Logical_Coding_UTILS.large_small_element_of_Array(arrr));
	

	//Array Reversing using temporary array;
	char[] alphas = {'Z','Y','X','W','V','U','T','S','R'};
	System.out.println(Logical_Coding_UTILS.reverse_array(alphas));   
	
	//Sort Array
	int[] array ={5,2,9,1,5,6,-1,80,99, 0 ,0,-9999,9999}; 
	System.out.println(Logical_Coding_UTILS.sort_Array(array));
	
	//Duplicate elements in array	
	int[] array_arg = {10,20,30,20,40,40,50,60,70,80,100,90,100,90,10,90,90,90}; 
	System.out.println(Logical_Coding_UTILS.duplicate_Element_In_Array(array_arg));
	
	//Sum of array elements
	int[] array_sum = {10,20,30,40,50,60,70,80,90};
	System.out.println(Logical_Coding_UTILS.sum_Of_Array_Elements(array_sum));
	
	//*Count odd and even numbers in an array. 
	int[] array_ex = {10,44,33,22,11,17,16,19};
	System.out.println(Logical_Coding_UTILS.count_odd_even(array_ex)); 
	
	
/*----Modified: 27-01-26 BY:Aryan*/
	
	//Reverse A String.                           
	String __user__input = "LOVE A CHANCE";
	System.out.println(Logical_Coding_UTILS.reverse_String(__user__input));
	
	
	//Checking if a String is a Palindrome or not ; 
	String palindrome_string = "level"; 
	System.out.println(Logical_Coding_UTILS.palindrome_String_Checking(palindrome_string));
		
	
	//Counting Vowels , Consonants in a string: 
	String keyboard_input = "Vowels_and_Consonants";
	System.out.println(Logical_Coding_UTILS.count_Vowels_Consonants_In_String(keyboard_input));
	
	String su = "aryan";                                         
	System.out.println(Logical_Coding_UTILS.uppercase_alpha(su)); 
	
	String sentence = "JOYFULL HAPPY ECSTATIC IS NATURAL";
	String sent ="aryan ooh cool" ;     //length-spaces = characters = 13  || after each Space if another word is there then add wordCount++>>> words = 3 ; ||if(" " == text){spaceCount++} spaces=2    
	System.out.println(Logical_Coding_UTILS.countWordsSpacesCharractersInStringData(sentence));
	
	
	// Source - https://stackoverflow.com/q
// Posted by nutellafella, modified by community. See post 'Timeline' for change history
// Retrieved 2026-01-14, License - CC BY-SA 3.0
	
}

}


