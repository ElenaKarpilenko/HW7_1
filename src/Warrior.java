public class Warrior extends Hero {

    @Override
    public void applySuperAbility() {
    }

    public Warrior() {
        super(300, 25, "Critical damage");
        System.out.println("Воин применил суперспособность CRITICAL DAMAGE");
    }
}
