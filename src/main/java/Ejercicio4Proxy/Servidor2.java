package Ejercicio4Proxy;

public class Servidor2 implements IServer{
    private static final Servidor2 s2 = new Servidor2();

    private Servidor2 (){

    }

    public static Servidor2 getServer(){
        return s2;
    }

    @Override
    public void processUser(User user, WebApp webApp) {
        System.out.println(user.getName()+" was let in "+webApp.getName()+" through Server 2");
    }
}
