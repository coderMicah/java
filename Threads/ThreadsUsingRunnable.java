//we can create threads from runnable interface
//simply the class Thread implements runnable interface and have some other methods
//so instead of using class Thread we can use Runnable interfac to tackle the Thread creation
//mostly we do this when our class also extends othr class (we cant have multiple inheritance)
//but we can have inheritance and class implementation

// class A implements Runnable
// {
//     public void run(){
//       for(int i=1;i<=5;i++)
//       {
//         System.out.println("Hello");
//         try{Thread.sleep(5);}catch(Exception e){System.out.println("Threed error handled");}
//       }
//     }
// }
// class B implements Runnable
// {
//     public void run(){
//       for(int i=1;i<=5;i++)
//       {
//         System.out.println("Hello,stranger");
//         try{Thread.sleep(5);}catch(Exception e){System.out.println("Threed error handled");}
//       }
//     }
// }

// class Demo
// {
//     public static void main(String a[])
//     {
//         Runnable obj = new A();
//         Runnable obj1 = new B();

//         Thread t1 = new Thread(obj);
//         Thread t2 = new Thread(obj1);

//         t1.start();
//         t2.start();
//     }
// }
class Demo
{
    public static void main(String a[])
    {
        //Runnable is an SAM/Functional Interface so we can use the Lambda exp
        //to run an inner class that will help us create an object
        //thus we no longer need A class(reduce code verbose)
        Runnable obj = () -> {
            for(int i=1;i<=5;i++)
            {
                System.out.println("Hello");
                try{Thread.sleep(5);}catch(Exception e){System.out.println("Threed error handled");}
            }
         };
        
        Runnable obj1 = () -> {
            for(int i=1;i<=5;i++)
            {
                System.out.println("Hello,stranger");
                try{Thread.sleep(5);}catch(Exception e){System.out.println("Threed error handled");}
            }
         };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();
    }
}