package Orders;
/*****************************************************/
/* File: Order.java                                  */
/* CMIS242                                           */
/* Created by: James F. Gibson Jr                    */
/* Date: 10/14/2011                                  */
/*                                                   */
/* Define instance variables                         */         
/*    orderId, clientName, orderValue                */
/*                                                   */
/*     constructor with arguments                    */
/*                                                   */
/*      get/set methods for variables                */
/*                                                   */
/*                                                   */
/*                                                   */
/*                                                   */
/*                                                   */




public class Order {

    public int orderId;
    public String clientName;
    public double orderValue;
    private java.util.Date dateCreated;
    
    //Default Constructor
    public Order(){
        dateCreated = new java.util.Date();
        orderId = 1;
        clientName = "JGibson";
        orderValue = 5000.00;
        
    }    
        
    
    
    //Constructor
    public Order (int orderId, String clientName, double orderValue){
        dateCreated = new java.util.Date();
        this.orderId = orderId;
        this.clientName = clientName;
        this.orderValue = orderValue;
    }
    
   //Return orderId
    public int getOrderId(){
        return orderId;
    }
         
   //Set orderId
    public void setOrderId(int orderID){
        this.orderId = orderId;
    }
    
   //Return clientName
    public String getClientName(){
        return clientName;
    }
    
    //Set clientName
    public void setClientName(String clientName){
        this.clientName = clientName;
    }
    
    //Return orderValue
    public double getOrderValue(){
        return orderValue;
    }
    
    //Set orderValue
    public void setOrderValue(double orderValue){
        this.orderValue = orderValue;
    }
    
    //Date Created
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    
    //String representation
    public String toString(){
        return "created on  " + dateCreated;
    }
}
