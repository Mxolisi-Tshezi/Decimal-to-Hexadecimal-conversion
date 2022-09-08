import java.util.Scanner;
class convert {
      public static void main(String args[])
    {
        int decimal_number, reminder;
        String hexdecimal_number="";    
        char hexidecima[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        Scanner in = new Scanner(System.in);
        System.out.print("\n\nPlease enter a 10-decimal number: ");
        decimal_number = in.nextInt();
        while(decimal_number>0)
        {
            reminder = decimal_number%16;
            hexdecimal_number = hexidecima[reminder] + hexdecimal_number;
            decimal_number = decimal_number/16;
        }
        System.out.print("The Hexadecimal is : "+hexdecimal_number+"\n\n");         
    }
}
