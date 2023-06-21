import java.util.Scanner;
 class ATM {
    public static void main(String[] args) {
        int balance=1000,pincode=12345;
        String transaction=" ";
        Scanner sc=new Scanner(System.in);
        System.out.println(Colors.CYAN_BOLD);
        System.out.println("********Welcome To SBI ATM********");
        System.out.println(Colors.RESET);
        while(true)
        {
        System.out.println(Colors.PURPLE_BOLD);
        System.out.println("Instructions of ATM:");
        System.out.println("press 1 for check balance\n");
        System.out.println("press 2 for withdraw\n");
        System.out.println("press 3 for Deposite\n");
        System.out.println("press 4 for Transfer\n");
        System.out.println("press 5 for Quit\n");
        System.out.println(Colors.RESET);
        System.out.println("enter a choice");
        int ch=sc.nextInt();
             switch(ch)
             {
                 case 1:
                 System.out.println(Colors.GREEN_BOLD);
                 System.out.println("current balance is"+balance);
                 System.out.println(Colors.RESET);
                 break;
                 case 2:
                 {
                     System.out.println("enter pincode");
                   int a=sc.nextInt();
                  if(a==pincode)
                  {
                     System.out.println("enter the amount to withdraw");
                     int withdraw=sc.nextInt();
                     if(withdraw>balance)
                     {
                        System.out.println(Colors.GREEN_BOLD);
                         System.out.println("insufficient balance");
                         System.out.println(Colors.RESET);
                     }
                     else
                     {
                        System.out.println(Colors.GREEN_BOLD);
                        System.out.println(withdraw+"rs successfully withdraw");
                        System.out.println(Colors.RESET);
                     }
                 }
                 else
                 {  System.out.println(Colors.RED_BOLD);
                     System.out.println("wrong pincode");
                     System.out.println(Colors.RESET);
                 }
                 break;
             }
             case 3:
                 {
                     System.out.println("enter pincode");
                     int a=sc.nextInt();
                    if(a==pincode) 
                    {
                        System.out.println("enter deposite amount");
                        int deposite=sc.nextInt();
                        System.out.println(Colors.GREEN_BOLD);
                        System.out.println(deposite+"rs is deposited");
                        System.out.println(Colors.RESET);
                    }
                    else
                    {
                        System.out.println(Colors.RED_BOLD);
                        System.out.println("wrong pincode");
                        System.out.println(Colors.RESET);
                    }
                    break;
                 }
                 case 4:
               {
                System.out.println("enter account number to transfer money");
                String accountnumber=sc.next();
                System.out.println("enter transfer money");
                int transfer=sc.nextInt();
                if(balance<transfer)
                {
                    System.out.println(Colors.RED_BOLD);
                    System.out.println("insufficient balance");
                    System.out.println(Colors.RESET);
                }
                else
                {
                    System.out.println("enter pincode");
                    int a=sc.nextInt();
                    if(a==pincode)
                    {
                        System.out.println(Colors.GREEN_BOLD);
                        System.out.println(transfer+"rs is transfered");
                        System.out.println(Colors.RESET);
                        balance=balance-transfer;
                        System.out.println(Colors.GREEN_BOLD);
                        System.out.println("current balance is"+balance);
                        System.out.println(Colors.RESET);
                    }
                    else
                    {
                        System.out.println(Colors.RED_BOLD);
                        System.out.println("incorrect pincode");
                        System.out.println(Colors.RESET);
                    }
                }
               break;
             }
             case 5:
            {
                System.out.println(Colors.GREEN_BOLD);
               System.out.println("Quit");
               System.out.println(Colors.RESET); 
               break;
            }
        }//switch
        if(ch==5)
        break;
    }//loop 
    
}
}

class Colors {
    // Reset
    public static final String RESET = "\033[0m"; // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m"; // BLACK
    public static final String RED = "\033[0;31m"; // RED
    public static final String GREEN = "\033[0;32m"; // GREEN
    public static final String YELLOW = "\033[0;33m"; // YELLOW
    public static final String BLUE = "\033[0;34m"; // BLUE
    public static final String PURPLE = "\033[0;35m"; // PURPLE
    public static final String CYAN = "\033[0;36m"; // CYAN
    public static final String WHITE = "\033[0;37m"; // WHITE

    // Bold
    public static final String BLACK_BOLD = "\033[1;30m"; // BLACK
    public static final String RED_BOLD = "\033[1;31m"; // RED
    public static final String GREEN_BOLD = "\033[1;32m"; // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m"; // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m"; // CYAN
    public static final String WHITE_BOLD = "\033[1;37m"; // WHITE

    // Underline
    public static final String BLACK_UNDERLINED = "\033[4;30m"; // BLACK
    public static final String RED_UNDERLINED = "\033[4;31m"; // RED
    public static final String GREEN_UNDERLINED = "\033[4;32m"; // GREEN
    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    public static final String BLUE_UNDERLINED = "\033[4;34m"; // BLUE
    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    public static final String CYAN_UNDERLINED = "\033[4;36m"; // CYAN
    public static final String WHITE_UNDERLINED = "\033[4;37m"; // WHITE

    // Background
    public static final String BLACK_BACKGROUND = "\033[40m"; // BLACK
    public static final String RED_BACKGROUND = "\033[41m"; // RED
    public static final String GREEN_BACKGROUND = "\033[42m"; // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m"; // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m"; // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m"; // WHITE

    // High Intensity
    public static final String BLACK_BRIGHT = "\033[0;90m"; // BLACK
    public static final String RED_BRIGHT = "\033[0;91m"; // RED
    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String BLUE_BRIGHT = "\033[0;94m"; // BLUE
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "\033[0;96m"; // CYAN
    public static final String WHITE_BRIGHT = "\033[0;97m"; // WHITE

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m"; // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m"; // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m"; // CYAN
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

    // High Intensity backgrounds
    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m"; // CYAN
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m"; // WHITE
}