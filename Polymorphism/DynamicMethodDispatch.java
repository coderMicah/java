

class A
{
  public void show()
  {
    System.out.println("In A show");
  }
}

class B extends A
{
 public void show()
  {
    System.out.println("In B show");
  }
}

class C extends A
{
   public void show()
  {
    System.out.println("In C show");
  }
}

class DynamicMethodDispatch
{
   public static void main(String a[])
   {

     //with inheritance we can create B objects or C based on superclass A
      A obj = new B();
      obj.show();

      obj = new C();
      obj.show();
   }
}