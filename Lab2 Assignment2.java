//Q. Create a superclass Animal with a method makeSound().
//   Create two subclasses Dog and Cat that override the method.

package ANP;

// Superclass
class Animall {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog extending Animall
class Dog extends Animall {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass Catt extending Animall
class Catt extends Animall {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class Overriding {
    public static void main(String[] args) {
        Animall a1 = new Animall(); // Object of Animall
        Animall a2 = new Dog();     // Dog object as Animall
        Animall a3 = new Catt();    // Catt object as Animall

        a1.makeSound(); // Output: Animal makes a sound
        a2.makeSound(); // Output: Dog barks
        a3.makeSound(); // Output: Cat meows
    }
}

//Output :
//	Animal makes a sound
//	Dog barks
//	Cat meows


