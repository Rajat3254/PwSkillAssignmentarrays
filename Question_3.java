import java.util.*;
public class Question_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of element of array: ");
        int n=sc.nextInt();
        System.out.print("enter value of k: ");
        int k=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("element of arrays are: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("THe"+" "+ k+"th smallest element in inputed array is: ");
        System.out.print(arr[k-1]);

        
        
    
}
}

