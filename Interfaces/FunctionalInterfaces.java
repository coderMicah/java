//Functional interface is type of interface that accepts only one abstract method

// its important to specify the annotation when using functional interface
//if we add multiple abstract methods it will show the below error
//  error: Unexpected @FunctionalInterface annotation

@FunctionalInterface
interface A 
{
    // public abstract void show();
    void show();

}

class Demo
{
   public static void main(String a[])
   {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("Hello fn interface");
            }
          
        };

        obj.show(); 
   }
}