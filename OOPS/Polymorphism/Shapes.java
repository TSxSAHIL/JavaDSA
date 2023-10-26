// Polymorphism -> Poly means many and morphism mean ways to represent

/* 
    If a language does'nt support ploymorphsim  its not an OOP
    Act of representing the same thing in multiple ways

    Types of Polymorphism 
    1. Compile Time Polymorphism or Static Polymorphism -> This can be achieved via method overloading
    -> Same name of method but types, arguments and return types can be different
    *Example Multiple Constructors* ->
    A a = new A();
    A b = new A(3,4);
    This will look for which constructor to call at compile time

    2.  
*/

public class Shapes {
    void area() {
        System.out.println("I am in Shapes");
    }
    public static void main(String[] args) {
        Shapes s = new Shapes();
        Circle c = new Circle();
        Triangle t = new Triangle();
        Rectangle r = new Rectangle();
        
        s.area();
        t.area();
        r.area();
        c.area();
    }
}

class Circle extends Shapes {
    void area() {
        System.out.println("Area is pi * r * r");
    }
}

class Triangle extends Shapes {
    void area() {
        System.out.println("Area is 0.5 * l * b");
    }
}

class Rectangle extends Shapes {
    void area() {
        System.out.println("Area is l * b");
    }
}
