package Ejercicio2Bridge;

public class AplicacionEmpresa  implements IPago {

    @Override
    public void receivePayment(double payment) {
        System.out.println("Se hizo un descuento de 10% por hacer uso de la aplicacion de la empresa");
        System.out.println("Precio original: " + payment);
        System.out.println("Se cobro el monto de " + (payment - payment * 0.1) + " bolivianos");
    }
}
