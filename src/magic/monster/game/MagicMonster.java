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
        magicPoints=setMP;

    }

    public void restoreMp(int restoreMP) {
        this.magicPoints = magicPoints+restoreMP;
    }

    public boolean useMp(int useMP) {
        return true;
    }
}
