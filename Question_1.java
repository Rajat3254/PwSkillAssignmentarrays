import java.util.Scanner;
public class Question_1{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter no. of element in array: ");
    int n=sc.nextInt();
    int []arr=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
   int ans[]=new int[n];
   int m=0;
   for(int i=0;i<arr.length;i++){
    if(arr[i]>=0){
        ans[m]=arr[i];
        m++;
    }
   }
   for(int i=0;i<n;i++){
    if(arr[i]<0){
        ans[m]=arr[i];
        m++;
    }
   }
   System.out.println("as given condition say sorted array is: ");
   for(int j=0;j<n;j++){
    System.out.print(ans[j]+" ");
   }
}
}