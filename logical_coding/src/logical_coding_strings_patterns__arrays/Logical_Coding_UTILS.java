package logical_coding_strings_patterns__arrays;
import java.util.*;

class Logical_Coding_UTILS
	{
	
	Scanner user = new Scanner(System.in); 
	
	
	
	public static void fibonnact_Series(int digit)
	{
			int i=0 , j=1; 
			int sum=0;
		System.out.println(i+" "+j+" ");
			
			for(int count=0; count<digit; count++){			
				sum=i+j;
				System.out.println(sum);
				i=j;
				j=sum;
			}
	}
	
	public static boolean find_Armstrong(int number){
		int temp = number;
		int product=0; 
		while(temp!=0){    //156
			int ld = temp%10; //6
			product += Math.pow(ld,3);
			temp = temp/10;
		}				
		if(number== product){
			System.out.println("IT is a Armstrong Number:" + number);
			return true; 
			}
		else{
			System.out.println("IT is not a armstrong number" + number);
			return false;
		}
		
	}
	
	
	public static void factorial(int value){
		int temp = value;
		System.out.println("Factoials of"+value+ "are: ");		
		for(int i=1 ; i<=temp ; i++){
			if(temp%i==0){
				System.out.println(i+" , ");
			} 
		}
	}
	
	
	public static void prime_no(int integer){
		int temp = integer;
		
		byte count = 0;
		
		for(byte i = 2; i<=temp ; i++){
			if (temp%i==0)
			{
				count++;
			}
		}
		if(count>2){
			System.out.println("It is not pime number");
		}
		else{
			System.out.println("It is a prime number"+integer);
		}
		
		
	} 
	
	public static boolean palindrome_no(int num33) {
		
		int temp = num33; //111
		int rev = 0;
		while(temp!=0) 
			{
				int ld = temp%10;
				rev = rev*10+ld;
				temp = temp/10; 
			}
		if(rev == num33)
			return true;
		else
			return false;
		}
	
	public static int reverse_num(int straight_num){
		
		int temp= straight_num; 
		
		int rev=0;
		
			while(temp!=0){
				
				int ld = temp%10;
				rev = rev*10+ld;
				
				temp=temp/10;
				
			}
			System.out.println(temp);
			return rev; 
			
		
	}  
	
	
	public static int count_and_sum_of_digits(int digit){
		
		int temp_1= digit;
			
		int count = 0; 
		int sum=0;
		
		while(temp_1!=0){
			
			int ld=temp_1%10;
			sum+=ld;
			temp_1 = temp_1/10;
			count++;
		}
		System.out.println( digit+"Sum:"+ sum);
		return count; 
	}
	
	public static boolean strong_number(int strong_num){
		
		int temp = strong_num;
		int sum = 0;
		while(temp!=0){
			int ld =temp%10;
			int product =1; 
			for(int j= ld;j>0;j--){
				product=product*j;
			}
			temp = temp/10;
			
			sum+= product;
		}
		
		if(sum == strong_num){
			System.out.println("This is a strong num"+sum);
			return true;
		}
		else{
			System.out.println("This is not a strong num"+sum);
			return false;
		}
		
	}
	
	
	//Explained ✅
	public static int find_hcf(int num1, int num2){
		int N=num1;
		int D=num2;
		int remainder=1; 
		   
		while(remainder!=0){
			remainder=N%D;
			N=D;
			D=remainder;
		}
		System.out.println("HCF:");
		return N; //HCF
	}
	
	public static int find_lcm(){
		return 0;
	} 
	
/*---------------------------------------------------------------------------------------------*/
//ARRAYS

	
	public static int[] large_small_element_of_Array(int[] arr){	
		int small =arr[0]; 
		int large = 0;
		int second_large=0;
			for(int i=0;i<arr.length; i++){ //java.lang.ArrayOutOfBoundException 
			if(small>arr[i]){
				small = arr[i];
			}
			if(large<arr[i]){
				second_large = large;  //Saving 2nd large element in array. 
				large = arr[i];
				
			}
		}
		
		int[] temp_Arr={small,large,second_large};      
	
		System.out.println(temp_Arr[0]+" "+temp_Arr[1]+" "+temp_Arr[2]); 
	
		return temp_Arr;
	}
	
//If I want to find the 3rd/4th large/small element then I have to sort the array and take out the 3rd/4th large/small element from array. 


	//ARRAY REVERSE 
	public static char[] reverse_array(char[] Aree_rere)
	{
		int j= Aree_rere.length-1;
		char[] temp_Arr;        //Creating an Empty array       
		temp_Arr = new char[9]; //Declaring the mength of an Empty array creating object of the Array class.   
		for(int i =0; i<Aree_rere.length-1/2;i++){     //arr.lenght-1 = 8 // arr.legth =9
			if(i!=j){
				temp_Arr[i]=Aree_rere[i];
				Aree_rere[i]=Aree_rere[j];
				
				Aree_rere[j]=temp_Arr[i];
			}
			if(i==j){
					for(int k=0;k<Aree_rere.length;k++)
						{
						System.out.println(Aree_rere[k]);
						}	
			}
			j--;
		}
		//THis loop is for printing the values of the array;
		System.out.println("\n"+"Array:");
			return Aree_rere;
		}
		
		
	//Array Sorting in ascending order;       
	public static	int[] sort_Array(int[] Arr){
		
		int[] temp_Arr={};
		temp_Arr = new int[Arr.length];
		
		int l =Arr.length-2; 
		System.out.println("length"+l);
		for(int i=0 ; i<Arr.length-2; i++){
			for(int j=i+1; j<Arr.length-1;j++){ //j<l-i >>>>>
				if(Arr[i] < Arr[j]){
					temp_Arr[i] = Arr[i];
					Arr[i] =Arr[j];
					Arr[j]=temp_Arr[i];
				}
			/*	if(Arr[i] == Arr[j]){
					temp_Arr[i]=Arr[i];
					Arr[i] = Arr[j];
					Arr[j] = Arr[i];
				}*/    
			
			}
			}
			if(Arr[Arr.length-2] > Arr[Arr.length-1]){
				temp_Arr[0]=Arr[Arr.length-2];
			Arr[Arr.length-2] = Arr[Arr.length-1];
			Arr[Arr.length-1] = temp_Arr[0];
			
			}
			
			
			
				for(int k = 0;k<Arr.length;k++){
					System.out.println(Arr[k]);
					}
					return Arr;
			
			}
		
	//ARRAY find DUPLICATE ELEMENT IN ARRAY [];     //Array seize is Fixed It cannot be changed Dynamically as per the input from user comes and the size automatically increases is not possible . 
	//ARRAYLIST IS used in IT industry to overcome this limitation. 	
	public static int[] duplicate_Element_In_Array(int[] array){
		int array_length = array.length; //n
		
		int[] copy_array = {};
		copy_array = new int[array_length]; 
		int q =0;
		for(int i = 0 ; i< array_length-2 ; i++){
			for(int j =i+1; j<array_length-1; j++){
				if(array[i] == array[j]){
					copy_array[q] = array[i];
					q++; //copy_array can store  number in continous so gave it a new index.
				}	
			}
		}
		
		for(int k= 0 ; k < copy_array.length; k++){
			System.out.println(copy_array[k]);
		}
		return copy_array;
	}
	
	//Sum of array elements 
	public static int sum_Of_Array_Elements(int[] array_sum){
		int sum= 0;
		int n = array_sum.length-1; //length of an array
		for(int i = 0 ; i<=n; i++){
			sum+=array_sum[i];
		} 
		return sum; 
		
	}

	
	//Count no. odds and evens in array. 
	public static int[] count_odd_even(int[] array){
		int count_odd =0;
		int count_even=0;
		for(int i=0; i<array.length-1;i++){
			if(array[i]%2==0){
				count_even++;
			} 
			else{
				count_odd++;
			}
		} 
		
		int[] return_array = new int[2];
		
		
		return_array[0]=count_even; 
		return_array[1]=count_odd;
		System.out.println(Arrays.toString(return_array));	
		//IO.println(return_array);
		return return_array;
				}
	
	
	
/*STRINGS----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	
	//Reverse a String: 
	public static String reverse_String(String text){
		int length_Of_String = text.length();
		System.out.println("string length:"+length_Of_String);
		String empty_String=" ";
		for(int i=length_Of_String-1;i>=0;i--){
			char character_out_of_string = text.charAt(i);
			System.out.println(character_out_of_string);
			empty_String +=character_out_of_string;  
		}
		System.out.println("Reverse_string"+empty_String);
		
		return "abv";      
	} 
	
	
	//Check Wether a string is palindrome or not. when reversed it is eqaul tot he straight word e.g, madam, racecar,level; 
	public static String palindrome_String_Checking(String palindrome_string){
		
		int length_of_string = palindrome_string.length();
		String empty_reverse_string="";
	
		for(int j=length_of_string-1;j>=0;j--){
			char pop = palindrome_string.charAt(j);
			empty_reverse_string += pop;
			//System.out.println(empty_reverse_string);
		}
		if(palindrome_string.equalsIgnoreCase(empty_reverse_string)){
			System.out.println("It is a palindrome string  : "+empty_reverse_string);
		}
		else{
			System.out.println("No this is not a palindrome string  : "+empty_reverse_string);
		}
		return "sss";
	}
	
	
	//Count vowels and consonants in a string; 
	
	public static int count_Vowels_Consonants_In_String(String texts){
		int countVowels = 0; 
		int countConsonants=0; 
		int textLength = texts.length();
		for(int i = textLength-1; i>=0;i--){
			char singleAlphabet = texts.toLowerCase().charAt(i);   
			if(singleAlphabet =='a' || singleAlphabet =='e'){     
				countVowels++;
			}
			else if(singleAlphabet =='i' || singleAlphabet =='o'){
				countVowels++;
			}
			else if(singleAlphabet =='u') 
			{
				countVowels++;
			}
			else{                  
				countConsonants++;  
			}
		}
		System.out.println("Consonants: "+countConsonants);
		System.out.println("Vowels:"+countVowels);  
		return 5;
	}
	
	
	//Count characters, words, spaces
	public static String countWordsSpacesCharractersInStringData(String sentence){ 
		String newSentenceInLowerCase = sentence.toLowerCase();  
		int sentenceLength = sentence.length(); 
		
		int charactersCount = 0;
		int wordsCount = 0;
		int spaceCount = 0;
		for(int k=sentenceLength-1; k>=0 ;k--){
			char  characters = newSentenceInLowerCase.charAt(k);  
			if(characters==' '){
				spaceCount++;
			}
		}
		
		//No. of Spaces
		System.out.println("Space Counts:"+spaceCount);
		
		//No.of characters
		charactersCount = sentenceLength - spaceCount;  
		System.out.println("Number of characters:"+charactersCount);
		
		//No. of words 
		wordsCount = spaceCount+1;
		System.out.println("Number of words"+wordsCount);
		
		return "abc";
	}   
	
	
	
	
	
	
	
	
	
	
	
	
	/*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	
	//Converting lowercase to uppercase.  
	public static String uppercase_alpha(String su){ 
		String s1=su.toUpperCase();
		//System.out.println(s1);    
			//Any Airthemetic operation with a char Gives an integer value  in return and that cant be stroed in char type 
			//char final_converted = (char)convert;  		 				//. Only character can be stored in char datatype
			//System.out.println(final_converted);    
		
		return s1;
	}
}
	
	

	
	
 	
		
	
		
	
	

				








