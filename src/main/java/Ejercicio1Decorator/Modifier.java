package Ejercicio1Decorator;

import java.util.List;

public abstract class Modifier implements Personaje{

    Personaje personaje;

    public Modifier(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void applyModifier() {
        personaje.applyModifier();
    }

    @Override
    public void showPersonaje() {
        personaje.showPersonaje();
    }

    @Override
    public void setName(String name) {
        personaje.setName(name);
    }

    @Override
    public String getName() {
        return personaje.getName();
    }

    @Override
    public void setLevel(double n) {
        personaje.setLevel(n);
    }

    @Override
    public double getLevel() {
        return personaje.getLevel();
    }

    @Override
    public void setWeapons(String weapons) {
        personaje.setWeapons(weapons);
    }

    @Override
    public List<String> getWeapons() {
        return personaje.getWeapons();
    }

    @Override
    public void setArmorPct(double armorPct) {
        personaje.setArmorPct(armorPct);
    }

    @Override
    public double getArmorPct() {
        return personaje.getArmorPct();
    }

    @Override
    public void setAttackPoints(double attackPoints) {
        personaje.setAttackPoints(attackPoints);
    }

    @Override
    public double getAttackPoints() {
        return personaje.getAttackPoints();
    }

    @Override
    public void setDefencePoints(double defencePoints) {
        personaje.setDefencePoints(defencePoints);
    }

    @Override
    public double getDefencePoints() {
        return personaje.getDefencePoints();
    }

    @Override
    public void setRegPoints(double regPoints) {
        personaje.setRegPoints(regPoints);
    }

    @Override
    public double getRegPoints() {
        return personaje.getRegPoints();
    }
}
