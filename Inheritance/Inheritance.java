class AdvCalc extends Calc
{
    public int mult(int a,int b)
    {
        return a*b;
    }
    public int div(int a,int b)
    {
        return a/b;
    }
}
class Inheritance
{
    public static void main(String a[])
    {
        //Adv calculator inherits some basic methods from calc
        //so we can access both methods for adv n calc classes
         AdvCalc calc = new AdvCalc();

         int r1 = calc.add(81,9);
         int r2 = calc.sub(81,9);
         int r3 = calc.mult(81,9);
         int r4 = calc.div(81,9);

         System.out.println("Basic math with 81 and 9");
         System.out.println("add:" + r1 + " subtracting:" + r2 + " multiplying:" + r3 + " quotient:" + r4);
    }
}