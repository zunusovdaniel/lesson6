public class Medic extends Hero {
    static double healPoints = 10;

    public static void increaseExperience() {
       healPoints += healPoints / 10;
        System.out.println("����������� ������� �� 10% : " + healPoints);
    }

    @Override
    public String applySuperAbility() {

        return "Medic �������� ���������������� super help";
    }
}
