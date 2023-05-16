//Encapsulation is basic of OOP
//We must always make sure our data(instance variable) is encapsulated/hidden


class Human
{
    private String name;
    private int age;

    

}

class Demo
{
    public static void main(String a[])
    {
       Human obj = new Human();
       //since name and are made private we can not acces them directly
       //from Demo class 
       obj.name = "Micah";
       obj.age = 10;
    }
}