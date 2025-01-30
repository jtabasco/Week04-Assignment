package Week04;

import java.util.Arrays;

public class assignments {

	public static void main(String[] args) {
	
 	//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; // declares an array of integers and initializes it
		
		//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
			System.out.println("Result of subtract the value of the first element in the array from the value in the last element of the array ages:");
			System.out.println(ages[0]-ages[ages.length-1]); // Subtract first element of the last element and print to the console
		
		//b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
			int[] ages2 = Arrays.copyOf(ages, 9); // declares an array of integers and copy from array ages
				
		//i. Make sure that there are 9 elements of type int in this new array.  
			System.out.println("1.i- Length of the array ages2: "+ages2.length); // show the length of the array to the console.
			
		//ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
			System.out.println("1.ii- Result of subtract the value of the first element in the array from the value in the last element of the array ages2:");
			System.out.println(ages2[0]-ages2[ages2.length-1]); // Subtract first element of the last element and print to the console
			
		//iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
			//The dynamic aspect lies in how you use the indices, it can consistently access elements based on their
			//position within the array, regardless of the array's total size. This flexibility allows  to write code 
			//that works with arrays of varying lengths without needing to change the core logic of how  access elements.
			// ex.
			// two array different types different size
			
			 int[] intArray = {2,2,3,5,8,6,9,7}; // declares an array of integers and initializes it
			 String[] stringArray = {"Joel","Joanne"}; // declares an array of string and initializes it
			 
			// Accessing elements at the same relative index (first element)
			 int firstElementInt =intArray[0]; // Access to the first element of the array
			 String firstElementString=stringArray[0]; //Access to the first element of the array
			 
			// Accessing elements at different indices
			 int thirdElementInt =intArray[2]; //Access to the third element of the array
			 String secondElementString=stringArray[1]; //Access to the second element of the array
			 
			 // Accessing the last element of an array
			 int lastElementInt =intArray[intArray.length-1]; // Access to the last element of the array
			 String lastElementString=stringArray[stringArray.length-1]; //Access to the last element of the array
			 
			 
			 
		//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
			int sumOfAge =0; // declares an integer and initializes it
			for(int age : ages) { // loop to iterate over data 
				sumOfAge+=age; // the sum of the data is accumulated
			}
			System.out.println("1.c- The average of age is: " + sumOfAge/ages.length); // show in console the average of array
			
	//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
			String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"}; // declares an array of string and initializes it
			
		//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		     int countOfLetters =0; // declares an integer and initializes it
		     for(String string : names) { // loop to iterate over data 
		    	 countOfLetters+=string.length(); //The number of letters in the word is counted and accumulated in the variable
		     }
		     System.out.println("2.a- The average of letters per name is: " + countOfLetters/names.length); // show in console the average of letters per name
		     
		//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		     String concatNames =""; // declares an string and initializes it
		     for(String string : names) {// loop to iterate over data 
		    	 concatNames+=string+" "; //concatenates array strings separated by space
		     }
		     System.out.print("2.b- All the names together: ");
		     System.out.println(concatNames.substring(0, concatNames.length()-1)); // print on the screen removing the last space
		     
	//3. How do you access the last element of any array?
		// To access the last element of an array, the .length function is used which returns the size of the array and 
		// subtract 1, because all arrays have their first index is 0 (ex. nameArray[nameArray.length-1]
		     
	//4. How do you access the first element of any array?
		// To access the first element of any array, index 0 is used since all arrays start at index 0 (ex. nameArray[0];)
		     
	//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		 int[] nameLengths = new int[names.length]; // declares an array of integers 
		 for (int i=0;i<names.length;i++) {// loop to iterate over data 
			 nameLengths[i]=names[i].length(); //initializes the array with the length of the each string in the array names 
		 }
		 
	//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		 int sumOfNameLength=0; // declares an integer and initializes it
		 for(int num : nameLengths) {// loop to iterate over data 
			sumOfNameLength+=num; // sum all the elements in the array 
		}
		 System.out.println("6.- Sum of all elemnts in de array: "+ sumOfNameLength); // print to console the sum of array
		 
	//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		String word="National"; // declares an string and initializes it
		int n =4; // declares an integer and initializes it
		String concatNWord = concatenatedNTimesWord(word,n); // call the method with the parameter and store in string 
		// validate that the result is equal to "" to change what to print
		System.out.println(concatNWord!="" ? "7.- Concatened "+n+" times the word "+word+": "+concatNWord : "7.- Nothing to concat");
		
	//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		String firstName="John"; // declares an string and initializes it
		String lastName="Tabasco"; // declares an string and initializes it
		System.out.println("8.- Full name: "+fullName(firstName,lastName)); // call the method to get the full name
		
	//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		System.out.println("9- Sum of de array greater than 100: "+sumOfTheArray(ages));// call the method and print the answer
		
	//10. Write a method that takes an array of double and returns the average of all the elements in the array.
		double[] numDouble= {100.36,26.33,48.25,50.20,20.33,45.11};  // declares an array of double and initializes it
		System.out.println("10.- Average off the array: "+averageOfArray(numDouble)); // call method and print result
		
	//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		double[] numDouble2 = {20.45,80.25,45.12,88.0,44.21}; // declares an array of double and initializes it
		System.out.println("11.- Average of the first array is greater than the average of the secund array: "+isAverageFirstArrayGreatThanSecundArray(numDouble,numDouble2)); // call method and print result
		
	//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		boolean isHotOutside = true; // declares an boolean and initializes it
		double moneyInPocket= 10.51; // declares an double and initializes it
		System.out.println("12.- Is hot outside and if moneyInPocket is greater than 10.50: "+willBuyDrink(isHotOutside,moneyInPocket)); // call the method and print
		
	//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		 /* Problem
		  * We have an array of integers with the result of 6 evaluations
		  * There are three requirements to pass
		  * 1. The average of the first three evaluations must be greater than or equal to 3
		  * 2. The sum of evaluations 4 and 5 must be greater than or equal to 6
		  * 3. Last Evaluation Greater Than 3
		  * 
		  * To solve the problem, two methods were created, one of them that responded to the first two requirements
		  * and a second method that evaluated everything and decided whether it was approved or not.
		  * 
		  * requirement method: sum the array pass as a parameter and and depending 
		  * on the second parameter return a boolean if average>=3 or sum>=6
		  * 
		  * isApproved method: call the requirement method and evaluate all condition are true and return
		  *  Approved or Disapproved
		  */
		
		int[] evaluations = {5,3,2,2,4,4}; //declares an array of integer and initializes it
		System.out.println("Result of your grade pass: " +isApproved(evaluations));
	}

	private static boolean requirement(int[] subArray, int req) {// declares a method named requirement that return a boolean value
		int result =0; // declares an integer and initializes it
		for (int i : subArray) {// loop to iterate over data 
			result+=i; 
		}
		if(req==1) {// first requirement: average >3
			return (result/subArray.length)>=3 ? true : false;
		}else { //
			return (result)>=6 ? true : false;
		}
		
	}
	private static String isApproved(int[] evaluations) {// declares a method named isApproved that return a boolean value
		int[] evalOneToThree =Arrays.copyOfRange(evaluations, 0, 3); //declares an array of integer and copy of three firsts values
		int[] evalFourAndFive=Arrays.copyOfRange(evaluations, 3, 5); //declares an array of integer and copy of two values index 3 and 4
		// We create the method that works for me for the first two requirements by passing a parameter to control its response
		return (requirement(evalOneToThree,1) && requirement(evalFourAndFive,2) && evaluations[evaluations.length-1]>3) ? "Approved" : "Disapproved" ;
	}



	private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {// declares a method named willBuyDrink that return a boolean value
		return (isHotOutside && moneyInPocket>10.50) ? true :false; //make a comparison and return true or false 
	}

	private static boolean isAverageFirstArrayGreatThanSecundArray(double[] numDouble1, double[] numDouble2) {// declares a method named isAverageFirstArrayGreatThanSecundArray that return a boolean value
		//call averageOfArray with the two array and comparison the result 
		return averageOfArray(numDouble1)>averageOfArray(numDouble2) ? true : false; 
	}

	private static double averageOfArray(double[] numDouble) {// declares a method named averageOfArray that return a double value
		double result=0; // declares an double and initializes it
		   for(double num : numDouble) { // loop to iterate over data 
			   result+=num; //sum all the elements in the array 
		   }
		return result/numDouble.length; //return the average of the array
	}

	private static boolean sumOfTheArray(int[] ages) {// declares a method named sumOfTheArray that return a boolean value
		int result=0; // declares an double and initializes it
			for(int i : ages) {// loop to iterate over data 
				result+=i; //sum all the elements in the array 
			}
				
		return result>100 ? true : false; //make a comparison and return true or false
	}

	private static String fullName(String firstName, String lastName) {// declares a method named fullName that return a string value
		return firstName+" "+lastName; //return a Concatenated string
	}

	private static String concatenatedNTimesWord(String word, int n) {// declares a method named concatenatedNTimesWord that return a string value
		String result =""; // declares an string and initializes it
			for (int i=1;i<=n;i++) {// loop to iterate over data 
			  result+=word;	// Concatenated n times the string 
			}
		return result; //return the string
	}

}
