class Box {
    double l;
    double h;
    double w;
    static void greeting(){
        System.out.println("i am in box greeting");
    }

    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    // cube
    Box (double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l , double h , double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.h = old.h;
        this.l=old.l;
        this.w = old.w;
    }

    public void displayInfo(){
        System.out.println("Running the box");
    }

    public static void main(String[] args) {
        Box b1 = new Box(4,5.6,0.3);
        // Box b2 = new Box(b1);
        b1.greeting();
        //you can inherit but you cannot override
        // System.out.println((int)b1.l + " " + (int)b1.h + " " +(int) b1.w);

        Weight weight =  new Weight(2,3,4,5);
        // System.out.println((int)weight.h + " " + (int)weight.l+ " " + (int)weight.w + " "+(int)weight.we);

        Box box  =  new Weight(2,3,4,5);
        // System.out.println((int)box.w + (int)box.h + (int)box.l);

        Price price = new Price(0.5, 55, 45, 4201, 12);
        // System.out.println((int)price.cost + " " + (int)price.h + " " + (int)price.l + " " + (int)price.we+ " " +(int)price.w);
    }
}
//Single Level Inheritance
class Weight extends Box{
    double we;
    public Weight(){
        this.we=-1;
    }
    public Weight(double h , double l , double w , double we){
        super(l,h,w); //call the parent class constructor
        // used to initialize values present in parent class 
        this.we = we;
        System.out.println((int)super.w);
        // we are using this super because if the child class also has a parameter called w then it might be a confusion for the user.
    }

    Weight(Weight other){
        super(other);
        we = other.we;

    }
}
//Multi Level Inheritance
class Price extends Weight{
    double cost;
    Price(){
        super();
        this.cost = 1;
    }
    Price(Price other){
        super(other);
        this.cost = other.cost;
    }
    Price(double l , double h , double w , double we , double cost){
        super(h, l, w, we);
        this.cost = cost;
    }
}

//Multiple Inheritance isnt allowed in java because ambiguity arises.

//Hierarchial Inheritance -> One Class Inherited with Multiple classes
/*
            A
        ____|____
       |    |    |
       B    C    D
 */


/*
    Hybrid Inheritence -> Combination of single and multiple Inheritance
    Not in Java 
    can be done using interfaces
 */