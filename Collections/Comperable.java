import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class Student implements Comparable<Student>
{
    int age;
    String name;
    
    public Student(String a, int b)
    {
        this.name = a;
        this.age = b;
    }

    public String toString()
    {
        return "[age:" + this.age + "-" + "name:" + this.name + "]";
    }

    public int compareTo(Student that)
    {
        if(this.age > that.age)
            return 1;
        else
            return -1;
    }

}

class Demo
{
    public static void main(String a[])
    {
        List<Student> students = new ArrayList<Student>();

        students.add(new Student("John", 15));
        students.add(new Student("Jane", 13));
        students.add(new Student("Doe", 14));
       

        // Collections.sort(students,comp);
        Collections.sort(students);
        System.out.println(students);
    }
}