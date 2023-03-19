package Ejercicio5Adapter;

public class VersionAndroid  implements IAplicacion{

    private String build;

    public VersionAndroid(String build) {
        this.build = build;
    }

    @Override
    public void login() {
        System.out.println("Haciendo login en Android");
    }

    @Override
    public void logout() {
        System.out.println("Haciendo logout en Android");
    }

    @Override
    public void reportes() {
        System.out.println("Sacando reporte en Android");
        System.out.println("Version del build: "+build);
    }

}
