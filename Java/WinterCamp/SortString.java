package WinterCamp;

import java.util.ArrayList;

public class SortString {
    public static void main(String[] args){
        ArrayList<String> str = new ArrayList<>();
        str.add("abc");
        str.add("aac");
        str.add("vzi");

        for(int i=0; i<str.size(); i++){
            for (int j=i+1; j<str.size(); j++){
                if(str.get(i).compareTo(str.get(j))>0){
                    String temp=str.get(i);
                    str.set(i, str.get(j));
                    str.set(j, temp);
                }
            }
        }
        System.out.println(str);
    }
}
