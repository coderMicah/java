//we have a standard in JAVA  that every execution must be made on a method 

//with manipulating data we use setters
//with getting the data (we use getters)

//with initializing we use constructors
//every time a new object is formed a constructor fn will be called
class Car
{
    private int price;
    private String name;

    //syntax:constructor (method without return type , name MUST BE SIMILAR with CLASS name)
    public Car()
    {
        price = 10;
        name = "Buggati";
        System.out.println("In Constructor");
    }

    //Getters
    public String getName()
    {
        return name;
    }
    public int getPrice()
    {
        return price;
    }
}

class Constructor
{
    public static void main(String a[])
    {
        Car car1 = new Car();

        String name = car1.getName();
        int price = car1.getPrice();
        System.out.println(name + ":" + price);

        //every time a new object is formed a constructor fn will be called 
        Car car2 = new Car();
        Car car3 = new Car();
    }
}