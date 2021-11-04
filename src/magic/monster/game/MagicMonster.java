package magic.monster.game;

public abstract class MagicMonster extends Monster {
    private int magicPoints;
    private int maxMP;


    public MagicMonster(int maxMP, int maxHP) {
        super(maxHP);
        this.maxMP = maxMP;
    }

    public int getMagicPoints() {
        return magicPoints;
    }

    public void setMagicPoints(int h) {
        this.setMagicPoints(h);
    }

    public void restoreMp(int h) {
        this.restoreMp(h);
    }

    public boolean useMp(int d) {
        return true;
    }
}
