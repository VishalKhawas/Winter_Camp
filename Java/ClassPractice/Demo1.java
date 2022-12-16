package ClassPractice;

import java.util.*;

public class Demo1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter 1 or 2: ");
        int a = sc.nextInt();
        int result=n;
        if(a==1){
            for(int i=n-1; i>0; i=i-2){
                result=result+i;
            }
            for(int i=n-2; i>0; i=i-2){
                result=result-i;
            }
        }
        else{
            for(int i=n-1; i>0; i=i-2){
                result=result-i;
            }
            for(int i=n-2; i>0; i=i-2){
                result=result+i;
            }
        }
        System.out.println(result);
    }
}
