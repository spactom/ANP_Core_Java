//Q.  Write a program to declare stack.Store 10 elements into it.Remove
//    4 elements from stack and display it.

package ANP;

import java.util.Stack;

public class StackExa {

	public static void main(String[] args) {

		// Step 1: Declare a stack
		Stack<Integer> st = new Stack<>();

		// Step 2: Store 10 elements into it
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		st.push(70);
		st.push(80);
		st.push(90);
		st.push(100);

		// Step 3: Display the original stack
		System.out.println("Original Stack: " + st);

		// Step 4: Remove 4 elements from stack using pop()
		st.pop(); // removes 100
		st.pop(); // removes 90
		st.pop(); // removes 80
		st.pop(); // removes 70

		// Step 5: Display the stack after popping 4 elements
		System.out.println("Stack after removing 4 elements: " + st);
	}
}

//Output:
//
//	Original Stack: [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
//	Stack after removing 4 elements: [10, 20, 30, 40, 50, 60]
