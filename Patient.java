public class Patient {

    private String patientName;
    private String patientID;
    public Patient(String name, String id){
        this.patientName = name;
        this.patientID = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String toString(){
        return "Name: " + patientName + " ID: " + patientID;
    }
}
