class ElectricityBill {
    private String customerId;
    private double unitsConsumed;
    private static final double RATE_PER_UNIT = 5.5;

    public ElectricityBill(String customerId, double unitsConsumed) {
        this.customerId = customerId;
        this.unitsConsumed = unitsConsumed;
    }

    public double calculateBill() {
        return unitsConsumed * RATE_PER_UNIT;
    }

    public void printBill() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Total Bill: $" + calculateBill());
    }
}

