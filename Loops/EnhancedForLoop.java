class Student
{
    int marks;
    String name;
    int rollno;
}

class EnhancedForLoop
{
    public static void main(String a[])
    {
        Student s1 = new Student();
        s1.name ="John";
        s1.marks =89;
        s1.rollno = 1;

        Student s2 = new Student();
        s2.name ="Jane";
        s2.marks = 91;
        s2.rollno = 2;

        Student s3 = new Student();
        s3.name ="Doe";
        s3.marks = 54;
        s3.rollno = 3;

        //create a new array of type Student
        Student students[] = new Student[3];

        //initializ the new created array 
        students[0] =s1;
        students[1]=s2;
        students[2]=s3;

        // for(int i=0;i<students.length;i++)
        // {
        //     System.out.println(students[i].name + ":" + students[i].marks);
        // }

        System.out.println("Enhanced for loop");

        for(Student student : students)
        {
            System.out.println(student.name + ":" + student.marks);
        }

    }
}