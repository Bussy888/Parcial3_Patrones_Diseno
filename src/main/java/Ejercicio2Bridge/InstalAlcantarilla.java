package Ejercicio2Bridge;

public class InstalAlcantarilla  implements IInstalacion{

    private double price = 159;
    private IPago metodoPago;

    public InstalAlcantarilla(IPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    private void work() {
        System.out.println("Realizando instalacion de alcantarillas");
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
