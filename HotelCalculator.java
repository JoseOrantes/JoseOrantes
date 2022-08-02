import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.DecimalFormat;

public class HotelCalculator
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    boolean mainLoop = true;
    int op = 0, tier1 = 0; 
    double num_1 = 0, num_2 = 0, num_3 = 0, ans_1 = 0, Night = 0, ans = 0;
    while(true)
    {
      System.out.println("");
      System.out.println("*******************************************");
      System.out.println("***                                     ***");
      System.out.println("***      - Discounts Calculator         ***");
      System.out.println("***     - Loyalty Program Calculator    ***");
      System.out.println("***                                     ***");
      System.out.println("***                                     ***");
      System.out.println("***                       Version: 1.0  ***");
      System.out.println("*******************************************");
      System.out.println("");
      System.out.println("Press 1 for Discounts Calculator:  ");
      System.out.println("Press 2 for Loyalty Program Calculator:  ");
      System.out.println("Press 3 to exit application ");
      System.out.println("");
      op = in.nextInt();
      if(op == 1)
      {    
      while(true)
      { 
        System.out.println("");
        System.out.println("*******************************************");
        System.out.println("***                                     ***");
        System.out.println("***                                     ***");
        System.out.println("***         Discounts Calculator        ***");
        System.out.println("***                                     ***");
        System.out.println("***                                     ***");
        System.out.println("***                       Version: 1.0  ***");
        System.out.println("*******************************************");
        System.out.println("");

      // Code for discounts
        System.out.println("Welcome to the Discounst Calculator! ");
        System.out.println("");
        System.out.println("Does the rate have a discount already applied?  ");
        System.out.println("");
        System.out.println("Press 1 for Yes");
        System.out.println("Press 2 for No");
        System.out.println("Press 3 for Main menu");
        System.out.println("");
        op = in.nextInt();
        if(op == 1)
        {
          System.out.println("");
          System.out.println("Input base rate:  ");
          System.out.println("");
          num_1 = in.nextDouble();
          System.out.println("");
          System.out.println("Input original discount %:  ");
          System.out.println("");
          num_2 = in.nextDouble();
          System.out.println("");
          System.out.println("Input additional discount %:  ");
          System.out.println("");
          num_3 = in.nextDouble();
          System.out.println("");
          ans_1 = num_1 - ((num_1 * num_2) / 100);
          ans = ans_1 - ((num_1 * num_2) / 100);
          System.out.println("");
          DecimalFormat df = new DecimalFormat("###.##");
          System.out.println("The discounted rate is:  $"+df.format(ans));
          System.out.println("");
          System.out.println(""); 
        }
        else if(op == 2)
        {
          System.out.println("");
          System.out.println("Input base rate:  ?  ");
          System.out.println("");
          num_1 = in.nextDouble();
          System.out.println("");
          System.out.println("Input discount %?  ");
          num_2 = in.nextDouble();
          System.out.println("");
          ans = num_1 - ((num_1 * num_2) / 100);
          System.out.println("");
          DecimalFormat df = new DecimalFormat("###.##");
          System.out.println("The discounted rate is:  $"+df.format(ans));
          System.out.println("");
          System.out.println("");
        }
        else if(op == 3)
        {
          System.out.println("");
          break;
        }
        else if(op >= 4)
        {
          System.out.println("Invalid entry.  Please try again");
          System.out.println("");
          System.out.println("");
        }
        }
      }
      else if(op == 2)
      {
      while(true)
      {
        {
          System.out.println("");
          System.out.println("*******************************************");
          System.out.println("***                                     ***");
          System.out.println("***                                     ***");
          System.out.println("***        Loyalty Calculator           ***");
          System.out.println("***                                     ***");
          System.out.println("***                                     ***");
          System.out.println("***                       Version: 1.0  ***");
          System.out.println("*******************************************");
          System.out.println("");
          System.out.println("Welcome to the Loyalty Calculator");
          System.out.println("");
          System.out.println("Press 1 to calculate points earned");
          System.out.println("Press 2 to go back to main menu");
          System.out.println("");
          op = in.nextInt();
          if(op == 1)
          {
            System.out.println("");
            System.out.println("Input the number of nights:  ");
            System.out.println("");
            Night = in.nextDouble();
            System.out.println("");
            System.out.println("Input the average daily rate:  ");
            System.out.println("");
            num_1 = in.nextDouble();
            System.out.println("");
            System.out.println("Select the Loyalty Tier: ");
            System.out.println("");
            System.out.println("Press 1 for Base Tier");
            System.out.println("Press 2 for Gold Tier");
            System.out.println("Press 3 for Platinum Tier");
            System.out.println("Press 4 for Diamond Tier");
            System.out.println("Press 5 for Diamond Select Tier");
            System.out.println("");
            tier1 = in.nextInt();
            if(tier1 == 1)
            {
            System.out.println("");
            ans = Night * num_1 * 10;
            DecimalFormat df = new DecimalFormat("###.##");
            System.out.println("");
            System.out.println("Points earned Base Member:  " +df.format(ans));
            System.out.println("");
            }
            else if(tier1 == 2)
            {  
            System.out.println("");
            ans = (Night * num_1 * 10) + ((Night * num_1 * 10) * 0.10);
            DecimalFormat df = new DecimalFormat("###.##");
            System.out.println("Points earned Gold Member:  " +df.format(ans));
            System.out.println("");
            }
            else if(tier1 == 3)
            {
            System.out.println("");
            ans = (Night * num_1 * 10) + ((Night * num_1 * 10) * 0.15);
            DecimalFormat df = new DecimalFormat("###.##");
            System.out.println("Points earned Platinum Member:  " +df.format(ans));
            System.out.println("");
            }
            else if(tier1 == 4)
            {
            System.out.println("");
            ans = (Night * num_1 * 10) + ((Night * num_1 * 10) * 0.30);
            DecimalFormat df = new DecimalFormat("###.##");
            System.out.println("Points earned Diamond Member:  " +df.format(ans));
            System.out.println("");
            }
            else if(tier1 == 5)
            {
            System.out.println("");
            ans = (Night * num_1 * 10) + ((Night * num_1 * 10) * 0.50);
            DecimalFormat df = new DecimalFormat("###.##");
            System.out.println("Points earned Diamond Select Member:  " +df.format(ans));
            System.out.println("");
            }
            else if(tier1 >= 6)
            {
            System.out.println("");
            System.out.println("Invalid Entry,  please try again");
            System.out.println("");
            }
          }
          else if(op == 2)
          {
            System.out.println("");
            break;
          }
          }
      }
      }
        else if(op == 3)
        {
        System.out.println("");
        System.out.println("Exiting Application Good Bye!...");
        System.exit(0);
        }
    }
  }
}