class A 
{
    int a,b;
    void display()
    {
        system.out.println("Inside class A values="+a+" "+b);

    }
}
class B extends A
{
    int c;
    void show();
    {
        System.out.println("Inside class B values="+a+""+b+""+c);
    }
    class Singleinheritance
    {
        public static void main(String[]args)
    {
        B obj= new B();
        obj.a=10;
        obj.b=20;
        obj.c=20;

        obj.display();
        obj.show();
        
    }


}
