package Ejercicio2Bridge;

public class TigoMoney implements IPago{

    @Override
    public void receivePayment(double payment) {
        System.out.println("Se hizo un descuento de 2% por pagar con Tigo Money");
        System.out.println("Precio original: "+payment);
        System.out.println("Se cobro el monto de "+(payment - payment * 0.02)+" bolivianos");
    }
}
