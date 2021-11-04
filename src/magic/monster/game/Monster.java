package magic.monster.game;

public abstract class Monster {
    private int hitPoints;
    private int maxHP;

    public Monster(int maxHP) {

    }

    public void setMaxHP(int maxHP) {
        setMaxHP(maxHP);
    }

    public int getMaxHP() {
      this.maxHP = getMaxHP();
      return getMaxHP();
    }

    public int getHitPoints() {
        this.hitPoints = getHitPoints();
        return getHitPoints();

    }

    public void setHitPoints(int h) {
        setHitPoints(h);
    }

    public void heal(int h) {
        heal(h);
    }

    public boolean takeDamage(int d) {
        return true;
    }

}

