
class JaggedArray
{
    public static void main(String a[])
    {
        //creating a jagged array
        //(multidimensional array with specified no of rows but unspecified no of elements)
        int nums[][] = new int [3][];


        //creating children array and specifiying how many elements must be in each
        //these arrays are children of the parent array

        for(int i=0;i<nums.length;i++)
        {
           nums[i] = new int[(int)(Math.random() * 10)]; 
        }

        // nums[0] = new int[3];
        // nums[1] = new int[5];
        // nums[2] = new int[4];

        for(int i =0;i<nums.length;i++)
        {
            for(int j =0;j<nums[i].length;j++)
            {
                nums[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int n[] : nums)
        {
            for (int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println(" ");
        }
    }
}