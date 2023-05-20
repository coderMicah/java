
//when we declare this class as final we prevent inheritance 
//other classes cannot inherit or extend its features
final class Calc
{
    //final keyword in class prevents method overriding
    public final void show()
    {
        System.out.println("By Micah");
    }

    public void add(int a,int b)
    {
        System.out.println(a+b); 
    }
}

//inheritance will not work if the super class is final
//error: cannot inherit from final Calc
class AdvCalc extends Calc
{
     //method overriding will fail since the superclass method show is devlared as final
     // error: show() in AdvCalc cannot override show() in Calc
    public void show()
    {
        System.out.println("By John");
    }
}


class Final
{
    public static void main(String a[])
    {
        AdvCalc obj = new AdvCalc();
        obj.show();
        obj.add(23,17);
    }
}