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
public abstract class Trees {

    // Attribuite
    protected String PlantName;
    protected String PlantID;
    protected String Type;
    protected int quanatity;
    protected int Price;
    //constrouctor without parameter
    public Trees() {
    }
    //constrouctor with parameter
    public Trees(String PlantName, String Type, int quanatity, int Price) {
        this.PlantName = PlantName;
        this.Type = Type;
        this.quanatity = quanatity;
        this.Price = Price;
    }
    //setter getter
    public void setPlantName(String PlantName) {
        this.PlantName = PlantName;
    }
    public String getPlantName() {
        return PlantName;
    }
//
    public void setPlantID(String PlantID) {
        this.PlantID = PlantID;
    }
    public String getPlantID() {
        return PlantID;
    }
//
    public void setType(String Type) {
        this.Type = Type;
    }
    public String getType() {
        return Type;
    }
//
    public void setQuanatity(int quanatity) {
        this.quanatity = quanatity;
    }
    public int getQuanatity() {
        return quanatity;
    }
//  
    public void setPrice(int Price) {
        this.Price = Price;
    }
    public int getPrice() {
        return Price;
    }
    // method  To calculate the Totalprice
    public abstract int TotalPrice();

    @Override
      //to string to orgnize the output
    public String toString() {
        return PlantName + "\t" + Type + "\t" + quanatity + "\t" + Price;
    }

}

