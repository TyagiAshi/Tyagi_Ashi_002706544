/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author ashit
 */
public class VitalSigns {
    int weight;
    float bodyTemp;
    int bloodpressure;
    int heartRate;

    public int getWeight() {
        return weight;
    }

    public float getBodyTemp() {
        return bodyTemp;
    }

    public int getBloodpressure() {
        return bloodpressure;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBodyTemp(float bodyTemp) {
        this.bodyTemp = bodyTemp;
    }

    public void setBloodpressure(int bloodpressure) {
        this.bloodpressure = bloodpressure;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public VitalSigns(int weight, float bodyTemp, int bloodpressure, int heartRate) {
        this.weight = weight;
        this.bodyTemp = bodyTemp;
        this.bloodpressure = bloodpressure;
        this.heartRate = heartRate;
    }
    
    
    
    
    
}
