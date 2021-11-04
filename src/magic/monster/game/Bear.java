package magic.monster.game;

public class Bear extends MightMonster {
    private int holeNr;

    public Bear() {
        super(5, 50);
    }

    public Bear(int hitpoints) {
        super(5, hitpoints);
    }

    public Bear(int hitpoints, int ragePoints) {
        super(hitpoints, ragePoints);
    }

    public Bear(int holeNr, int hitpoints, int ragePoints) {
        super(hitpoints, ragePoints);
        this.holeNr = holeNr;

    }

    public int bearClawAttack() {
        if (super.useRp(8)) {
            super.setRagePoints(super.getRagePoints() - 8);
            System.out.println("Bear attacks! roar!!");
            return 10;
        } else {
            System.out.println("Bear attacks! out of Rage points");
            return 0;
        }
    }
}
