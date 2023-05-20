class A 
{
   public void show()
   {
    System.out.println("In A");
   }
}

class B extends A
{
    public void show1()
    {
         System.out.println("In B");
    }
}

class Demo
{
    public static void main(String a[])
    {
        //REFERENCE A -> OBJECT A
        // A obj = new A();
        // obj.show();

        //REFERENCE A -> OBJECT B
        // A obj = (A) new B(); will create this implicitly (upcasting)
        A obj = new B();
        obj.show();

        // WHY DOWNCASTING?
        //we can not access show1() because we are not referencing to B object
        // error: cannot find symbol
        // obj.show1();
         
         //downcasting
        ((B)obj).show1();
        // B obj1 = (B) obj;
    }
}