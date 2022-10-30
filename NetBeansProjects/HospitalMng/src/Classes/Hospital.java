/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author ashit
 */
public class Hospital extends Community {
    int hospitalID;

    public Hospital(int hospitalID, String Community, String city, int houseNo, String streetAddress, int zipCode) {
        super(Community, city, houseNo, streetAddress, zipCode);
        this.hospitalID = hospitalID;
    }

    public int getHospitalID() {
        return hospitalID;
    }

    public String getCommunity() {
        return Community;
    }

    public String getCity() {
        return city;
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

    public void setHospitalID(int hospitalID) {
        this.hospitalID = hospitalID;
    }

    public void setCommunity(String Community) {
        this.Community = Community;
    }

    public void setCity(String city) {
        this.city = city;
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
