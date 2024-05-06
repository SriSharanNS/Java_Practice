public class Method15 {

    int x=10;


    public void test()
    {
        System.out.println(x);
        x=20;
        System.out.println(x);
    }

    public static void main(String[] args) {

        Method15 ob1 = new Method15();
        System.out.println(ob1.x);
        ob1.test();

        ob1.x=30;
        System.out.println(ob1.x);
        

    }
}
