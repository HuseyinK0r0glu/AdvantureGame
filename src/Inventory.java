import java.util.*;
public class Inventory {
    private boolean water,food,firewood;
    private String wName,aName;
    private int damage,armor;

    Inventory(){
        this.water=false;
        this.food=false;
        this.firewood=false;
        this.damage=0;
        this.armor=0;
        this.wName=null;
        this.aName=null;
    }

    public boolean isWater() {
        return water;
    }

    public boolean isFood() {
        return food;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }

    public void setwName(String wName) {
        this.wName = wName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getwName() {
        return wName;
    }

    public String getaName() {
        return aName;
    }

    public int getDamage() {
        return damage;
    }

    public int getArmor() {
        return armor;
    }
}
