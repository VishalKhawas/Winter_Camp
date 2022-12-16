package Assignment2;
import java.util.Scanner;

public class Qsn3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s;
        do {
            s=sc.nextLine();
            s=s.trim();
            if(!s.equals("done")){
                if(s.charAt(0)==s.charAt(s.length()-1)){
                    System.out.println("First and last character equal");
                }
                else{
                    System.out.println("First and last character are not equal");
                }
            }
        }while(!s.equals("done"));
    }
}
