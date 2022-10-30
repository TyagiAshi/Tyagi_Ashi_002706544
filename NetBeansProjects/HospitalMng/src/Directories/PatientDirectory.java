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
public class PatientDirectory {
    private ArrayList<Patient> patientDirectory;

    public PatientDirectory() {
        this.patientDirectory = new ArrayList<Patient>();
    }
  
    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPersonDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
      
   
     public Patient addNewPerson(Patient patient) {
        patientDirectory.add(patient);
        return patient;      
    }
     
    public void removePerson(Patient patient){
        patientDirectory.remove(patient);
    }
    
}
