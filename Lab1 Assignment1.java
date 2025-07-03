package ANP;

public class Maxnum {

	public static void main(String[] args) {
//		Q: Write a Java program to find the maximum number in an integer array.

//		
//		int num1= 23;
//		int num2= 124;
//		
//		int max = (num1 > num2 ) ? num1:num2; // using ternary operator
//		System.out.println("Maximum number is: " + max);
//		
//		int max = Math.max(num1, num2); // using inbuilt function 
//		System.out.println("Maximum number is: " + max);
		
		// using array 
		int[] numbers = {12, 45, 7, 89, 34};

        int max = numbers[0];  // assume first element is max

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];  // update max if current is greater
            }
        }

        System.out.println("Maximum number is: " + max);
			
	  }

	}

//Output :
//	
//	Maximum number is: 89

