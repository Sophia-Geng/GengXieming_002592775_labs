/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DELL
 */
public class VitalSign {
    String date;
    float temperature;
    double bloodPressure;
    int pulse;
    boolean isConcious;
    String sos;
    String kkt;

    public String getSos() {
        return sos;
    }

    public void setSos(String sos) {
        this.sos = sos;
    }

    public String getKkt() {
        return kkt;
    }

    public void setKkt(String kkt) {
        this.kkt = kkt;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public boolean isIsConcious() {
        return isConcious;
    }

    public void setIsConcious(boolean isConcious) {
        this.isConcious = isConcious;
    }
    
    @Override
    public String toString(){
        return getDate();
    }
}
