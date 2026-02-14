package com.example.polymorphismtasks;

class Payment {
    Double amount;
    Integer transactionLimit;

    public Payment(Double amount, Integer transactionLimit) {
        this.amount = amount;
        this.transactionLimit = transactionLimit;
    }

    public void processPayment(Double paymentAmount) {
        System.out.println("Processing payment...");
    }
}
class CreditCardPayment extends Payment {

    public CreditCardPayment(Double amount, Integer transactionLimit) {
        super(amount, transactionLimit);
    }

    @Override
    public void processPayment(Double paymentAmount) {
        if (paymentAmount <= transactionLimit) {
            System.out.println("Credit Card payment successful");
        } else {
            System.out.println("Credit Card limit exceeded");
        }
    }
}
class UPIPayment extends Payment {

    public UPIPayment(Double amount, Integer transactionLimit) {
        super(amount, transactionLimit);
    }

    @Override
    public void processPayment(Double paymentAmount) {
        if (paymentAmount <= transactionLimit) {
            System.out.println("UPI payment successful");
        } else {
            System.out.println("UPI daily limit exceeded");
        }
    }
}
public class PaymentManagement {
    public static void main(String[] args) {

        Payment payment;

        payment = new CreditCardPayment(50000.0, 30000);
        payment.processPayment(20000.0);

        payment = new UPIPayment(10000.0, 5000);
        payment.processPayment(7000.0);
    }
}

