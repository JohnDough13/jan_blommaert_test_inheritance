package magic.monster.game;

public abstract class MightMonster extends Monster {
    private int ragePoints;
    private int maxRP;

    public MightMonster (int maxRP, int maxHP){
        super(maxHP);
        this.maxRP=maxRP;
       }

    public int getRagePoints() {
        return ragePoints;
    }

    public void setRagePoints(int h){
      this.ragePoints = h;
    }

    public void restoreRp (int h){
        this.ragePoints = ragePoints + h;
    }
    public boolean useRp (int d){
        return true;
    }
}
