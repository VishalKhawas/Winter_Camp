public class StringBufferReverse {
    public static void main(String[] args){
        StringBuffer str = new StringBuffer("vishalkhawas");
        str.reverse();
        str.delete(4,10);
        System.out.println(str);
    }
}
