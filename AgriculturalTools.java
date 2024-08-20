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

public class AgriculturalTools implements DescriptionOfTrees {
    
    //Attributes
    private String NameofTool;
    private String Use;
    private String MadeIn;
    private int Quantity;
    private int price;
    
    //constructor without parameters
    public AgriculturalTools(){
        
    }
    //constructor with parameters

    public AgriculturalTools(String NameofTool, String Use, String MadeIn, int Quantity, int price) {
        this.NameofTool = NameofTool;
        this.Use = Use;
        this.MadeIn = MadeIn;
        this.Quantity = Quantity;
        this.price = price;
    }
 
    // setter getter
    public void setNameofTool(String NameofTool) {
        this.NameofTool = NameofTool;
    }

    public String getNameofTool() {
        return NameofTool;
    }
    public void setUse(String Use) {
        this.Use = Use;
    }

    public String getUse() {
        return Use;
    }

    public void setMadeIn(String MadeIn) {
        this.MadeIn = MadeIn;
    }

    public String getMadeIn() {
        return MadeIn;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    //Descibe of AgriculturalTools Trees
 public void Description(){
     System.out.println("These high-quality tools help in planting plants. ");
 
 }
    //to string to orgnize the output
    @Override
    public String toString(){
    return ( NameofTool+"\t"+Use+"\t"+MadeIn+"\t"+Quantity+"\t"+price );
    }


}
