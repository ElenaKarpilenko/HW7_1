abstract public class Hero  implements HavingSuperAbility{
    public int health;
    public int damage;
    String superPovWr;

    public Hero(int health, int damage, String superPovWr) {
        this.health = health;
        this.damage = damage;
        this.superPovWr = superPovWr;
    }
}
