/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author ashit
 */
public class City extends House {
    String city;
    
    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
    
    public City(String city, int houseNo, String streetAddress, int zipCode) {
        super(houseNo, streetAddress, zipCode);
        this.city = city;
    }

}
