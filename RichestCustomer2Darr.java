package leetCodeDSA;

import java.util.Arrays;

public class RichestCustomer2Darr {
    
    public static void main(String[] args) {
        
        int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        
        int[] sumArr = new int[accounts.length];
        
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0; // Initialize sum for each row
            
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j]; // Accumulate the sum of each element in the row
            }
            
            sumArr[i] = sum; // Store the sum in the result array
        }
        
        // Print the sumArr
//        for (int sum : sumArr) {
//            System.out.println(sum);
//        }
//        
        //print highest value
        
        int max = Arrays.stream(sumArr).max().getAsInt();
        System.out.println(max);
    }
}

