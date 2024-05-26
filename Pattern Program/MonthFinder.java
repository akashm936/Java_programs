import java.util.*;

class MonthFinder
{
   Scanner sc = new Scanner(System.in);

   System.out.println("*********** Find Month ************");
   System.out.println("Enter the number :");   
   int month = sc.nextInt();

   if(month=1)
   {
   	System.out.println(month + "= Janewary"  );
   }
    else if(month=2)
   {
   	System.out.println(month + "= Febwary"  );
   }
    else if(month=3)
   {
   	System.out.println(month + "= March"  );
   }
    else if(month=4)
   {
   	System.out.println(month + "= April"  );
   }
    else if(month=5)
   {
   	System.out.println(month + "= May"  );
   }
    else if(month=6)
   {
   	System.out.println(month + "= June"  );
   }
    else if(month=7)
   {
   	System.out.println(month + "= July"  );
   }
    else if(month=8)
   {
   	System.out.println(month + "= Agust"  );
   }
    else if(month=9)
   {
   	System.out.println(month + "= September"  );
   }
    else if(month=10)
   {
   	System.out.println(month + "= Octomber"  );
   }
    else if(month=11)
   {
   	System.out.println(month + "= Nuhmber"  );
   }
    else if(month=12)
   {
   	System.out.println(month + "= December"  );
   }
   else
   {
   	System.out.println("Invalid Number" );
   }
}