import java.util.*;
public abstract class BattleLoc extends Location {
    Obstacle obstacle;
    public BattleLoc(Player player,String name,Obstacle obstacle) {
        super(player);
        this.name = name;
        this.obstacle = obstacle;
    }

    public boolean getLocation(){
        return true;
    }
}
