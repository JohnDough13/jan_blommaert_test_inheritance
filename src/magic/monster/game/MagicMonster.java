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

    public void setMagicPoints(int setMP) {
        this.setMagicPoints(setMP);
    }

    public void restoreMp(int restoreMP) {
        this.restoreMp(restoreMP);
    }

    public boolean useMp(int useMP) {
        return true;
    }
}
