class PayPalAdapter implements PaymentProcessor {
    private PayPal Paypal;

    PayPalAdapter(PayPal Paypal) {
        this.Paypal = Paypal;
    }

    public void processPayment() {
        Paypal.payNow();
    }
}