 //static keyword means you are making something
 // a class member and not an object member
 
 class Mobile 
 {
    int price;
    String name;
    static String type;

    public void show()
    {
        System.out.println(price + " " + name + " " + type);
    }
    // public void show(Mobile obj)
    // {
    //     return System.out.println(obj.price + " " + obj.name + " " + obj.type);
    // }


 }

 class Static 
 {
    public static void main(String a[])
    {
        Mobile obj1 = new Mobile();
        obj1.name ="Samsung";
        obj1.type ="Smartphone";
        obj1.price = 100;
        
        Mobile obj2 = new Mobile();
        obj2.name ="Tecno";
        obj2.type ="Smartphone";
        obj2.price = 45;


        //although we have changed the value of obj1.type
        //but the value of obj2.type will also be changed to mobile phone
        //since the type(attribute) in Mobile class is static(common to all it objects)
        obj1.type = "Mobile Phone";

        obj1.show();
        obj2.show();

    }
 }