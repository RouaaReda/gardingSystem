package gardiningcentersystem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
import java.util.Scanner;

public class AromaticTrees extends Trees implements DescriptionOfTrees {

    //Attribuite
    String ScentType;
    String Benefits;

    //constrouctor without parameter
    public AromaticTrees() {
    }

    // constacter with parmetre
    public AromaticTrees(String PlantName, String Type, String ScentType, String Benefits, int quanatity, int Price) {
        super(PlantName, Type, quanatity, Price);
        this.ScentType = ScentType;
        this.Benefits = Benefits;
    }

    //setter getter
    public void setScentType(String ScentType) {
        this.ScentType = ScentType;
    }

    public String getScentType() {
        return ScentType;
    }
//

    public void setBenefits(String Benefits) {
        this.Benefits = Benefits;
    }

    public String getBenefits() {
        return Benefits;
    }

// method  To calculate the Total Price
    public int TotalPrice() {

      Scanner input = new Scanner(System.in);
        System.out.println("Do you want an employee to plant for you?\n"
                + "Don‘t worry we provide a farming service for you,\n "
                + "if you want please enter{Yes}\n if you don‘t want please enter{No} ");
        String getplantintService = input.next();
        int plantintService = 80;

        if (getplantintService.equalsIgnoreCase("Yes")) {
            return this.quanatity * this.Price + plantintService;
        } else {
            return this.quanatity * this.Price;
        }
    }
    //Descibe of Aromatic Trees
    public void Description(){
        System.out.println("An aromatic plant is a plant whose cells contain essential oils"+"\n"+ 
                           "that are used for many purposes such as food, perfume and medicine");
    
    }

    @Override
      //to string to orgnize the output
    public String toString() {
        super.toString();
        return PlantName + "\t" + Type + "\t" + ScentType + "\t" + Benefits + "\t" + quanatity + "\t" + Price;
    }

}

