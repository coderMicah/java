//what if we want to construct our objects using our own values and not
//default values defined in constructor

//we use parameterized constructors
//we can overload the constructor(as its a method) to create multiple constructors
class Car
{
    private int price;
    private String name;

    //syntax:constructor (method without return type , name MUST BE SIMILAR with CLASS name)
    public Car()
    {
        price = 10;
        name = "Buggati";
    }

    //parameterized constructor
    public Car(String name)
    {
        this.price = 0;
        this.name = name;
    }

    public Car(String name,int price)
    {
        this.name = name;
        this.price = price;
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

class ParameterizedConstructor
{
    public static void main(String a[])
    {
        Car car1 = new Car();
        String name = car1.getName();
        int price = car1.getPrice();
        

        Car benz = new Car("Benz");
        String benzName = benz.getName();
        int benzPrice = benz.getPrice();

        Car unique = new Car("Driverless", 109888);
        String uniqueName = unique.getName();
        int uniquePrice = unique.getPrice();

        System.out.println(benzName + ":" + benzPrice);
        System.out.println(uniqueName + ":" + uniquePrice);
        System.out.println(name + ":" + price);


    }
}