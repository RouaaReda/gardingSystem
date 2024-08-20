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
public class Date {
    //Attribuite
    private int day;
    private int month;
    private int year;
   
    
    
   //constrouctor without parameter
    public Date() {
        this(0, 0, 0);
    }
//constrouctor with parameter 1  
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
//constrouctor with parameter 2  
    public Date(int month, int year) {

        this.month = month;
        this.year = year;

    }
    
    //setter getter
    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return (day);
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return (month);
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return (year);
    }

   //to string to orgnize the output
    public String toString() {
        return (" " + day + "/" + month + "/" + year);
    }
    public String toString(int month , int year ) {
        return (month + "/" + year);
    }

}
