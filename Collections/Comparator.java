import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class Student 
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

}

class Demo
{
    public static void main(String args[])
    {
        // Comparator<Student> comp = new Comparator<Student>()
        // {
        //     public int compare(Student a,Student b)
        //     {
        //         if(a.age > b.age)
        //             return 1;
        //         else
        //             return -1;
        //     }
        // };
        
        //since comparator is a fn interface e can further simplify the above code
        Comparator<Student> comp = (a, b) -> (a.age > b.age)?1:-1;
            


        List<Student> students = new ArrayList<Student>();

        students.add(new Student("John", 15));
        students.add(new Student("Jane", 13));
        students.add(new Student("Doe", 14));
        students.add(new Student("Rose", 17));
        students.add(new Student("Chris", 16));
       

        Collections.sort(students,comp);
        System.out.println(students);
    }
}