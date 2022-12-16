package ClassPractice;

class Animal {
    void eat(){
        System.out.println("Animal eats");
    }
    void sleep(){
        System.out.println("Animal sleeps");
    }
}

class Bird extends Animal{
    @Override
    void eat(){
        System.out.println("Bird eats");
    }
    @Override
    void sleep(){
        System.out.println("Bird sleeps");
    }
    void fly(){
        System.out.println("Bird flies");
    }
}

public class Demo{
    public static void main(String[] args){
        Animal a1=new Animal();
        a1.eat();
        a1.sleep();

        Bird b1=new Bird();
        b1.eat();
        b1.sleep();
        b1.fly();
    }
}
