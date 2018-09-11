abstract class animals
{
    public String color = "Black";
    public String breed = "Lebra";
    public String name = "Bruno";
    abstract void eat();
    public void speak()
    {
        System.out.println("Animals Class Speak() function called :" +"\n" + "Name : " + this.name + "\nBreed : " + this.breed + "\nColor : " + this.color);
    }
}
class cat extends animals
{
    public void eat()
    {
        System.out.println("Cat Class eat() function called");
    }
}

public class prog2
{
    public static void main(String args[])
    {
        cat obj1 = new cat();
        obj1.speak();
        obj1.eat();
    }
}