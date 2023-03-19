package Ejercicio4Proxy;

import java.util.List;

public class SuperList {
    List<User> list;

    public SuperList(List<User> list) {
        this.list = list;
    }

    private String obtainFirst(User user){
        return user.getName();
    }

    private boolean checkValidation(String a, String b, String c,String d){
        return a.equals(b) && c.equals(d);
    }

    public boolean includes(User user){
        for (User u: list){
            if (checkValidation(u.getName(), user.getName(), user.getPwd(), u.getPwd())){
                return true;
            }
        }
        return false;
    }
}
