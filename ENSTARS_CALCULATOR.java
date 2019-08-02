import java.util.*;

public class ENSTARS_CALCULATOR
{
   public static void main(String []args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Ensemble Stars multi calc");
      char ch;
      
      
      do
      {
         System.out.println("Operations");
         System.out.println("1. Calculate time till AP bar is filled");
         System.out.println("2. Calculate time till LP bar is filled");
         System.out.println("3. Info on AP and LP equations");
         System.out.println("4. Exit");
         
         int choice = input.nextInt();
         
         switch(choice)
         {
            case 1://AP
               int hoursAP =0;
               System.out.println("Please enter your max AP");
               int maxAP = input.nextInt();
               System.out.println("Please enter your current AP");
               int curAP = input.nextInt();
               
               if(curAP == maxAP)
                  {
                     System.out.println("Your current AP equals your maximum AP.");
                  }
               else if (curAP > maxAP)
                  {
                     System.out.println("Your curent AP is greater than your maximum AP.");
                     System.out.println("You are in overflow mode and can not gain AP until");
                     System.out.println("you make your current AP lower than your max AP.");
                  }
                  
               else 
                  {
                     curAP = maxAP - curAP;
                     //int hoursAP;
                     
                     do
                     {
                        curAP = curAP-20;
                        hoursAP++;
                        if(curAP == 20)
                        {
                           hoursAP++;
                           curAP =0;
                        }
                     }while(curAP > 20);
                     
                     curAP = curAP*3;
                  }
                  System.out.println("You AP bar will be filled in "+ hoursAP +" hours and "+ curAP + " minutes");
                  
                  break;
                  
            case 2://LP
               int hoursLP =0;
               int minLP = 0;
               System.out.println("Please enter in your current LP");
               int curLP = input.nextInt();
               //System.out.println("Please enter in your max LP");
               
               if (curLP == 5)
                  {
                     System.out.println("Your current LP equals your maximum LP");
                  }
               else if(curLP > 5)
                  {
                     System.out.println("Your curent LP is greater than your maximum LP.");
                     System.out.println("You are in overflow mode and can not gain LP until");
                     System.out.println("you make your current LP lower than 5(Max LP).");
                  }
               else
                  {
                     curLP = 5-curLP;
                     
                     do
                     {
                        curLP = curLP-2;
                        hoursLP++;
                        
                        if(curLP == 2)
                           {
                              hoursLP++;
                              curLP=0;
                           }
                        else if(curLP == 1)
                        {
                           minLP= 30;
                           curLP =0;
                        }
                        
                        
                     }while(curLP >5);
                     
                     curLP = curLP/2;
                  }
               
               System.out.println("Your LP bar will be filled in "+ hoursLP + " hours and "+ minLP + " minutes");
               break;
               
            case 3://Information/formulas
               System.out.println("In order to figure out remaining time for AP:");
               System.out.println("1 AP is 3 minutes therefore in a hour you gain 20 AP\n");
               System.out.println("In order to calculate remaining time for LP: ");
               System.out.println("LP is easy since 1 LP per 30 min is 2 LP per hour");
               System.out.println("Quick Maths:");
               System.out.println();
               
               System.out.println("AP");
               System.out.println("20 AP = 1 hr");
               System.out.println("40 AP = 2 hrs");
               System.out.println("60 AP = 3 hrs");
               System.out.println("* HINT: if its divisable by 20 then remove the zeros and divide. That's your hours");
               System.out.println();
               
               System.out.println("LP");
               System.out.println("1 AP = 30 min");
               System.out.println("2 AP = 1 hr");
               System.out.println("Full AP (5) = 2.5 hrs");
               System.out.println("*Since the permanet cap for AP that can be filed is 5, the max you'll need to wait is");
               System.out.println("2 hours and 30 minutes. Overflowed AP (Anything over 5) does nothing for your meter ");
               System.out.println("in terms of time.");
               
               break;
            case 4:
               //
               System.exit(0);
               
               
               break;
               
            default:
               System.out.println("Wrong Entry\n");
               
               break;
         }
         
         System.out.println("\nWould you like to continue? (Enter y or n) \n");
         ch = input.next().charAt(0);
         
      }while(ch == 'Y' || ch == 'y');
      
      System.out.println("Terminating");
      
      
   }
}