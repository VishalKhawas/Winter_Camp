public class CharOccur {
    public static void main(String[] args){
        String s="missisipi";
        int len=s.length();
        String str = s.replaceAll("i","ii");
        int lenf=str.length();
        System.out.println(lenf-len);
    }
}
