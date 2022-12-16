package ClassPractice;

abstract class Fruit{
    String name;
    String taste;

    Fruit(String name, String taste){
        this.name=name;
        this.taste=taste;
    }

    abstract void eat();
}

class Apple extends Fruit{
    void eat(){
        System.out.println(name+" tastes "+taste);
    }

    Apple(String name, String taste){
        super(name, taste);
    }
}

class Orange extends Fruit{
    void eat(){
        System.out.println(name+" tastes "+taste);
    }

    Orange(String name, String taste){
        super(name, taste);
    }
}

public class Demo2 {
    public static void main(String[] args){
        Apple a1 = new Apple("Apple", "sweet");
        a1.eat();

        Orange o1 = new Orange("Orange", "sour");
        o1.eat();
    }
}
