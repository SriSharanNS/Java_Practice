public class While_loop {
    public static void main(String[] args) {
        
        int i=0;
        while (i<=10 && i>=0) 
        {

            if(i%2==0)
            {
                System.out.println(i);
            }
            i++;
        }

        int j=0;
        while (j>=-10 && j<=0) 
        {

            if(j%2==0)
            {
                System.out.println(j);
            }
            j--;
        }
    }
}
