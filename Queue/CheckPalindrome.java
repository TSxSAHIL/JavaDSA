public class CheckPalindrome{
    public static void main(String[] args) {
        String st = "abcbc";
        StringBuilder sb = new StringBuilder();

        for(int i = st.length()-2 ; i>=0;i--){
            sb.append(st.charAt(i));
        }
        System.out.println(sb);
    }
}