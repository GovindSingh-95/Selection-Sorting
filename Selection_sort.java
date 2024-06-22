import java.util.*;
public class Selection_sort{
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter size of the Array: ");
        int n=Sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter your Array: ");
        for(int i=0;i<n;i++)
            arr[i]=Sc.nextInt();
        System.out.println("Entered Array is: ");
        print(arr);
        int limit=0;
        for(int round=0;round<n;round++){
           for(int i=limit;i<n;i++){
               if(arr[i]<arr[limit]){
                   int temp=arr[limit];
                   arr[limit]=arr[i];
                   arr[i]=temp;
               }
           }
           limit++;
        }
        System.out.println("Sorted Array is: ");
        print(arr);
    }
    static void print(int[] arr){
        for(int ele:arr) System.out.print(ele+" ");
        System.out.println();
    }
}
