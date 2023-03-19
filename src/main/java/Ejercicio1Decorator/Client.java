package Ejercicio1Decorator;

public class Client {
    public static void main(String[] args){
        Personaje p1 = new Caballero("Emeritus4", "Hacha");
        p1 = new AddWeapon(p1, "Escopeta");
        p1 = new AddShield(p1);
        p1 = new AddResistance(p1);

        p1.applyModifier();
    }
}
