package star;

public class Marine {

    public static int setAttack;



    Zealot zealot = new Zealot();

    int hp = 40;
    int damage = 6;
    int armor = 1;
    boolean stimPackUse;
    String sound = "투투투투다다다";
    String sound2 = "스팀팩 ~~~";

    //생성자 오버로딩
    Marine() { }
    Marine(int damage, int armor){ }
    Marine(String name , String gender) { }



     void battle() {
        int damageAfter = damage - zealot.armor;
        int hp = zealot.hp;
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
