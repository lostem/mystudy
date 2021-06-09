package star;

public class StarUse {
    private static String kio;
    private static String warrior;

    public static void main(String[] args) {

        //히드라 라는 클래스를 객체로 사용하기위해서 new 로 객체생성
        // new Hydar(); Hyder() --> 기본 생성자 이다
        // 모든 클래스에 생성자는 반드시 존재하며 하나이상 있을수 있다
        Hydra hydra = new Hydra();
        Marine marine = new Marine();
        Zealot zealot = new Zealot(kio, warrior);



        zealot.setAttack = 10;
        Marine.setAttack = 11;
        Hydra.setAttack = 9;

        zealot.battle();



    }
}
