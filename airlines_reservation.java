class Flight {
    private String flightNumber;
    private int totalSeats;
    private int bookedSeats;

    public Flight(String flightNumber, int totalSeats) {
        this.flightNumber = flightNumber;
        this.totalSeats = totalSeats;
        this.bookedSeats = 0;
    }

    public boolean bookSeat() {
        if (bookedSeats < totalSeats) {
            bookedSeats++;
            System.out.println("Seat booked on flight " + flightNumber);
            return true;
        }
        System.out.println("No seats available on flight " + flightNumber);
        return false;
    }

    public void cancelBooking() {
        if (bookedSeats > 0) {
            bookedSeats--;
            System.out.println("Booking canceled on flight " + flightNumber);
        } else {
            System.out.println("No bookings to cancel.");
        }
    }

    public void checkAvailability() {
        System.out.println("Available seats on flight " + flightNumber + ": " + (totalSeats - bookedSeats));
    }
}

