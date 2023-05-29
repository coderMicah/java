import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
//to sort any type of collection(set,list etc...) we can use the Collections sort()

class Sorting
{
    public static void main(String a[])
    {
        List<String> names = new ArrayList<String>();

        names.add("hance");
        names.add("John");
        names.add("kingwendu");
        names.add("Faustine");

        Collections.sort(names);
        System.out.println(names);
    }
}