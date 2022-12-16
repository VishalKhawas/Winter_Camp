package Assignment3;

import java.util.Scanner;

public class Qsn2 {
    public static void rotate(int arr[], int k){
        int n=arr.length;
        int[] elem=new int[k];
        for(int i=0; i<k; i++){
            elem[i]=arr[n-k+i];
        }
        for(int i=n-1; i-k>=0; i++){
            arr[i]=arr[i-k];
        }
        for(int i=0; i<k; i++){
            arr[i]=elem[i];
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter size of array: ");
        n=sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before rotation:");
        for(int x:arr) System.out.print(x+" ");
        System.out.println("\n");

        System.out.print("Enter by how many places to rotate: ");
        int k=sc.nextInt();

        rotate(arr, k);

        System.out.println("After rotation:");
        for(int x:arr) System.out.print(x+" ");
    }
}
