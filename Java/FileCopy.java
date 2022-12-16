import java.io.*;
public class FileCopy {
    public static void main(String[] args){
        try {
            FileInputStream fr = new FileInputStream("C:\\Users\\vshlk\\OneDrive\\Desktop\\Image_created_with_a_mobile_phone.png");
            FileOutputStream fw = new FileOutputStream("Copy1.png");

            int i=0;
            while((i=fr.read())!=-1){
                fw.write(i);
            }
            fr.close();
            fw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
