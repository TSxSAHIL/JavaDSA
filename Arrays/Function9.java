public class Function9 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            a=99;//this means it is updating the values of initialised integer value.
            //int a =78; already initialised outside the block in the same methord hence uh cannot initialise it again but uh can change it again.
            int c = 34;
            //values initialised in this block, will remian in the block only
            System.out.println(c);
        }
        System.out.println(a);
        //System.out.println(c); cannot use outside the block
    }
    static void random(){
        int num = 67;
        System.out.println(num);
    }
}
