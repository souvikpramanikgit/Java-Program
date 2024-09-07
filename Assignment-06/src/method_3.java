class a
{
    void show()
    {
        System.out.println("Hello from A");
    }
    int show(int x)
    {
        System.out.println("Overload from A "+x);
        return 0;
    }
}
class b extends a {
    void show()
    {
        System.out.println("Hello from B");
    }
}
class method_3 {
    public static void main(String args[])
    {
        b obj=new b();
        obj.show(10);
        obj.show();
    }
}