package Assignment2;

class Furniture{
    int stressTest;
    int fireTest;
}

class Chairs extends Furniture{
    Chairs(int x, int y){
        stressTest=x;
        fireTest=y;
    }
}
class Tables extends Furniture{
    Tables(int x, int y){
        stressTest=x;
        fireTest=y;
    }
}

public class Qsn4 {
    public static void main(String[] args){
        Chairs metalChair=new Chairs(3,4);
        Chairs woodChairs=new Chairs(1,1);

        Tables metalTables=new Tables(4,4);
        Tables woodTables=new Tables(2,1);

        System.out.println(metalChair.stressTest + " " + metalChair.fireTest);
    }
}
