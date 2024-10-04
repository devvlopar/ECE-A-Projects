class Appointment {
    private String customerName;
    private String service;
    private String timeSlot;
    private boolean isBooked;

    public Appointment(String customerName, String service, String timeSlot) {
        this.customerName = customerName;
        this.service = service;
        this.timeSlot = timeSlot;
        this.isBooked = false;
    }

    public void book() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Appointment booked for " + customerName + " at " + timeSlot);
        } else {
            System.out.println("Time slot is already booked.");
        }
    }

    public void cancel() {
        isBooked = false;
        System.out.println("Appointment canceled.");
    }
}

