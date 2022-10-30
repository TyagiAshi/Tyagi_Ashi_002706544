/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author ashit
 */
public class Doctor extends Person{
    int DoctorID;

    public int getDoctorID() {
        return DoctorID;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getRole() {
        return role;
    }

    public int getPersonId() {
        return personId;
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

    public void setDoctorID(int DoctorID) {
        this.DoctorID = DoctorID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
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

    public Doctor(int DoctorID, String name, int phoneNo, String gender, int age, String role, int personId, int houseNo, String streetAddress, int zipCode) {
        super(name, phoneNo, gender, age, role, personId, houseNo, streetAddress, zipCode);
        this.DoctorID = DoctorID;
    }
    
    
}
