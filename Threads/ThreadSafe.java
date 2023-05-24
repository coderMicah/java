//when using shared variable with THREADS they might result to an error
//TO solve this we use synchronized keyword
//to indicate that each thread must execute once not in parallel

class A 
{
    int count;
    public synchronized void incremnt()
    {
        count++;
    }
}

class Demo
{
    public static void main(String a[]) throws InterruptedException
    {
         A objA = new A();

         Runnable obj = () -> {
            for(int i=1;i<=10000;i++)
            {
               objA.incremnt();
            }
         };
        
        Runnable obj1 = () -> {
            for(int i=1;i<=10000;i++)
             {
                objA.incremnt();
            }
         };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println( objA.count);
    }
}