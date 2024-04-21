public class nested_if_condition {
    public static void main(String[] args) {
        
        int age=30;
        boolean vid = true;

        if (age>=18)
        {   
            if(vid)
            {
                System.out.println("Eligibe to vote");
            }
            else
            {
                System.out.println("Not Eligibe to vote");

            }
            
        }
        else
        {
            System.out.println("Not Eligibe to vote");

        }

    }
}
