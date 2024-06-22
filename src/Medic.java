public class Medic extends Hero {
    public int healPoint;

    public int getHealPoint() {
        return healPoint;
    }

    public void increaseExperience() {
        healPoint += (new) (healPoint * 0.1);
    }

    @Override
    public void applySuperAbility() {

    }

    public Medic() {
        super(100, 20, "Лечение");
        this.healPoint = 10;
        System.out.println("Медик применил суперспособность лечить");
    }
}


