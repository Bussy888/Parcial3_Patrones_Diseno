package Ejercicio1Decorator;

import java.util.List;

public interface Personaje {

    void applyModifier();
    void showPersonaje();

    void setName(String name);
    String getName();

    void setLevel(double n);
    double getLevel();

    void setWeapons(String weapons);
    List<String> getWeapons();

    void setArmorPct(double armorPct);
    double getArmorPct();

    void setAttackPoints(double attackPoints);
    double getAttackPoints();

    void setDefencePoints(double defencePoints);
    double getDefencePoints();

    void setRegPoints(double regPoints);
    double getRegPoints();

}
