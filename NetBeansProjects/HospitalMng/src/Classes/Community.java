/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author ashit
 */
public class Community extends City{
    String Community;

    public String getCommunity() {
        return Community;
    }

    public void setCommunity(String Community) {
        this.Community = Community;
    }

    public Community(String Community, String city, int houseNo, String streetAddress, int zipCode) {
        super(city, houseNo, streetAddress, zipCode);
        this.Community = Community;
    }
    
}
