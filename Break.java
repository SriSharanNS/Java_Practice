public class Break {
  public static void main(String[] args) {

    int i=1;

    while(i<=10)
    {
        if(i==3)
        {
            break;
        }
        System.err.println(i + " i loop");
        i++;
    }
    

    int j=1;

    while(j<=3)
    {
        int k=1;
        while (k<=3)
        {   
            if(k==2)
            {
                break;
            }
            System.err.println(k + " k loop");
            k++;
        }
        System.err.println(j + " j loop");
        j++;
    }
    

}
    
}