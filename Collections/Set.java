import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

//Set returns unique elements
//Doesnot support indexing

class SetDemo
{
    public static void main(String a[])
    {
        //unlike Hashset,Treeset returns sorted unique elements
        Set<Integer> nums = new HashSet<Integer>();

        //Treeset reurns sorted unique elements
        Set<Integer> nums1 = new TreeSet<Integer>();

        nums.add(65);
        nums.add(78);
        nums.add(85);
        nums.add(85);

        nums1.add(65);
        nums1.add(78);
        nums1.add(85);
        nums1.add(85);

    
        System.out.println(nums);
        System.out.println(nums1);
    }
}