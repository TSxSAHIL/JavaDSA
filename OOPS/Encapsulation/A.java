/*
    -> Encapsulation means wrapping up the implementation of the data members & methods inside a class.
    -> Abstraction means hiding the unnecssary details and showing valueable information.

    -> Example 
    -> Starting of a car (how the engine mechanism is working we dont care it is abstraction)
    -> Abstraction -> design level issue (Process of gaining info)
    -> Encapsulation -> implementation level issue (Process of containing info)

 */

/*
    -> Data Hiding is focused on data security.
    -> Encapsulation is focused on hiding complexity of system.
    -> encapsulation is a sub process in data hiding.
 */
public class A{
    private int num;
    String name;
    int [] arr;

    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }
    A(){
        this.num = num;
        this.name = name;
        this.arr = new int[3];
    }
    A(int num , String name){
        this.num = num;
        this.name = name;
        this.arr = new int[4];
    }

    public static void main(String[] args) {
        A obj = new A(34, "Sahil");
        A obj2 = new A();
        /*
            need to do few things
            1. access the data members
            2. modify the data members
        */ 

        System.out.println(obj.num);
        System.out.println(obj2.num);
    }
}