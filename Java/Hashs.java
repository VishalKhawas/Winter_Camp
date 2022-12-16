import java.util.*;

public class Hashs {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        System.out.println(set);

        if(set.contains(30)){
            System.out.println("Present");
        }
        else{
            System.out.println("Absent");
        }

        set.remove(20);
        System.out.println(set);
    }
}
