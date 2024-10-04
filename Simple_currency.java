class CurrencyConverter {
    private static final double USD_TO_EUR = 0.85;
    private static final double USD_TO_INR = 74.5;

    public double convertUsdToEur(double amount) {
        return amount * USD_TO_EUR;
    }

    public double convertUsdToInr(double amount) {
        return amount * USD_TO_INR;
    }

    public void displayConversion(double amount, String currency) {
        switch (currency) {
            case "EUR":
                System.out.println("USD " + amount + " = EUR " + convertUsdToEur(amount));
                break;
            case "INR":
                System.out.println("USD " + amount + " = INR " + convertUsdToInr(amount));
                break;
            default:
                System.out.println("Unsupported currency.");
        }
    }
}

