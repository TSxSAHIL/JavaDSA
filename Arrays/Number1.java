public class Number1 {
    public static void main(String[] args) {
        // Hamm(0000000101010000);
        System.out.println(Hamm(00000000000000000000000000001011));
    }

    static int Hamm(int n){
        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem==1){
                count++;
            }
            n /= 10;
        }
        return count;
    }
}
