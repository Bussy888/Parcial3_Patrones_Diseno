package Ejercicio2Bridge;

public class Transferencia implements IPago{

    @Override
    public void receivePayment(double payment) {
        System.out.println("Se hizo un descuento de 5% por hacer transferencia bancaria");
        System.out.println("Precio original: "+payment);
        System.out.println("Se cobro el monto de "+(payment - payment * 0.05)+" bolivianos a traves de transferencia bancaria");
    }
}
