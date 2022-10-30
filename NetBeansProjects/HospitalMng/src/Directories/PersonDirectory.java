/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;
import Classes.*;

import java.util.ArrayList;
/**
 *
 * @author ashit
 */
public class PersonDirectory {
    
    private ArrayList<Person> personDirectory;

    public PersonDirectory() {
        this.personDirectory = new ArrayList<Person>();
    }
  
    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
      
   
     public Person addNewPerson(Person person) {
        personDirectory.add(person);
        return person;      
    }
     
    public void removePerson(Person person){
        personDirectory.remove(person);
    }
    
}
