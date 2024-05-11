import java.util.*;
public class SafeHouse extends NormalLoc{
    public SafeHouse(Player player) {
        super(player,"Güvenli Ev");
    }

    public boolean getLocation(){
        player.setHealth(player.getrHealth());
        System.out.println("İyileştiniz");
        System.out.println("Şuan Güvenli Evdesiniz");
        return true;

    }
}
