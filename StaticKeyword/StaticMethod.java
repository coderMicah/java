
class Mobile
{
    static String type;
    String name;
    int price;

    // we can only use static variables inside static methods unless 
    //we pass ref variables
    public static void show(Mobile obj)
    {
      System.out.println(type + " " + obj.name + " " + obj.price);

    }
}

class StaticMethod
{
     public static void main(String a[])
     {
        Mobile obj1 = new Mobile();
        obj1.name ="Samsung";
        obj1.type ="Smartphone";
        obj1.price = 100;

        Mobile.show(obj1);
     }

}