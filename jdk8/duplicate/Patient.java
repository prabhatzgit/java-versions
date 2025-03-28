package jdk8.duplicate;

import java.util.Objects;

public class Patient {
    private int patientId;
    private String patientName;
    private String healthMetrics;

    public Patient(int patientId, String patientName, String healthMetrics) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.healthMetrics = healthMetrics;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getHealthMetrics() {
        return healthMetrics;
    }

    public void setHealthMetrics(String healthMetrics) {
        this.healthMetrics = healthMetrics;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return patientId == patient.patientId && Objects.equals(patientName, patient.patientName) && Objects.equals(healthMetrics, patient.healthMetrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientId, patientName, healthMetrics);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                ", healthMetrics='" + healthMetrics + '\'' +
                '}';
    }
}
