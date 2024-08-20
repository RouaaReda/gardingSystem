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
public class Imported extends Trees implements DescriptionOfTrees {

    //Attribute
    private String SupplyingCountry;

    //constructor without parameters
    public Imported() {

    }

    //constructor with parameters
    public Imported(String SupplyingCountry, String PlantName, String Type, int quanatity, int Price) {
        super(PlantName, Type, quanatity, Price);
        this.SupplyingCountry = SupplyingCountry;
    }

    //setter getter
    public void setSupplyingCountry(String SupplyingCountry) {
        this.SupplyingCountry = SupplyingCountry;
    }

    public String getSupplyingCountry() {
        return SupplyingCountry;
    }

    // method  To calculate the Total Price
    @Override
    public int TotalPrice() {

        int salestax = 100;

        return this.quanatity * this.Price + salestax;
    }

    //Descibe of imported Trees
    public void Description() {
        System.out.println("They are plants that are only available in centain countries"
                + " and are important to other countries. ");
    }

    //to string to orgnize the output
    @Override
    public String toString() {
        super.toString();
        return (SupplyingCountry);
    }

}
