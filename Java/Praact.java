interface IFruit{
    public String type="Apple";
}
class Fruit implements IFruit{}

public class Praact {
    public static void main(String[] args){
        System.out.println(Fruit.type);
    }
}
