import java.util.*;
class Video{
    String title;
    boolean[] flag=new boolean[10];
    int[] user_rating=new int[10];
    void checkedOut(int i)
    {
        if(flag[i]==true)
            flag[i]=false;

    }
    void checkedIn(int j)
    {
        if(flag[j]==false)
            flag[j]=true;

    }
    void receive_a_rating(int n,int no)
    {
        user_rating[n]=no;
    }
}
class VideoStore extends Video
{
    Video obj=new Video();
    String[] videos=new String[10];
    int[] rate=new int[10];
    int i=0;
    void addVideo(String title)
    {
        videos[i++]=title;
    }
    void checkOut(String nm)
    {
        int j,index=0;
        for(j=0;j<3;j++)
        {
            if(videos[j].equals(nm))
            {

                index=j;
            }
        }
        checkedOut(index);
    }
    void checkIn(String nm)
    {
        int j,index=0;
        for(j=0;j<3;j++)
        {
            if(videos[j].equals(nm))
            {
                index=j;
            }
        }
        checkedIn(index);
    }
    void receiveRating(int n, int no )
    {
        rate[n]=no;
        receive_a_rating(n,no);
    }
    void listInventory()
    {
        for(int i=0;i<3;i++)
        {
            if(flag[i]==true)
                System.out.println(videos[i]+" ( " +flag[i] +" )" );

        }
    }
}
public class VideoRental extends VideoStore
{
    public static void main(String[] args)
    {
        VideoStore o=new VideoStore();
        Arrays.fill(o.flag, true);
        o.addVideo("The Matrix");
        o.addVideo("Godfather II");
        o.addVideo("Star War Episode IV");
        o.receiveRating(0, 4);
        o.receiveRating(1, 3);
        o.receiveRating(2, 5);
        o.checkOut("The Matrix");
        o.checkOut("Godfather II");
        o.checkOut("Star War Episode IV");
        o.checkIn("The Matrix");
        o.checkIn("Godfather II");

        o.checkIn("Star War Episode IV");
        o.checkOut("Godfather II");
        o.listInventory();
    }
}