package OOPS;

public class Encapsulation {
    private String cooking_details;

    public void setCooking_details(String name)
    {
        this.cooking_details=name;

    }
    public  String getCooking_details()
    {
        return  cooking_details;
    }

}
class CookerDetails
{
    public static void main(String[] args) {

        Encapsulation e1 = new Encapsulation();
        e1.setCooking_details("Hello idli was ready");
        System.out.print(e1.getCooking_details());
    }
}
