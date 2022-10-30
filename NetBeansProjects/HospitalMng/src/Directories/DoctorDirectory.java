/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;
import Classes.*;

import Classes.Person;
import java.util.ArrayList;

/**
 *
 * @author ashit
 */
public class DoctorDirectory {
    private ArrayList<Doctor> doctorDirectory;

    public DoctorDirectory() {
        this.doctorDirectory = new ArrayList<Doctor>();
    }
  
    public ArrayList<Doctor> getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<Doctor> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
      
   
     public Doctor addNewPerson(Doctor doctor) {
        doctorDirectory.add(doctor);
        return doctor;      
    }
     
    public void removePerson(Doctor doctor){
        doctorDirectory.remove(doctor);
    }
    
}
