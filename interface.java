interface animals
{
    void speak();
    void eat();
}
class cat implements animals
{
    public void speak()
    {
        System.out.println("Cat Class Speak() function called");
    }
    public void eat()
    {
        System.out.println("Cat Class eat() function called");
    }
}
class dog implements animals
{
    public void speak()
    {
        System.out.println("Dog Class Speak() function called");
    }
    public void eat()
    {
        System.out.println("Dog Class eat() function called");
    }
}

public class prog1
{
    public static void main(String args[])
    {
        cat obj1 = new cat();
        obj1.speak();
        obj1.eat();
        dog obj2 = new dog();
        obj2.speak();
        obj2.eat();
    }
}
