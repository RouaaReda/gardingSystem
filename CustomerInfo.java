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
public class CustomerInfo {
//Attribuite

    private String FirstName;
    private String LastName;
    private int Age;
    private int NumOfTelephone;
    private String EmaillAddres;
    private String password;
    //constrouctor without parameter

    public CustomerInfo() {
    }
    //constrouctor with parameter  

    public CustomerInfo(String FirstName, String LastName, int Age, int NumOfTelephone, String EmaillAddres, String password) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
        this.NumOfTelephone = NumOfTelephone;
        this.EmaillAddres = EmaillAddres;
        this.password = password;
    }
//setter getter

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getFirstName() {
        return FirstName;
    }
    //

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getLastName() {
        return LastName;
    }
//

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getAge() {
        return Age;
    }
    //

    public void setNumOfTelephone(int NumOfTelephone) {
        this.NumOfTelephone = NumOfTelephone;
    }

    public int getNumOfTelephone() {
        return NumOfTelephone;
    }
//

    public void setEmaillAddres(String EmaillAddres) {
        this.EmaillAddres = EmaillAddres;
    }

    public String getEmaillAddres() {
        return EmaillAddres;
    }
//

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void istruepassword(String password) {
        int len = password.length();
        int hash = password.indexOf('#');
        if (len >= 8 && hash >= 0) {
            System.out.println("Your passsword is Accepted");
        } else if (len < 8) {
            System.out.println("Your passsword is Not Accepted because it less than 8");
        } else if (hash < 0) {
            System.out.println("Your passsword is Not Accepted it should include #");
        }
    }
    public void checkEmaill(String EmaillAddres){
    this.EmaillAddres=EmaillAddres.toLowerCase();
    }

    @Override
    public String toString() {
        return  FirstName + "\t" + LastName + "\t" + Age + "\t" + NumOfTelephone + "\t" + EmaillAddres + "\t" + password ;
    }
    
}

