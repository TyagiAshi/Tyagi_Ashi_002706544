/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author ashit
 */
public class House {
    int houseNo;
    String streetAddress;
    int zipCode;

    public House(int houseNo, String streetAddress, int zipCode) {
        this.houseNo = houseNo;
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
   
    
}
