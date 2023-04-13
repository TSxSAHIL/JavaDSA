import java.util.*;

public class Jav {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input for the size of array 1
        System.out.print("Enter the size of array 1: ");
        int size1 = sc.nextInt();
        
        // Declare array 1 of the desired size
        int a1[] = new int[size1];
        
        // Take input for the elements of array 1
        System.out.print("Enter the elements of array 1: ");
        for(int i = 0; i < size1; i++){
            a1[i] = sc.nextInt();
        }
        
        // Take input for the size of array 2
        System.out.print("Enter the size of array 2: ");
        int size2 = sc.nextInt();
        
        // Declare array 2 of the desired size
        int a2[] = new int[size2];
        
        // Take input for the elements of array 2
        System.out.print("Enter the elements of array 2: ");
        for(int i = 0; i < size2; i++){
            a2[i] = sc.nextInt();
        }
        
        // Initialize a count variable to 0
        int count = 0;
        
        // Iterate over both arrays and count the number of matching elements
        for(int i = 0; i < size2; i++){
            for(int j = 0; j < size1; j++){
                if(a1[j] == a2[i]){
                    count++;
                }
            }
        }
        
        // Print the count of matching elements
        System.out.println("Number of matching elements: " + count);
    }
}
