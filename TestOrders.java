/*****************************************************/
/* File: TestOrders.java                             */
/* CMIS242                                           */
/* Created by: James F. Gibson Jr                    */
/* Date: 10/14/2011                                  */
/*                                                   */
/* Inputs: Read data from use input with keyboard    */         
/*   and argument constructors                       */
/*                                                   */
/* Output user entered data and constructor          */
/*   data to the console                             */
/*                                                   */
/*                                                   */
/*                                                   */
/*                                                   */
/*                                                   */
/*                                                   */
/*****************************************************/
package Orders;

//Import Scanner
import java.util.Scanner;

public class TestOrders {

    //Main
    public static void main(String[] args) {
        
        //Order object ord1
        Order ord1 = new Order(1, "JGibson", 5000.00);
        System.out.println("This order " + ord1.toString());
        System.out.printf ("Order #1 \n Your Customer  ID is: %s\n Your Client name is: %s\n Your order total is: %10.2f\n",
        ord1.getOrderId(), ord1.getClientName(), ord1.getOrderValue()); 
        
        //Order Object cord1
        CreditOrder cord1 = new CreditOrder(2, "JSmith", 2500.00, 10);
        System.out.println("This order " + cord1.toString());
        System.out.printf ("Credit Order #1 \n Your customer ID is: %s\n Your Client name is: %s\n Your order total with interest is: %10.2f\n",
        cord1.getOrderId(), cord1.getClientName(), cord1.getCreditOrderTotalValue());
        
        //Create Scanner
        Scanner input = new Scanner(System.in);
        
        
        
        //Ask for orderId
        System.out.println("Please enter your order Id (for example 10):");
        int orderId = input.nextInt();
        
        //Ask for user clientname 
        System.out.println("Please enter your client name (for example JGibson):");
        String clientName = input.next();
        
        //Ask for user interest rate
        System.out.println("Please enter the agreed upon interest rate (for example 10.50):");
        double interest = input.nextDouble();
        
        //Ask for users order total
        System.out.println("Please enter your order total (for example 2500.00):");
        double orderValue = input.nextDouble();
        
        
        //Credit order 2 constructor
        CreditOrder cord2 = new CreditOrder(orderId, clientName, orderValue, interest);
        System.out.println("This order " + cord1.toString());
        System.out.printf ("Your order ID is: %s\n Your client name is %s\n The agreed upon interest rate is: %10.2f\n Your order value with interest is %10.2f\n  ",
        cord2.getOrderId(), cord2.getClientName(), cord2.getInterest(), cord2.getCreditOrderTotalValue()); 
        
        
        //Test if client name is the same
        if (!(cord1.clientName).equals(cord2.clientName))
        
            System.out.println("The orders were placed by different clients.");
            else
            System.out.println("The orders were placed by the same client.");
        
        
        //Test if Credit Order Value is the same
        if (cord1.orderValue > cord2.orderValue){
            System.out.println("Credit order #1 has generated the larger income for SMC, with a value of: " +cord1.orderValue);
            }
            else 
                if(cord2.orderValue > cord1.orderValue){
                    System.out.println("Credit order #2 has generated the larger income for SMC, with a value of: " +cord2.orderValue);
                    }
                  else{
                       System.out.println("The credit order amounts are the same");
                        }
        //Close the scanner - Free resources and prevent memory leak
        input.close();
        
     }
   }

