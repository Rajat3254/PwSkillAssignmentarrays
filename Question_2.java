import java.util.Scanner;
public class Question_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("The number of element in array_1: ");
        int m=sc.nextInt();
        System.out.print("The number of element in array_2: ");
        int n=sc.nextInt();
        int []arr_1=new int[m];
        System.out.print("Elements of array1 are: ");
        for(int i=0;i<arr_1.length;i++){
            arr_1[i]=sc.nextInt();
        }
        int[]arr_2=new int[n];
        System.out.print("Elements of array2 are: ");
        for(int i=0;i<arr_2.length;i++){
            arr_2[i]=sc.nextInt();
        }int count=0;
        for(int i=0;i<n;i++){
            if(arr_1[i]==arr_2[i]){
                count++;
            }
        }
        if(count==0){
            int ans=m+n;
            System.out.print("The union array will contain"+" "+ans+" "+"Elements");

        }else{
            System.out.print("The union array will contain ");
            System.out.print(m);
            System.out.println("Elements");
        }
   

    }

    
}
