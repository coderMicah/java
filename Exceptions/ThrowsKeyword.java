//commonly used yo handle checked  errors by passing the throws exception statement
//to the method containing critical statement(s)

//The thrown exception will be handled by the parent method
//(any other method where the  method containgi citical statements will be called)

class A 
{
    public void show() throws ClassNotFoundException
    {
        //this statement is critical will throw a checked exception
        //Checked exceptions are compulsory to be handled
        //instead of defining try-catch block here we will simply throw the errror 
        //to be handled by other method where this fn will be called
        Class.forName("Demo");
    }
}

class Demo
{
    public static void main(String a[])
    {
       
       try{
         A obj = new A();
         obj.show();
       }catch(ClassNotFoundException e)
       {
        System.out.println("Please define the class");
       }
    }
}