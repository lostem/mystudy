package star;

public class Zealot {

    private int end;

    public Zealot(String azuk, String warrior) {

    }

    public Zealot() {

    }

    Marine marine = new Marine();

    public int setAttack;

    int hp = 100;
    int damage = 16;
    int armor = 3;
    String sound = "이싸쑤 ~~~";
    String sound2 = "내 생명을 아이어에 ~";
    boolean balUpUse;



     void battle() {
        int damageAfter = damage - marine.armor;
        int hp = marine.hp;
        int totalHp = hp - damageAfter;

        if(totalHp > 0) {
            System.out.println("LiveHp : " + totalHp );
        }
        else if(totalHp == 0) {
            System.out.println("death : " + totalHp);
        }
        else if(totalHp < 0) {
            System.out.println("death(damageOver) : " + totalHp);
        }
    }

}
