public class String1 {
    public static void main(String[] args) {
        String str = "Arora";
        isPalindrome(str);
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        str=str.toLowerCase();
        int start = 0;
        int end = str.length();

        while(start<end){
            if(start==end){
                return true;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
