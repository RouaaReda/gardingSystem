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
public class Seed implements DescriptionOfTrees {
// Attribuite

    private String SeedName;
    private String SeedId;
    private int NumberOfSeed;
    private int Quantity;
    private int Price;
    //constrouctor without  parameter

    public Seed() {
    }
    //constrouctor with parameter

    public Seed(String SeedName, int NumberOfSeed, int Quantity, int Price) {
        this.SeedName = SeedName;
        this.NumberOfSeed = NumberOfSeed;
        this.Quantity = Quantity;
        this.Price = Price;
    }

    //setter getter
    public void setSeedName(String SeedName) {
        this.SeedName = SeedName;
    }

    public String getSeedName() {
        return SeedName;
    }

    //
    public void setSeedId(String SeedId) {
        this.SeedId = SeedId;
    }

    public String getSeedId() {
        return SeedId;
    }

    //
    public void setNumberOfSeed(int NumberOfSeed) {
        this.NumberOfSeed = NumberOfSeed;
    }

    public int getNumberOfSeed() {
        return NumberOfSeed;
    }
//

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public int getQuantity() {
        return Quantity;
    }

    //
    public void setPrice(int Price) {
        this.Price = Price;
    }

    public int getPrice() {
        return Price;
    }

    public int TotalPrice() {
        return this.Quantity * this.Price;
    }

    //
    public void Description() {
        System.out.println("The seed is one of the component parts of the plant,\n"
                + "and in botany the seed is known as the part responsible for\n "
                + "the propagation and reproduction of the plant.");
    }

    @Override
    public String toString() {

        return SeedName + "\t" + NumberOfSeed + "\t\t" + Quantity + "\t\t" + TotalPrice();
    }

}

