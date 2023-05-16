//getters enable us to access private variables from outside their respective class


class Human
{
    private String name;
    private int age;

  //syntax : return type specified, no params
  //getter
    public int getAge()
    {
        return age;
    }

  
    //syntax(setters): return type(void), params pased to set new value
    //setter
    public void setAge(int a)
    {
        age = a;
    }

     public void setName(String n)
    {
        name = n;
    }

    public String getName()
    {
        return name;
    }


}

class Setters
{
    public static void main(String a[])
    {
       Human obj = new Human();

       //to initialize our object we use setters
       obj.setAge(10);
       obj.setName("Micah");

        System.out.println(obj.getAge() + ":" + obj.getName());
       
    }
}