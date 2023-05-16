

class Conditions
{
    public static void main(String args[])
    {
        int x = 8;
        int y = 9;
        int z = 10;

        //if-else condition
        if(x>y){
            System.out.println("Hello");
        }else{
            System.out.println("Bye");
        }

        //if-else-if
        if(x>y && x>z){
            System.out.println(x);
        }
        else if(y>x && y>z){
            System.out.println(y);
        }else{
            System.out.println(z);
        }

        //Ternary Operator

       int result = 0;
       result =  x > y ? x : y;
       System.out.println(result);
     
    }
}