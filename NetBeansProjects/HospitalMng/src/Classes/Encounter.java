/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ashit
 */
public class Encounter extends VitalSigns {
     public Date timestamp;
    public String patientId;
    public String doctorId;


    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    
    public Encounter(int weight, float bodyTemp, int bloodpressure, int heartRate) {
        super(weight, bodyTemp, bloodpressure, heartRate);
        this.timestamp = timestamp;
        this.patientId = patientId;
        this.doctorId = doctorId;
    }
    
    
}
