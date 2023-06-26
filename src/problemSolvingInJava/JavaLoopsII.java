package problemSolvingInJava;

import java.util.*;
import java.util.ArrayList;

public class JavaLoopsII{
	
    public static void main(String []args){
    	
        Scanner in = new Scanner(System.in);
        
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
        //  create a arraylist to store value 
            ArrayList<Integer> arr = new ArrayList<>();
            
            int sum = a+b;
            arr.add(sum);
            
        //  for loop to add a+b
            for(int index = 1; index < n; index++){
                sum += Math.pow(2,index)*b;
                arr.add(sum);
            }
            
        // print the arr
            for(int num : arr){
                System.out.print(num + " ");
            }
            
            System.out.println();
        }
        in.close();
    }
}

