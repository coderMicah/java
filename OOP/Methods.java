

class Computer
{
    public void playMusic()
    {
        System.out.println("Playing Music...");
    }

    public String paint(int strokeWidth)
    {
        if(strokeWidth <= 5)
            return "Painting with stokewidth of" + strokeWidth;
        
        return "Not Painting strock width must be greater than 6";
    }
}

public class Methods
{
    public static void main(String a[])
    {
        Computer obj = new Computer();
        obj.playMusic();

        String str = obj.paint(15);
        System.out.println(str);
    }
}