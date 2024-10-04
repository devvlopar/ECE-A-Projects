class Cab {
    private String cabId;
    private boolean isBooked;

    public Cab(String cabId) {
        this.cabId = cabId;
        this.isBooked = false;
    }

    public void bookCab() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Cab " + cabId + " booked.");
        } else {
            System.out.println("Cab " + cabId + " is already booked.");
        }
    }

    public void cancelBooking() {
        if (isBooked) {
            isBooked = false;
            System.out.println("Booking for Cab " + cabId + " cancelled.");
        } else {
            System.out.println("Cab is not booked.");
        }
    }

    public boolean isAvailable() {
        return !isBooked;
    }
}

