//Abstract methods must always be in an abstract class
//its NOT COMPULSORY for ABSTRACT CLASS to have ABSTRACT METHODS


abstract class Car
{
    //ABSTRACT KEYWORD IS USED WHEN WE WANT TO DEFINE METHODS WITHOUT IMPLEMENTING THEM
    public abstract void drive();
    public abstract void ac();

    public void playMusic()
    {
        System.out.println("Music Playing...");
    }

}

//CONCRETE CLASS -> class with all implementations of abstract class
class Toyota extends Car
{
    public void drive()
    {
       System.out.println("Driving...");
    }
    public void ac()
    {
       System.out.println("Turn on or off ac...");
    }

    public void cast()
    {
        System.out.println("Testing Casting..");
    }
}


class IST
{
    public static void main(String a[])
    {
        //we can not ceate objects with abstract classes
        // error: Car is abstract; cannot be instantiated 
        // Car obj1 = new Car();
        // obj1.playMusic();

        Car obj = new Toyota();
        obj.playMusic();
        obj.drive();
        obj.ac();
        

    }
}