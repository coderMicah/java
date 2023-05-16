//this keyword shows that the variable represents the current object
class Human
{
    private String name;
    private int age;

    public int getAge()
    {
        return age;
    }
    public void setName(String name)
    {
        //this wil cause an error because local and instance variables
        // name = name;
        //to solve this use the this keyword
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

}

class ThisKeyword
{
    public static void main(String a[])
    {
       Human obj = new Human();
       obj.setAge(10);
       obj.setName("Micah");

        System.out.println(obj.getAge() + ":" + obj.getName());
    }
}