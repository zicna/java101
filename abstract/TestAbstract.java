abstract class Animal{

    abstract public void noice();
    public void eat(){
        System.out.println("I am eating...");
    };
}

class Dog extends Animal{
    @Override
    public void noice() {
        // TODO Auto-generated method stub
        System.out.println("bark, bark");
    }
}


class TestAbstract{
    public static void main(String[] args){
        Dog d = new Dog();

        d.eat();
        d.noice();
    }
}