import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;


//Stream API was introducd to hlp solve sequential and parallel agrgregate operations
//suppose you want to reduce,map,filter and sort a collection or array
class StreamAPI
{
    public static void main(String a[])
    {
        List<Integer> nums = Arrays.asList(11,8,4);

        //stream always returns a stream object and we can use that object only once
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(s -> s%2==0);
        Stream<Integer> s3 = s2.map(s -> s*2);
        int result = s3.reduce(0, (c,e) -> c+e);

        //we can simplify the above statements
        int results = nums.stream().filter(s -> s%2==0).map(s -> s*2).reduce(0, (c,e) -> c+e);

        //streams does not affect the original collection
        nums.forEach(n -> System.out.println(n));

        // Exception stream has already been operated upon or closed
        // stream can only be used once 
        // s2.forEach(n -> System.out.println(n));
        // s3.forEach(n -> System.out.println(n));

       
        System.out.println(result);
        System.out.println(results);
    }
}