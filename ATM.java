/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gardiningcentersystem;

/**
 *
 * @author HP
 */

import java.util.Scanner;
public class ATM {
    
    //Attribute
    private String name;
    private int cardـNumber;
    private Date cardـDate;
    private int safety_Code;
 
    //constructor without parameters
    public ATM() {
        this.name = "unknoun";
        this.cardـNumber = 0;
        this.cardـDate = null;
        this.safety_Code = 0;
    }
     //constructor with parameters
    public ATM(String name, int cardـNumber, Date cardـDate, int safety_Code) {
        this.name = name;
        this.cardـNumber = cardـNumber;
        this.cardـDate = cardـDate;
        this.safety_Code = safety_Code;
    }

    //setter getter
    public void setName(String name) {
        this.name = name;
    }

    public void setCardـNumber(int cardـNumber) {
        this.cardـNumber = cardـNumber;
    }

    public void setCardـDate(Date cardـDate) {
        this.cardـDate = cardـDate;
    }

    public void setSafety_Code(int safety_Code) {
        this.safety_Code = safety_Code;
    }

    public String getName() {
        return name;
    }

    public int getCardـNumber() {
        return cardـNumber;
    }

    public Date getCardـDate() {
        return cardـDate;
    }

    public int getSafety_Code() {
        return safety_Code;
    }
    
     //to string to orgnize the output
    @Override
    public String toString() {
        
        return "ATM{" + "name=" + name + ", card_Number=" + cardـNumber + ", card_Date=" + cardـDate + ", safety_Code=" + safety_Code + '}';
    }

    //method to print  credit card
public static void creditCard(){
        //The name written on the card
         Scanner  input =new Scanner(System.in);
        System.out.println("Enter your name on the card");
        String name =input.nextLine();
        //card number
         System.out.println("Enter number of card ");
        int number []=new int[16];
        for (int count =0;count<number.length;count++){
        number[count]=input.nextInt();
        }
        //card date
        System.out.println("enter the dat of card monthe and year:");
           int  month=input.nextInt();
           int  year=input.nextInt();
          Date date = new Date();
        //safety Code
            System.out.println("Enter number of safety Code ");
        int number_of_cod[]  =new int[3];
        for (int count =0;count<number_of_cod.length;count++){
        number_of_cod[count]=input.nextInt();
        }
        //print name 
        System.out.println("------------------------------------------------------------------");
         System.out.println("the name is : \n "+name );
           //print number of card 
        System.out.println ("the card Number is: ");
        for (int count =0;count<number.length;count++){  
        System.out.print(number[count]+" ");
        }
        // print date of card 
        System.out.println();
        System.out.println("the card date is :\n"+date.toString(month,year));
        //print safety Code
        System.out.print("the safety Code is :\n");
        for (int count =0;count<number_of_cod.length;count++){
            
            System.out.print(number_of_cod[count]+" ");
            
        
        }
        System.out.println();
    }

}
