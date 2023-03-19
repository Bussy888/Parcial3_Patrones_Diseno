package Ejercicio5Adapter;

public class VersionWindowsPhone implements IAplicacion{

    private String build;

    public VersionWindowsPhone(String build) {
        this.build = build;
    }

    @Override
    public void login() {
        System.out.println("Haciendo login en Windows Phone");
    }

    @Override
    public void logout() {
        System.out.println("Haciendo logout en Windows Phone");
    }

    @Override
    public void reportes() {
        System.out.println("Sacando reporte en Windows Phone");
        System.out.println("Version del build: "+build);
    }
}
