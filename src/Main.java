import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();
        Hero[] heroes = {magic, warrior, medic};
        for (int i = 0; i < heroes.length; i++) {
            Medic.increaseExperience();
            System.out.println(heroes[i].applySuperAbility());
        }
    }
}