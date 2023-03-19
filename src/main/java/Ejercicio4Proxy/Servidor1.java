package Ejercicio4Proxy;

public class Servidor1 implements IServer{
    private static final Servidor1 s1 = new Servidor1();

    private Servidor1 (){

    }

    public static Servidor1 getServer(){
        return s1;
    }

    @Override
    public void processUser(User user, WebApp webApp) {
        System.out.println(user.getName()+" was let in "+webApp.getName()+" through Server 1");
    }
}
