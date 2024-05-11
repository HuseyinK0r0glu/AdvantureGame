import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.*;
public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player,"Mağaza");
    }

    public boolean getLocation(){
        System.out.println("para:"+getPlayer().getMoney());
        System.out.println("1.Silahlar");
        System.out.println("2.Zırhlar");
        System.out.println("3.Çıkış");
        System.out.print("Yapmak İstediğiniz İşlemi Seçiniz :");
        int selTool = scan.nextInt();
        int selItemID;
        switch (selTool){
            case 1:
                selItemID = weaponMenu();
                buyWeapon(selItemID);
                break;
            case 2:
                selItemID = armorMenu();
                buyArmor(selItemID);
                break;
            default:
                break;
        }


        return true;

    }

    public int weaponMenu() {
        System.out.println("1.Tabanca  \t <Para:25  Hasar:2>");
        System.out.println("2.Kılıç  \t <Para:35 Hasar:3>");
        System.out.println("3.Tüfek  \t <Para:45  Hasar:7>");
        System.out.println("4.Çıkış");
        System.out.print("Seçiminiz : ");
        int selWeaponID = scan.nextInt();
        return selWeaponID;
    }

    public void buyWeapon(int itemID){
        int damage = 0,price = 0;
        String wName = null;
        switch (itemID){
            case 1:
                damage = 2;
                wName = "Tabanca";
                price = 25;
                break;
            case 2:
                damage = 3;
                wName = "Kılıç";
                price = 35;
                break;
            case 3:
                damage = 7;
                wName = "Tüfek";
                price = 45;
                break;
            case 4:
                System.out.println("Çıkış Yaplıyor");
                break;
            default:
                System.out.println("Geçersiz İşlem!");
                break;
        }
        if(price>0) {
            if (player.getMoney() >= price) {
                player.getInv().setDamage(damage);
                player.getInv().setwName(wName);
                player.setMoney(player.getMoney() - price);
                System.out.println("Silah Satın Aldınız ");
                System.out.println("Önceki Hasarınız :" + player.getInv().getDamage());
                System.out.println("Şimdiki Hasarınız :" + (player.getInv().getDamage() + player.getDamage()));
                System.out.println("Kalan Para :" + (player.getMoney() - price));
            } else {
                System.out.println("Bakiye Yetersiz");
            }
        }

    }

    public int armorMenu(){
        System.out.println("1.Hafif Zırh  \t < Para:15 Engelleme:1>");
        System.out.println("2.Orta Zırh  \t < Para:25 Engelleme:3>");
        System.out.println("3.Ağır Zırh  \t < Para:40 Engelleme:5>");
        System.out.println("4.Çıkış");
        System.out.println("Seçiminiz");
        int selArmorID = scan.nextInt();
        return selArmorID;
    }
    public void buyArmor(int itemID){
        int armor = 0,price =0;
        String aName = null;
        switch(itemID){
            case 1 :
                armor = 1;
                aName = "Hafif zırh";
                price = 15;
                break;
            case 2 :
                armor = 3;
                aName = "Orta Zırh";
                price = 25;
                break;

            case 3:
                armor = 5;
                aName = "Ağır Zırh";
                price = 40;
                break;

            default:
                System.out.println("Geçersiz İşlem");
                break;
        }
        if(price>0) {
            if (player.getMoney() >= price) {
                player.getInv().setArmor(armor);
                player.getInv().setaName(aName);
                player.setMoney(player.getMoney() - price);
                System.out.println("Zırh Satın Aldınız ");
                System.out.println("Yeni Zırhınız :" + player.getInv().getArmor());


            } else {
                System.out.println("Bakiye Yetersiz");
            }
        }
    }
}
