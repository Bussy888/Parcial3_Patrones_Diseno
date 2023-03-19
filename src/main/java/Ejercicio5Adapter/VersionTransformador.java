package Ejercicio5Adapter;

public class VersionTransformador implements IAplicacion{

    IPCApp app;

    public VersionTransformador(IPCApp app) {
        this.app = app;
    }

    @Override
    public void login() {
        app.iniciarSesion();
    }

    @Override
    public void logout() {
        app.cerrarSesion();
    }

    @Override
    public void reportes() {
        app.generacionDeDatos();
    }
}
