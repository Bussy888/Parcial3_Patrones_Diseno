package Ejercicio5Adapter;

public class Client {
    public static void main(String[] args){
        VersionTransformador webApp = new VersionTransformador(new VersionWeb("1.1.2"));
        VersionTransformador escritorioApp = new VersionTransformador(new VersionEscritorio("1.0.0"));
        VersionAndroid androidApp = new VersionAndroid("2.3.2");
        VersionIOS iosApp = new VersionIOS("2.3.0");
        VersionWindowsPhone windowsApp = new VersionWindowsPhone("2.0.0");

        iosApp.reportes();

        System.out.println();

        escritorioApp.reportes();
    }
}
