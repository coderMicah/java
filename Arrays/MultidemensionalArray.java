class MultidimensionArray
{
   public static void main(String a[])
   {
     int nums[][] = new int[3][2];


    for(int i=0;i<3;i++)
    {
        for(int j=0;j<2;j++)
        {
            nums[i][j] = (int)(Math.random() * 10);
        }
    }

    System.out.println("With for loop ");
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<2;j++)
        {
            System.out.print(nums[i][j] + (" "));
        }
       System.out.println();
    }

    System.out.println("With enhancedfor loop ");
    
    for(int n[]: nums)
    {
        for(int m: n)
        {
            System.out.print(m + " ");
        }
        System.out.println();
    }
   }
}