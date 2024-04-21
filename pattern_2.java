public class pattern_2 {
    public static void main(String[] args) {
        
        int r=3,c=3;
        int i=1;
        while(i<=r)
        {
            int j=1;

            while (j<=c)
            {
                if(i==2 && j==2)
                {
                    break;
                }
                System.out.print('*');
                j++;
            }

            System.out.println();
            i++;

        }


    }
}
