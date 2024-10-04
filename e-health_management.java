class Patient {
    private String patientId;
    private String name;
    private String diagnosis;
    private String treatment;

    public Patient(String patientId, String name, String diagnosis, String treatment) {
        this.patientId = patientId;
        this.name = name;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
    }

    public void updateTreatment(String treatment) {
        this.treatment = treatment;
        System.out.println("Treatment updated.");
    }

    public void viewPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + 
                           ", Diagnosis: " + diagnosis + ", Treatment: " + treatment);
    }
}

