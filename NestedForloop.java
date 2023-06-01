public class NestedForloop {
    public static void main(String a[])
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("DAY" + i);
            for(int j=9; j<=12;j++)
            {
                if(j==12)
                System.out.println("Time is " + j + "PM");
                else
                System.out.println("Time is " + j + "AM");   
            }
            System.out.println("Time is " + i + "PM");
        }
    }
    
}
