package Ejercicio2Bridge;

public class InstalElectrica implements IInstalacion{

    private double price = 59;
    private IPago metodoPago;

    public InstalElectrica(IPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    private void work() {
        System.out.println("Realizando instalacion electrica");
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void receivePayment() {
        work();
        metodoPago.receivePayment(price);
    }
}
