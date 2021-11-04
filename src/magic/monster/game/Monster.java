package magic.monster.game;

public abstract class Monster {
    private int hitPoints;
    private int maxHP;

    public Monster(int maxHP) {
        this.hitPoints = maxHP;
        setMaxHP(maxHP);
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getMaxHP() {
      return maxHP;
    }

    public int getHitPoints () {
         return hitPoints;
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

