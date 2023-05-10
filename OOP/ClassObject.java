
//consider a class as a blueprint to create an object
//( apple inc at califonia provide blueprint to a company in China)
class Calculator
{
//properties
   int a;
   int b;

//methods
  public int add(int a,int b)
  {
    int result = (a + b);
    return result;
  }
}


class ClassObject
{
    public static void main(String a[])
    {
        int num1 = 5;
        int num2 = 7;

        //JVM will create new object of type Calculator named calc
        //(A company in China creates a new object(iphone) from a given blueprint from Apple inc )
        Calculator calc = new Calculator();

        //We can use the object
        //(To use the features of our iphone we must first have the iphone )
        int result = calc.add(num1,num2);
         System.out.println(result);
    }
}