import java.util.*;
public class Experiment_Card {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of cards: ");
        int num = sc.nextInt();

        HashMap<String, HashSet<Integer>> map = new HashMap<>();

        while(num!=0){
            System.out.println("Enter name of card: ");
            String s = sc.next();
            HashSet<Integer> set= new HashSet<>();
            System.out.println("Enter number of cards "+s+": ");
            int n = sc.nextInt();
            System.out.println("Enter values of cards: ");
            while(n!=0){
                int setVal = sc.nextInt();
                set.add(setVal);
                n--;
            }

            map.put(s,set);
            num--;
        }
        for (Map.Entry<String, HashSet<Integer>> e : map.entrySet()) {
            Iterator it = e.getValue().iterator();
            int sum=0;
            while(it.hasNext()){
                Integer i = (Integer) it.next();
                sum = sum + i;
            }
            System.out.println("Name: " + e.getKey() + " Number: " + e.getValue().size() + " Sum: " + sum);
        }
    }
}
