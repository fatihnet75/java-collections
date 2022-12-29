/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package odev3;

/**
 *
 * @author Fatih
 */
public class contact implements Comparable<contact>{
    
     private String SosialSecurityNumber;
    private String FirstName;
    private String LastName;
    private String PhoneNumber;

    public contact() {
    }

    public contact(String SosialSecurityNumber, String FirstName, String LastName, String PhoneNumber) {
        this.SosialSecurityNumber = SosialSecurityNumber;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.PhoneNumber = PhoneNumber;
    }

    @Override
    public String toString() {
        return  SosialSecurityNumber + " " + FirstName + " " + LastName + ""
                + " " + PhoneNumber;
    }

    public String getSosialSecurityNumber() {
        return SosialSecurityNumber;
    }

    public void setSosialSecurityNumber(String SosialSecurityNumber) {
        this.SosialSecurityNumber = SosialSecurityNumber;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }
    
    @Override
    public int compareTo(contact o) {
      return 0;
    }

}
    


