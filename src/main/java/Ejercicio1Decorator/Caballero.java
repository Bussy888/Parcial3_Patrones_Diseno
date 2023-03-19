package Ejercicio1Decorator;

import java.util.ArrayList;
import java.util.List;

public class Caballero  implements Personaje{

    private String name;
    private double level;
    private List<String> weapons = new ArrayList<>();
    private double armorPct;
    private double attackPoints;
    private double defencePoints;
    private double regPoints;

    public Caballero(String name, String weapons) {
        this.name = name;
        this.level = 1;
        this.weapons.add(weapons);
        this.armorPct = 1;
        this.attackPoints = 1;
        this.defencePoints = 1;
        this.regPoints = 1;
    }

    @Override
    public void applyModifier() {
        showPersonaje();
    }

    @Override
    public void showPersonaje() {
        System.out.println("Introducing: "+name);
        System.out.println("Level: "+level);
        System.out.println("Weapons: ");
        for (String w : weapons){
            System.out.print(w+", ");
        }
        System.out.println();
        System.out.println("Armor percentage: "+armorPct+"%");
        System.out.println("Attack points: "+attackPoints+"%");
        System.out.println("Defence points: "+defencePoints+"%");
        System.out.println("Regeneration points: "+regPoints+"%");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getLevel() {
        return level;
    }

    @Override
    public void setLevel(double level) {
        this.level = level;
    }

    @Override
    public List<String> getWeapons() {
        return weapons;
    }

    @Override
    public void setWeapons(String weapons) {
        this.weapons.add(weapons);
    }

    @Override
    public double getArmorPct() {
        return armorPct;
    }

    @Override
    public void setArmorPct(double armorPct) {
        this.armorPct = armorPct;
    }

    @Override
    public double getAttackPoints() {
        return attackPoints;
    }

    @Override
    public void setAttackPoints(double attackPoints) {
        this.attackPoints = attackPoints;
    }

    @Override
    public double getDefencePoints() {
        return defencePoints;
    }

    @Override
    public void setDefencePoints(double defencePoints) {
        this.defencePoints = defencePoints;
    }

    @Override
    public double getRegPoints() {
        return regPoints;
    }

    @Override
    public void setRegPoints(double regPoints) {
        this.regPoints = regPoints;
    }
}
