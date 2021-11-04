package magic.monster.game;

import java.util.Random;

public class Witch extends MagicMonster {
    private String name;

    public Witch() {
        super(100, 30);
    }

    public Witch(int hitpoints) {
        super(100, hitpoints);
    }

    public Witch(int hitpoints, int magicPoints) {
        super(hitpoints, magicPoints);

    }

    public Witch(String name, int hitpoints, int magicPoints) {
        super(hitpoints, magicPoints);
        this.name = name;

    }
    public int fireballAttack(){
        if (super.useMp(5)){
            super.setMagicPoints(super.getMagicPoints() - 5);
            System.out.println("fwooosh!!");
            return 8;
        } else {
            System.out.println("Out of magic points");
            return 0;
        }
    }
}


