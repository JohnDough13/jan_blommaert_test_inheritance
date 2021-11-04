package magic.monster.game;

public class Witch extends MagicMonster {
    private String name;

    public Witch() {
    }

    public Witch(int hitpoints) {
        super(hitpoints);
    }

    public Witch(int hitpoints, int magicPoints) {
        return;
    }

    public Witch(String name, int hitpoints, int magicPoints) {
        this.name = name;
        super(hitpoints);
        super(magicPoints);
    }

    public int fireballAttack() {
        return fireballAttack();
    }

}
