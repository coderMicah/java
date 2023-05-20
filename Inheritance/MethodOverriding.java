
class Calc
{
    public int add(int a,int b)
    {
        return a + b;
    }

}

class AdvCalc extends Calc
{
    public int add(int a,int b)
    {
        return a + b + 5;
    }
}



class MethodOverriding
{
    public static void main(String a[])
    {
        AdvCalc obj = new AdvCalc();
        int r = obj.add(5,5);
        System.out.println(r);
    }
}