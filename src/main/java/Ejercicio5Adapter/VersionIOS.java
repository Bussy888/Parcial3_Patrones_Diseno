package Ejercicio5Adapter;

public class VersionIOS implements IAplicacion{

    private String build;

    public VersionIOS(String build) {
        this.build = build;
    }

    @Override
    public void login() {
        System.out.println("Haciendo login en IOS");
    }

    @Override
    public void logout() {
        System.out.println("Haciendo logout en IOS");
    }

    @Override
    public void reportes() {
        System.out.println("Sacando reporte en IOS");
        System.out.println("Version del build: "+build);
    }
}
