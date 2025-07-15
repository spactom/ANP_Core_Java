//Q. Write a Java program to demonstrate method overloading by creating a class
//   Calculator with multiple add() methods that accept different parameter types.

package ANP;

// Not public because only one public class allowed per file
class Calculatr {

    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two double numbers
    double add(double a, double b) {
        return a + b;
    }

    // Add one int and one double
    double add(int a, double b) {
        return a + b;
    }

    // Add one double and one int
    double add(double a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculatr calc = new Calculatr();

        System.out.println("add(10, 20) = " + calc.add(10, 20));
        System.out.println("add(10, 20, 30) = " + calc.add(10, 20, 30));
        System.out.println("add(5.5, 4.5) = " + calc.add(5.5, 4.5));
        System.out.println("add(10, 3.5) = " + calc.add(10, 3.5));
        System.out.println("add(4.5, 5) = " + calc.add(4.5, 5));
    }
}


//Output :
//	
//	add(10, 20) = 30
//	add(10, 20, 30) = 60
//	add(5.5, 4.5) = 10.0
//	add(10, 3.5) = 13.5
//	add(4.5, 5) = 9.5

