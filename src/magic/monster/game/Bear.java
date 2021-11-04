package magic.monster.game;

public class Bear extends MightMonster {
    private int holeNr;

    public Bear (){
    }

    public Bear (int hitpoints){
        super(hitpoints);
        getHitPoints();
    }

    public Bear (int hitpoints, int ragePoints){
        super(hitpoints);
        super(ragePoints);
    }

    public Bear (int holeNr, int hitpoints, int ragePoints){
        super(hitpoints);
        super(ragePoints);
        this.holeNr=holeNr;

    }

    public int bearClawAttack (){
        return bearClawAttack();
    }
}
