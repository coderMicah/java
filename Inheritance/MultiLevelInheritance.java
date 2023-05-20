
 class MultiLevelInheritance
 {
    public static void main(String a[])
    {
        ScientificCalc calc = new ScientificCalc();

        //comes from Calc
         int r1 = calc.add(81,9);
         int r2 = calc.sub(81,9);

         //comes from advcalc
         int r3 = calc.mult(81,9);
         int r4 = calc.div(81,9);

         //comes from scientific calc
         double r5 = calc.power(4,2);

         System.out.println("Basic math with 81 and 9");
         System.out.println("add:" + r1 + " subtracting:" + r2 + " multiplying:" + r3 + " quotient:" + r4);
         System.out.println("Power of 4 and 2(scientific calc)" + r5);
    }
 }