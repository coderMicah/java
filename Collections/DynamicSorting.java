import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//what if we want to specify our own sort logic
//we can define our sort logic using the Comparator interface

class SortingDynamic
{
    public static void main(String a[])
    {
        Comparator<Integer> comp = new Comparator<Integer>()
        {
            public int compare(Integer a,Integer b)
            {
                if(a%10 > b%10)
                    return 1;
                else
                    return -1;
            }
        };

        List<Integer> marks = new ArrayList<Integer>();

        marks.add(55);
        marks.add(78);
        marks.add(82);
        marks.add(68);

        Collections.sort(marks,comp);
        System.out.println(marks);
    }
}