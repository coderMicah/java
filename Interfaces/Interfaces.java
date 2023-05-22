
//this is basically an interface
// abstract class A 
// { 
//     public abstract void show();
//     public abstract void config();
// }

//interface is basically an abstract class where all the methods are public abstract
//SAME WITH ABSTRACT CLASS WE CANNOT INSTANITIATE INTERFACES

//WE create interface for designing our clases
interface A 
{
     //By default every variable is final and static
    int area = 5500 ;
    String name = "Mexico";

     //By default evey method is public abstract
    void show();
    void config();
}


//when we use implements keyword it becomes compilsory for us to
//implement every abstract method in the interface

//If you fail to implement both methods the class will be an abstract class
class B implements A 
{
   public void show()
   {
     System.out.println("In B show");
   }
   public void config()
   {
     System.out.println("In B config");
   }
}

class Interfaces
{
    public static void main(String a[])
    {
        //this will work,we can create type of an interface
        A obj;

        //we cannot instantiate interfaces this result to error
        // A obj1 = new A();

        A obj1 = new B();
        obj1.show();
        obj1.config();

        //since interface variables are static we can acess them using interface
        System.out.println(A.area + " " + A.name);
    }
}