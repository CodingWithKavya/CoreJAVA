public class nestedwhileloop {
    public static void main(String a[])
    {
       int i = 1 ;
       while(i<=4)
       {
        System.out.println("insdide outerloop" + i + "time");
        i++ ;
        int j =1 ;
        while(j<=3)
        {
            System.out.println("Hi from innerloop" + j + "time");
            j++ ;
        
        }
       }


    }
}
