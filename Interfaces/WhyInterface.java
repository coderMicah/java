//Interfaces solves the problem of tight coupling

// abstract class Car
// {
//     public abstract void drive(){}
// }

interface Car
{
    void drive();
}

// class Tesla extends Car
class Tesla implements Car
{
    public void drive()
    {
        System.out.println("driving Driverless car");
    }
}
// class Toyota extends Car
class Toyota implements Car
{
    public void drive()
    {
        System.out.println("Driver driving");
    }
}

class Driver
{
    public void driving(Car any)
    {
        any.drive();
    }
}

class Demo
{
    public static void main(String a[])
    {
        Car obj = new Tesla();
        Car obj1 = new Toyota();


        Driver John = new Driver();
        John.driving(obj);
        John.driving(obj1);

        
    }
}