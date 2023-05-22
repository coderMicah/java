//enum can have construvtor,variables and methods

enum Status
{
    pending(statusCode:300),failed(statusCode:400),success(statusCode:200);

    private int statusCode;

    public int getStatusCode()
    {
        return statusCode;
    }
}

class Demo
{
    public static void main(String a[])
    {
        // Status s = Status.pending;

        for (Status s : Status.values())
        {
            System.out.println(s + ": " + s.getStatusCode());
        }
    }
}

