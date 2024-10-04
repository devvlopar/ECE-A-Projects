class Room {
    private int roomNumber;
    private boolean isBooked;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isBooked = false;
    }

    public boolean bookRoom() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Room " + roomNumber + " booked.");
            return true;
        }
        System.out.println("Room " + roomNumber + " is already booked.");
        return false;
    }

    public void cancelBooking() {
        isBooked = false;
        System.out.println("Booking for room " + roomNumber + " cancelled.");
    }

    public boolean isAvailable() {
        return !isBooked;
    }
}

