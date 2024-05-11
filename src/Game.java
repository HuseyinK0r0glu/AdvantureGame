import java.util.*;
public class Game{
    Player player;
    Location location;
    Scanner scan = new Scanner(System.in);

    public void login(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Macera Oyununa Hoşgeldiniz");
        System.out.print("Adınızı Giriniz : ");
        String playerName = scan.nextLine();
        player = new Player(playerName);
        player.selectCha();
        start();

    }

    public void start() {
        while (true) {
            System.out.println();
            System.out.println("======================");
            System.out.println();
            System.out.println("Eylem Gerçekleştirmek İçin Bİr Yer Seçiniz:");
            System.out.println("1.Güvenli Ev --> Size Ait Güvenli Bir Mekan Tehlike Yok ");
            System.out.println("2.Mağara --> Karşınıza Zombi Çıkabilir");
            System.out.println("3.Orman --> Karşınıza Vampir Çıkabilir");
            System.out.println("4.Nehir --> Karşınıza Ayı Çıkabilir");
            System.out.println("5.Mağaza --> Silah Ve Zırh Alabilirsiniz ");
            System.out.print("Gitmek İstediğiniz Yer: ");
            int selLoc = scan.nextInt();
            while (selLoc < 1 || selLoc > 5) {
                System.out.print("Lütfen Geçerli Bir Yer Seçiniz : ");
                selLoc = scan.nextInt();
            }
            switch (selLoc) {
                case 1:
                    location = new SafeHouse(player);
                    location.getLocation();
                    break;
                case 5:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
                    break;
            }
            if(!location.getLocation()){
                System.out.println("Oyun Bitti");
                break;
            }


        }
    }



}
