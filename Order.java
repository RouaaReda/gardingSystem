/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gardiningcentersystem;

import java.util.Scanner;

/**
 *
 * @author teaf
 */

public class Order {
    
    // Attribuite
   private static  int orderNumber;
   private String client ;
   private  int products;
   private Date date;
   private double total;
   private String orderStatus;

   //constrouctor without parameter
   public Order() {
        this.orderNumber= 0;
        this.client = "unknown";
        this.products=0;
        this.date = null;
        this.total = 0.0;
        this.orderStatus="unknown";        
    }

   //constrouctor with parameter
    public Order(int orderNumber, String client, int products, Date date, double total,String orderStatus) {
        this.orderNumber=orderNumber;
        this.client = client;
        this.products=products;;
        this.date = date;
        this.total = total;
        this.orderStatus= orderStatus;
    }

    //setter getter
    public   void setOrderNumber(int orderNumber) {
        
        this.orderNumber=orderNumber;
        
      
    }

    
    public int getOrderNumber() {
        return orderNumber++;
    }
    
    
    public void setClient(String client) {
        this.client = client;
    }

    
    public String getClient() {
        return client;
    }
    
    
    public void setProducts(int products) {
        this.products = products;
    }

    
    public int getProducts() {
        return products;
    }
    
    
   
    public void setDate(Date date) {
        this.date = date;
    }

    
    public Date getDate() {
        return date;
    }
    
    
    public void setTotal(double total) {
        this.total = total;
        
    }

    
    public double getTotal() {
        return total;
    }
    
    
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    
    public String getOrderStatus() {
        return orderStatus;
    }

     //to string to orgnize the output
    @Override
    public String toString() {
        return ( "\t#"+ orderNumber++  + "\t  " +   client   + "\t   " +   products   + "\t\t     " +     date     + "\t\t  " +   total   + "\t  " +   orderStatus   + "\t" );
    }
    
    
    
    
 //method to return name of client
    public static String client(){
        Scanner  input =new Scanner(System.in);
        String name =input.nextLine();
        return name;
    }
    
    
    
    //method to calculat just total
    public static double Sum (double total ){
        double  sum;
        sum =0+total ;
       return sum;
    }
     //method to calculat total and order 
    public static double Sum (double total, boolean order ){
        double  sum;
        sum =0+total+30 ;
       return sum;
    }
     //method to calculat total , order and discount
    public static double Sum (double total, boolean order,boolean cood ){
        String codmain= "TA4GSH";
        double  sum ;
        Scanner  input =new Scanner(System.in);
         System.out.println(" write the cod ,pleas : ");  
            String cod = input.nextLine();
        if (cod == null ? codmain == null : cod.equals(codmain)){
       sum =0+total+30 - 20 ;
       return sum;
        }
        
        System.out.println("try agine");
        System.out.println("");
        return 0;
    }
    
           
  
   
}
