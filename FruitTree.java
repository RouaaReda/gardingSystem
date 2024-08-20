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

public class FruitTree extends Trees implements DescriptionOfTrees {

    // Attribuite
    private String EnvironmentType;
    private String TypeOfCare;

    // constacter without parmetre
    public FruitTree() {
    }

    // constacter with parmetre
    public FruitTree(String PlantName, String Type, String EnvironmentType, String TypeOfCare, int quanatity, int Price) {
        super(PlantName, Type, quanatity, Price);
        this.EnvironmentType = EnvironmentType;
        this.TypeOfCare = TypeOfCare;
    }

 //setter getter
    public void setEnvironmentType(String EnvironmentType) {
        this.EnvironmentType = EnvironmentType;
    }

    public String getEnvironmentType() {
        return EnvironmentType;
    }
//

    public void setTypeOfCare(String TypeOfCare) {
        this.TypeOfCare = TypeOfCare;
    }

    public String getTypeOfCare() {
        return TypeOfCare;
    }
// method  To calculate the Total Price
    @Override
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
    //Descibe of Fruite Trees
    public void Description(){
        System.out.println("Fruit trees are a type of plant that grows on the surface of the earth "+"\n"
                            + "and is loaded with fruits and possibly flowers");
    }

    @Override
      //to string to orgnize the output
    public String toString() {
     super.toString();
        return EnvironmentType + "\t" + TypeOfCare;
    }
}
