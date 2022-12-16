package WinterCamp;

public class StringvsBuffer {
    public static void main(String[] args){
        String s1=new String("Hello");
//        s1.concat(" World");
        String s11=new String("Hello");
        System.out.println(s1==s11);
        System.out.println(s1.equals(s11));

        StringBuffer s2=new StringBuffer("Hello");
//        s2.append(" World");
        StringBuffer s22=new StringBuffer("Hello");
        System.out.println(s2==s22);
        System.out.println(s2.equals(s22));
    }
}
