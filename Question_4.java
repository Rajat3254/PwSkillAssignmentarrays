import java.sql.PseudoColumnUsage;
import java.util.Scanner;
public class Question_4 {
   static Scanner sc=new Scanner(System.in);
    static void loopforinput(int[]arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void main(String[] args) {
        System.out.print("enter no.of element of array1:");
        int n=sc.nextInt();
        System.out.print("enter no. of element of array2: ");
        int m=sc.nextInt();
        int[] arr_1=new int[n];
        System.out.println("enter the elements of array1: ");
        loopforinput(arr_1);
        int[]arr_2=new int[m];
        System.out.println("enter elements of array_2: ");
        loopforinput(arr_2);
        boolean output=true;
        for(int j=0;j<m;j++){
        if(arr_1[j]!=arr_2[j]){
            output=false;
            break;
        }

    }
    System.out.println(output);
}
    
}
