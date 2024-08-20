/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gardiningcentersystem;

/**
 *
 * @author teaf
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Gardiningcentersystem {

    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i =1;i <=4;i++){
        Scanner input = new Scanner(System.in);
        System.out.println("*Hello and Welcome to our Gardining center*\n(to sign in you must fill: )\nFirst Name:");
         String name = Order.client();
        System.out.println("Last Name:");
         String name2 = Order.client();
        System.out.println("Age:");
        int Age = input.nextInt();
        System.out.println("Number Of Telephone:");
        int NumOfTelephone = input.nextInt();
        input.nextLine();
        System.out.println("Emaill Addres:");
        String EmaillAddres = input.nextLine();
        System.out.println("passsword: \nPassword length must be 8 and contain the # sign.");
        String passsword = input.nextLine();
        CustomerInfo customer = new CustomerInfo(name ,name2, Age, NumOfTelephone, EmaillAddres, passsword);
        customer.checkEmaill(EmaillAddres);//to check the Emaill
        customer.istruepassword(passsword);//to check thepasssword
        System.out.println(" Enter [true] if you sign in");//ask the user if sing in the a plecation if true his can comblet or cancled the order if false his cann't
         boolean y=input.nextBoolean(); 
        
         System.out.println("------------------------------------------------------------------");
         
        if (y==true){
        System.out.println(" Hello  ");
        System.out.println("FirstName\tLastName\tAge\tNumOfTelephone\t\tEmaillAddres\t\t\tpasssword");
        System.out.println(customer);
        System.out.println("------------------------------------------------------------------");
      
        
        double sum ;
        double total;
       
        System.out.println("");
        
        System.out.println("Enter[1] for Seed \n[2] for Fruite\n[3]imported");
        int option = input.nextInt();
       //1
            sum= Sum(option);
            total=sum;
           System.out.println("");
         System.out.println(" Enter [true] if you want chouse another product or false if you want  next step ") ;//ask the user if you want chouse another product
         boolean x=input.nextBoolean();
          //the original if [true]
          if (x==true){
          //2
          System.out.println("Enter[1] for Seed \n[2] for Fruite\n[3]imported");
           option = input.nextInt();
          total=total+Sum(option);
          System.out.println("");
          System.out.println(" Enter [true] if you want chouse another product or false if you want  next step ") ;//ask the user if you want chouse another product
          x=input.nextBoolean();
            //nested if [true] ->1
             if (x==true){ 
             //3
             System.out.println("Enter[1] for Seed \n[2] for Fruite\n[3]imported");
              option = input.nextInt();
             total=total+Sum(option);
             System.out.println("");
             System.out.println(" Enter [true] if you want chouse another product or false if you want  next step ") ;//ask the user if you want chouse another product
             x=input.nextBoolean();
                //nested if [true] ->2
                if (x==true){
                    //4
                    System.out.println("Enter[1] for Seed \n[2] for Fruite\n[3]imported");
              option = input.nextInt();
                    total=total+Sum(option);}
                 
                
             }
             
               
          }
                 
         
          
           //the original if [false]          
           if (x==false ){
                System.out.println("pleas sum all the number of product for every type your choose it: ");
                int product =input.nextInt();
              System.out.println("------------------------------------------------------------------");
            System.out.println(" Enter [true] to complete the order OR [false]  to no complete the order ");//ask the user if you want   comblet or cancled the order if true his can complet nether can not 
         boolean c=input.nextBoolean();
   
       if (c==true){
           
        System.out.println("Delivery value 30. If you want delivery, enter [true]"); //ask the user if you want  drive or not if want asked if you have  discount code or not 
        boolean drive=input.nextBoolean();
      
        
        if (drive == true ){
            System.out.println(" if you have a discount code enter [true] ");//if the user have dicount 
           boolean cod =input.nextBoolean();
           
          if (cod == true ){
             
         
              Order.Sum(total, drive,cod);
            
          }
            
          if (cod == false )//if the user want just delvery
          {
              Order.Sum(total, drive); 
          }
          
        if (drive==false)//if the user don't want delvery
        {
            
         Order.Sum(total);
        }
        
        }
        
        //Ask the user if he wants to pay cash or ATM
        System.out.println("When you choose cash, you will receive the order from 7-14 days, but the ATM is from 3-7 days ");
        System.out.println("What is the payment waays you want?\n Enter [true] if you want \"Cash\" OR [fals] if you want \"ATM\"  ");
        boolean z=input.nextBoolean();
        
        if (z ==true ){
        System.out.println("operation accomplished successfully");}
        
        if (z==false){
            
          
          
           ATM.creditCard();
           
              System.out.println("operation accomplished successfully");
              
        }
        
        
      
        
        Order obj1 = new Order();
       
       obj1.setOrderNumber(i);
        System.out.println("------------------------------------------------------------------");
        //send data of his order
       Order obj = new Order(obj1.getOrderNumber(),name+" "+name2,product,new Date(4,9,1443),total,"Being processed");
       System.out.println (" Order number " + "\t   " + " Client " + "\t" + " Products " + "\t" + " The date of order " + "\t" + " Total " + "\t" + " Order status " + "\t" );
       System.out.println(obj+"\n"); 
       System.out.println("------------------------------------------------------------------");
       }
       
       
       
       
       if (c==false){
         System.out.println(" The request has been cancelled "); } 
           System.out.println("\n");      
             }
         
             
             }
       
       if (y==false){
        System.out.println("Sorry,The request cannot be completed unless you are logged in   ");
        System.out.println("\n"); 
       }
}
    }

    
    










    
    
    
    
    
    
    
    


public static int Sum (int option ){
        
    
    Scanner input = new Scanner(System.in);
     ArrayList<String> Bill = new ArrayList<String>();//Array listفاتوره
        int total = 0;

        Seed s1 = new Seed("lavender", 50, 1, 7);
        Seed s2 = new Seed("Queer flour", 100, 1, 10);
        Seed s3 = new Seed("yellow paper", 100, 1, 15);
        Seed s4 = new Seed("wild fennel", 50, 1, 6);
        Seed s5 = new Seed("sage herb", 50, 1, 10);
        Seed sAl[] = {s1, s2, s3, s4, s5};//Array of Object
        ////////////////////////////////////////////////////////////////////////
        int product=0 ;
       
    switch (option) { //سويتش الاصليه
       
            case 1:
                System.out.println("Enter[1]to Buy from the Store or [2] to Search");
                int option2 = input.nextInt();
                switch (option2) {//سويتش الفرعسه
                    case 1:
                        System.out.println("------------------------------------------------------------------");
                        System.out.println("Name\t\t" + "NumberOfSeed\t" + "Quantity\t" + "Price");
                        for (int i = 0; i < 5; i++) {
                            System.out.println(i + 1 + ")" + sAl[i]);
                        }
                        s1.Description();
                        ////////////////////////////////////////////////////////////////////////

                        System.out.println("------------------------------------------------------------------");
                        while (true) {
                            System.out.println("Enter number of product that you want to buy or [-1] if you finish:");
                            int ProductNum = input.nextInt();//راح ناخد من المستخدم رقم المنتج
                            
                             product ++;
                             
                            if (ProductNum == -1) {//اذا دخل المستخدم<-1>راح يوقف اللوب 
                                break;
                            }
                            System.out.println("Enter the Quantity of the product you want : :");

                            //نقصنا واجد عشان الاندكس للمصفوفه يبدأ من صفر
                            //اخدنا الكميه من المستخدم
                            sAl[ProductNum - 1].setQuantity(input.nextInt());//4-1=3
                            //اوجدنا عدد البذور ضربنا الكميه في عدد البذور
                            sAl[ProductNum - 1].setNumberOfSeed(sAl[ProductNum - 1].getQuantity() * sAl[ProductNum - 1].getNumberOfSeed());
                            //اوجدنا السعر النهائي
                            sAl[ProductNum - 1].TotalPrice();
                            //نضيف العناصر للفاتوره باستخدام الارراي ليست
                            Bill.add(sAl[ProductNum - 1].toString());
                            //مجموع سعر جميع المنتجات المختاره
                            total += sAl[ProductNum - 1].TotalPrice();

                        }
                        System.out.println("the Bill :" + Bill);//طبعنا الفاتورة
                        System.out.println("the total price for the every product you buy:"+total );
                        product=product-1;
                        System.out.println("The number of products is:"+product );
                                return total; //نطبع السعر الكلي
                       
                    case 2:
                        input.nextLine();
                        boolean found = true;
                        System.out.println("Enter the Product Name:");
                        String name = input.nextLine();
                        for (int i = 0; i < 5; i++) {
                            if (sAl[i].getSeedName().equalsIgnoreCase(name)) {
                                System.out.println("Name\t\t" + "NumberOfSeed\t" + "Quantity\t" + "Price");
                                System.out.println(sAl[i].toString());
                                found = false;
                            }
                        }
                        if (found == true) {
                            System.out.println("the Product doesn‘t Exist");
                        }
                        break;
                    default:
                        System.out.println("failed Operation ");
                        break;
                }

            case 2:
return 4;
            case 3:
return 5;
            case 4:
                return 6;
    }
    return 0;
    }


 
}



