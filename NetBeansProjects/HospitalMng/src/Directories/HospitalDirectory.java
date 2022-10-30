/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;
import Classes.*;

import Classes.Doctor;
import java.util.ArrayList;

/**
 *
 * @author ashit
 */
public class HospitalDirectory {
    private ArrayList<Hospital> hospitalDirectory;

    public HospitalDirectory() {
        this.hospitalDirectory = new ArrayList<Hospital>();
    }
    

    public ArrayList<Hospital> getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(ArrayList<Hospital> hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }
   
     public Hospital addNewPerson(Hospital hospital) {
        hospitalDirectory.add(hospital);
        return hospital;      
    }
     
    public void removePerson(Hospital hospital){
        hospitalDirectory.remove(hospital);
    }
}
