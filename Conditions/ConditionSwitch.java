

class ConditionSwitch
{
    public static void main(String args[])
    {
        int num = 15;
        //with switch case the moment it matches the case (5) it 
        //will continue to execute all the cases (so will print all cases from FRiday-Sunday)
        //to prevent this use break;
        switch(num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter the valid number");
        }
    }
}