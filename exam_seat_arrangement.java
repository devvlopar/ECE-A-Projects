class ExamSeatArrangement {
    private String[] seats;
    private int totalSeats;

    public ExamSeatArrangement(int totalSeats) {
        this.totalSeats = totalSeats;
        seats = new String[totalSeats];
    }

    public void assignSeat(int seatNumber, String studentName) {
        if (seatNumber <= totalSeats && seats[seatNumber - 1] == null) {
            seats[seatNumber - 1] = studentName;
            System.out.println("Seat " + seatNumber + " assigned to " + studentName);
        } else {
            System.out.println("Seat already assigned or invalid seat number.");
        }
    }

    public void displayArrangement() {
        System.out.println("Exam Seat Arrangement:");
        for (int i = 0; i < totalSeats; i++) {
            System.out.println("Seat " + (i + 1) + ": " + (seats[i] == null ? "Vacant" : seats[i]));
        }
    }
}

