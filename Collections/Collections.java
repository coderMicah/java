import java.util.Collection;
import java.util.ArrayList;

//Collections enable us to work with complex data structures by utilizing the collection API

class CollectionInterface
{
    public static void main(String a[])
    {
        //we use generics to specify the type of a Collection since Collection can
        //take various type object
        Collection<Integer> nums = new ArrayList<Integer>();

        nums.add(65);
        nums.add(78);
        nums.add(89);
        nums.add(85);

    
        System.out.println(nums);

        //collection interface doesnt support indexing if you want to get single values
        //use enhanced for loop
        for(int n : nums)
        {
            System.out.println(n);
        }

    }
}