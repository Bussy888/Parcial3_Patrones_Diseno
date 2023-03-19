package Ejercicio4Proxy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args){
        User u1 = new User("Henderson", "1234pws");
        User u2 = new User("Gloria", "hello3456");
        User u3 = new User("Lola", "password");
        User u4 = new User("Robert", "qwerrty12");

        List<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);

        WebApp w1 = new WebApp("Little Daisy");
        Proxy proxy = new Proxy(users, w1);

        List<User> requests = new ArrayList<>();
        requests.add(new User("Gloria", "hello3456"));
        requests.add(new User("Lola", "password"));
        requests.add(new User("Robert", "qwerty12"));
        requests.add(new User("Robert", "qwerrty12"));
        requests.add(new User("Henderson", "1234pws"));

        proxy.letUsersThrough(requests);
    }
}
