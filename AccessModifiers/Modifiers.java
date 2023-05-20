

public class Modifiers
{

    //can be accessed everywhere
    public int marks = 10;

    //can be accesed only in same package
    default  int defaultMarks = 20;

    //can only be accesed in respective class
    private int privateMarks = 30;

    //can be acessed everywhere except in non-subclass of different package
    protected int protectedMarks = 40;


    public void show()
    {
        System.out.println(marks)
    }

}