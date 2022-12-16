package Assignment3;

public class Qsn1 {

    public static void main(String[] args){
        int[] arr={1,0,1,0,1,1,0,0,0,0,1,1,0};
        int[] freq= new int[2];
        for(int i:arr){
            freq[i]++;
        }
        int i;
        for (i=0; i<freq[0]; i++){
            arr[i]=0;
        }
        for(; i<freq[1]+freq[0]; i++){
            arr[i]=1;
        }
        for (int j:arr) {
            System.out.print(j+" ");
        }
    }
}
