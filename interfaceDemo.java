interface animal {
    void eat();
}

class Dog implements animal{
    public void eat(){
        System.out.println("dog is eating");
    
    }
}
public class Test {
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();
    }
}
