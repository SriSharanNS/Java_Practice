public class Method14 {


    int a=10;
    float b=23.5f;


    public void test()
    {
        System.out.println(a);
        System.out.println(b);
    }
    
    public static void main(String[] args)
    {
        System.out.println("From Main");
        
        Method14 ob1=new Method14();
        System.out.println(ob1);
        System.out.println(ob1.a);
        System.out.println(ob1.b);

        ob1.test();
        
    }
}
