/*****************************************************/
/* File: CreditOrder.java                            */
/* CMIS242                                           */
/* Created by: James F. Gibson Jr                    */
/* Date: 10/14/2011                                  */
/*      Inherits Class Order                         */
/* Define instance variables                         */         
/*    interest                                       */
/*                                                   */
/*     constructor with arguments                    */
/*                                                   */
/*      get/set methods for variables                */
/*                                                   */
/*      methods for toString and                     */
/*      getCreditOrderTotalValue                     */
/*                                                   */
/*                                                   */
/*****************************************************/
package Orders;


public class CreditOrder extends Order{
    public double interest;
    public double creditOrderTotalValue;
    
    
    
    
    
    //Constructor
     public CreditOrder (int orderId, String clientName,  double orderValue, double interest){
        super(orderId, clientName, orderValue); 
        this.interest = interest;
        this.creditOrderTotalValue = creditOrderTotalValue;
    }
    
    //Return interest
    public double getInterest(){
        return interest;
    }
    
    //Set interest
    public void setInterest(double interest){
        this.interest = interest;
    }
    
    //Return Total Order
    public double getCreditOrderTotalValue(){
        return ((interest / 100)*orderValue + orderValue);
    }
    
    //Set Total Order
    public void setCreditOrderTotalValue(double creditOrderTotalValue){
        this.creditOrderTotalValue = creditOrderTotalValue;
    }
    
    
}
