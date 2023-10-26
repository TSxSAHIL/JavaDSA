// Polymorphism -> Poly means many and morphism mean ways to represent

/* 
    If a language does'nt support polymorphsim  its not an OOP
    Act of representing the same thing in multiple ways

    Types of Polymorphism 
    1. Compile Time Polymorphism or Static Polymorphism -> This can be achieved via method overloading
    -> Same name of method but types, arguments and return types can be different
    *Example Multiple Constructors* ->
    public class Numbers {
        void sum(int a ,  int b){
            System.out.println(a+b);
        }
        void sum(int a , int b, int c){
            System.out.println(a+b+c);
        }
        public static void main(String[] args) {
            int a = 10;
            int b = 2;
            int c = 4;
            
            Numbers n = new Numbers();
            n.sum(a, b, c);
            n.sum(a, b);
        }
    }
    This will look for which constructor to call at compile time

    2.  Runtime Polymorphism / Dynamic Polymorphism -> Achieved by method overriding 
    Parent obj = new Parent();
    //hence which method will be called depends on This is known as Upcasting.
    This is overriding
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
    // this will run when object of circle is created
    // hence it is overriding the parent method
    @Override // this is called annotation
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