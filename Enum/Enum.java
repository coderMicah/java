//enum are usefull when workng with constants variables
//instead of creating a new class an instatiaiting new objects we can use enums

enum Status
{
    pending,failed,success
}

class Demo
{
    public static void main(String a[])
    {
        Status s = Status.pending;

        switch(s)
        {
            case pending:
                System.out.println("Please Wait");
                break;
            case failed:
                System.out.println("Try Again");
                break;
            default:
                System.out.println("All done");
                break;
        }
    }
}