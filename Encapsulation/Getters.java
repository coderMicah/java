//getters enable us to access private variables from outside their respective class


class Human
{
    private String name = "Micah";
    private int age = 10;

    //syntax : return type specified, no params
    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }


}

class Getters
{
    public static void main(String a[])
    {
       Human obj = new Human();
       //since name and are made private we can not acces them directly
       //from Demo class 
       //obj.name = "Micah";
       //obj.age = 10;

       //to access the private instance variables we can use gettters
       int age = obj.getAge();
       String name = obj.getName();
       System.out.println(age + ":" + name);
    }
}