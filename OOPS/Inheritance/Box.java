class Box {
    double l;
    double h;
    double w;

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
        System.out.println(b1.l + " " + b1.h + " " + b1.w);

        Weight weight =  new Weight(2,3,4,5);
        System.out.println(weight.h + " " + weight.l+ " " + weight.w + " "+weight.we);

        
    }
}

class Weight extends Box{
    double we;
    public Weight(){
        this.we=-1;
    }
    public Weight(double h , double l , double w , double we){
        super(l,h,w); //call the parent class constructor
        // used to initialize values present in parent class 
        this.we = we;
    }

}

