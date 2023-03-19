package Ejercicio2Bridge;

public class Client {
    public static void main(String[] args){
        IPago banco = new Transferencia();
        IPago tigoMoney = new TigoMoney();
        IPago app = new AplicacionEmpresa();
        IInstalacion alcantarillado = new InstalAlcantarilla(banco);
        IInstalacion aguas = new InstalAgua(tigoMoney);
        IInstalacion electricidad = new InstalElectrica(app);

        alcantarillado.receivePayment();
        aguas.receivePayment();
        electricidad.receivePayment();
    }
}
