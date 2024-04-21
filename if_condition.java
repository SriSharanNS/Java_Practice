public class if_condition {
    public static void main(String[] args) {

        /* Second Largest */
        
        int a=10,b=15,c=14;

        if ( ( a<b && a>c) || (a<c && a>b) )
        {
               System.out.println(a + " Second Largest");
        }

        if ( ( b<a && b>c) || (b<c && b>a) )
        {
               System.out.println(b + " Second Largest");
        }

        if ( ( c<a && c>b) || (c<b && c>a) )
        {
               System.out.println(c + " Second Largest");
        }

    }
}
