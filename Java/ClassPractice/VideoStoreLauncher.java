package ClassPractice;

import java.util.Objects;

class Video{
    private String title;
    private boolean flag;
    private double avgRating;

    Video(){
        flag=true;
        avgRating=0;
    }

    //Getter and Setter Methods
    void setTitle(String title){
        this.title=title;
    }
    void setFlag(boolean flag){
        this.flag=flag;
    }
    void setAvgRating(double avgRating){
        this.avgRating=avgRating;
    }
    String getTitle(){
        return title;
    }
    boolean getFlag(){
        return flag;
    }
    double getAvgRating(){
        return avgRating;
    }

    void beingChecked(){
        setFlag(false);
    }
    void beingReturned(){
        setFlag(true);
    }
    void receiveRating(int rating){
        double avRating = getAvgRating();
        avRating = (avRating+rating)/2;
        setAvgRating(avRating);
    }
}

class VideoStore{
    Video[] array = new Video[10];
    int num=0;
    void addVideo(String video){
        if(num>=10) System.out.println("Space full");
        else{
            array[num] = new Video();
            array[num].setTitle(video);
            num++;
        }
    }

    void checkOut(String video){
        int found = -1;
        for (int i=0; i<num; i++) {
            if(Objects.equals(array[i].getTitle(), video)){
                found=1;
                if(!array[i].getFlag()) System.out.println("ClassPractice.Video Requested Unavailable");
                else{
                    System.out.println("Congratulations, video "+video+" is rented to you now");
                    array[i].beingChecked();
                }
            }
        }
        if(found==-1) System.out.println("ClassPractice.Video Requested not available");
    }

    void returnVideo(String video){
        int found=-1;
        for (int i=0; i<num; i++) {
            if(Objects.equals(array[i].getTitle(), video)){
                found=1;
                if(array[i].getFlag()) System.out.println("ClassPractice.Video "+video+" is not rented from us");
                else{
                    System.out.println("Thank you for returning the video");
                    array[i].beingReturned();
                }
            }
        }
        if (found==-1) System.out.println("ClassPractice.Video " +video+ " not part of our ClassPractice.Video Gallery");
    }

    void receiveRating(String video, int rating){
        int found=-1;
        for (int i=0; i<num; i++) {
            if(Objects.equals(array[i].getTitle(), video)){
                found=1;
                array[i].receiveRating(rating);
            }
        }
        if (found==-1) System.out.println("ClassPractice.Video " + video + " not part of our ClassPractice.Video Gallery");
    }

    void listInventory(){
        for (int i=0; i<num; i++) {
            if(array[i].getFlag()) {
                System.out.printf("%-22s%-22s\n", array[i].getTitle(), array[i].getAvgRating());
            }
        }
        System.out.println();
    }
}


public class VideoStoreLauncher {
    public static void main(String[] args){
        VideoStore obj1 = new VideoStore();
        obj1.addVideo("The Matrix");
        obj1.addVideo("Godfather II");
        obj1.addVideo("Star Wars Episode IV: A New Hope");

        obj1.receiveRating("The Matrix", 4);
        obj1.receiveRating("Godfather II", 5);
        obj1.receiveRating("Star Wars Episode IV: A New Hope", 4);

        obj1.listInventory();

        obj1.checkOut("The Matrix");
        obj1.returnVideo("The Matrix");

        obj1.checkOut("Godfather II");
        obj1.listInventory();
        obj1.returnVideo("Godfather II");

        obj1.checkOut("Star Wars Episode IV: A New Hope");
        obj1.returnVideo("Star Wars Episode IV: A New Hope");

    }
}
