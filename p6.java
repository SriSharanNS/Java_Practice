class p6{
    public static void main(String[] args) {
        
        int a=10,b=20;

        int c = a++ + b-- - ++a;
        int d = --b - --a + ++b;

        System.err.println(a);
        System.err.println(b);
        System.err.println(c);
        System.err.println(d);

    }
}