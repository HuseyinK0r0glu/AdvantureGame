import java.util.*;
public class Player{
    private int damage,health,money,rHealth;
    private String name,cName;
    private Inventory inv;
    Scanner scan = new Scanner(System.in);
    public Player(String name) {
        this.name = name;
        this.inv = new Inventory();
    }
    public void selectCha(){
        switch (menuCha()){
            case 1:
                setcName("Samuray");
                setDamage(5);
                setHealth(21);
                setMoney(15);
                break;
            case 2:
                setcName("Okçu");
                setDamage(7);
                setHealth(18);
                setMoney(20);
                setrHealth(health);
                break;
            case 3:
                setcName("Şövalye");
                setDamage(8);
                setHealth(24);
                setMoney(5);
                setrHealth(health);
                break;
            default:
                setcName("Samuray");
                setDamage(5);
                setHealth(21);
                setMoney(15);
                setrHealth(health);
                break;
        }
        System.out.println("Krakteriniz:"+getcName()+"\t Hasar:"+getDamage()+"\t Sağlık:"+getHealth()+"\t Para:"+getMoney());
    }

    public int menuCha(){
        System.out.println("Lütfen bir karakter seçiniz");
        System.out.println("1-Samuray \t Hasar:5 \t Sağlık:21 \t Para:15");
        System.out.println("2-Okçu \t Hasar:7 \t Sağlık:18 \t Para:20");
        System.out.println("3-Şövalye \t Hasar:8 \t Sağlık:24 \tPara:5");
        System.out.println("Karakter Seçiminiz: ");
        int chaID = scan.nextInt();

        while(chaID < 1 || chaID > 3){
            System.out.println("Lütfen Geçerli Bir Karakter Giriniz");
            chaID = scan.nextInt();
        }

        return chaID;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public String getcName() {
        return cName;
    }

    public Inventory getInv() {
        return inv;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }

    public int getrHealth() {
        return rHealth;
    }

    public void setrHealth(int rHealth) {
        this.rHealth = rHealth;
    }
}
