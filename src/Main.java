//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hero[] hero = {new Magic(), new Medic(), new Warrior()};
        for (Hero hero1 : hero){
            hero1.applySuperAbility();
            if (hero1 instanceof Medic) {
                ((Medic)hero1).increaseExperience();
                System.out.println("Опыт лечения медик:" + ((Medic)hero1).getHealPoint());
            }
        }
    }

}