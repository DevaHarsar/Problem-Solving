package OOPS;

public class Polymorphism {
    public void howtoCook(String name,String details)
    {
        System.out.print(name+details);
    }

    public void howtoCook(String details)
    {
         System.out.print(details);
    }

}
class Encapsule
{
    public static void main(String[] args) {

        Polymorphism p1 = new Polymorphism();
        p1.howtoCook("hello","what is happens");
    }
}

