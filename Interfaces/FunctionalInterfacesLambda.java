//when using lamba exp in fn interfaces there's no need
// for complier to create another inner class thus saving space

//Lamba expression are syntantic sugar (reduce verbose)


@FunctionalInterface
interface A 
{
    int add(int i,int j);
}

class Demo
{
   public static void main(String a[])
   {
        A obj = (i,j) -> {return i+j;};
         //simplified above code
        // A obj = i,j -> i+j

        //Instedad of these we apply on lambd exp above
        // A obj = new A ()
        // {
        //     public int add (int i, int j)
        //     {
        //         return i + j;
        //     }
        // };

        int result = obj.add(5,15); 
        System.out.println(result);

   }
}