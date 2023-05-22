interface A 
{
    void show();
    void config();
}
interface B
{
    void run();
}

//interfaces supports inheritance
interface C extends B
{
   
}

class X implements A,C
{
     public void show()
   {
     System.out.println("In B show");
   }
   public void config()
   {
     System.out.println("In B config");
   }
   //since this class implements C interface and C extends B
   //we must implemnt th extended interface methods
    public void run()
   {
     System.out.println("Running ....");
   }
  
}

class Demo
{
    public static void main(String a[])
    {
        //accesing the A interface
        A obj = new X();
        obj.show();
        obj.config();

        //accessing the C interface
        C obj1 = new X();
        obj1.run();
    }
}