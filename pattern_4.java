public class pattern_4 {
    public static void main(String[] args) {
        
        int r=3,c=3;
        int i=1;
        while(i<=r)
        {
            int j=3;

            while (j<=c)
            {
                if(i==3 && j==3)
                {
                    System.err.print('*');
                    break;
                }
                if(i==2 && j==2)
                {
                    System.err.print('*');
                    break;
                }
                if(i==1 && j==1)
                {
                    System.err.print('*');
                    break;
                }
                
                System.out.print("   ");
                j--;
            }

            System.out.println();
            i++;

        }
    }
}
