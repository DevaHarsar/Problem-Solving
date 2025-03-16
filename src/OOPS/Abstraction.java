package OOPS;

abstract class Abstraction {
    abstract void Cooker_name(String name);
    void good_cook(String appreciation)
    {
        System.out.print(appreciation);
    }
}
class Cooking_details extends Abstraction
{

    void Cooker_name(String a)
    {
        System.out.print(a);
    }
}

 class Main {

    public static void main(String[] args) {
        Cooking_details b1 = new Cooking_details();
        b1.good_cook("Excellent");
        b1.Cooker_name("Dev");
    }
}
