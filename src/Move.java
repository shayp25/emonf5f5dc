/**
 * Created by taylor hudson on 1/13/2017.
 */
public class Move {
    private String Number;
    private String MoveName;
    private Utility.TYPE AbilityType;
    private Utility.CATEGORY MoveType;
    private Utility.CONTEST MoveRating;
    private int PP;
    private int Power;
    private float Accuracy;

    public Move(String [] set){
        Number = set[0];
        MoveName = set[1];
        AbilityType = typeSet(set[2]);
        MoveType = status(set[3]);
        MoveRating = contest(set[4]);
        PP = Integer.valueOf(set[5]);
        Power = Integer.valueOf(set[6]);
        Accuracy = (float)(Double.valueOf(set[7])/100.0);
    }
    public Utility.CONTEST contest(String in){
        if(in.equals("Beautiful"))
            return Utility.CONTEST.BEAUTIFUL;
        if(in.equals("Cool"))
            return Utility.CONTEST.COOL;
        if(in.equals("Clever"))
            return Utility.CONTEST.CLEVER;
        if(in.equals("Cute"))
            return Utility.CONTEST.CUTE;
        if(in.equals("Tough")){}
            return Utility.CONTEST.TOUGH;
    }
    public Utility.CATEGORY status(String in){
        if(in.equals("Physical"))
            return Utility.CATEGORY.PHYSICAL;
        if(in.equals("Special"))
            return Utility.CATEGORY.SPECIAL;
        if(in.equals("Status")){}
            return Utility.CATEGORY.STATUS;
    }
    public Utility.TYPE typeSet(String in){
        if(in.equals("Normal"))
            return Utility.TYPE.NORMAL;
        if(in.equals("Fighting"))
            return Utility.TYPE.FIGHTING;
        if(in.equals("Ice"))
            return Utility.TYPE.ICE;
        if(in.equals("Fire"))
            return Utility.TYPE.FIRE;
        if(in.equals("Hudson"))
            return Utility.TYPE.HUDSON;
        if(in.equals("Electric"))
            return Utility.TYPE.ELECTRIC;
        if(in.equals("Flying"))
            return Utility.TYPE.FLYING;
        if(in.equals("Grass"))
            return Utility.TYPE.GRASS;
        if(in.equals("Dark"))
            return Utility.TYPE.DARK;
        if(in.equals("Water"))
            return Utility.TYPE.WATER;
        if(in.equals("Psychic"))
            return Utility.TYPE.PSYCHIC;
        if(in.equals("Poison"))
            return Utility.TYPE.POISON;
        if(in.equals("Dragon"))
            return Utility.TYPE.DRAGON;
        if(in.equals("Ground"))
            return Utility.TYPE.GROUND;
        if(in.equals("???"))
            return Utility.TYPE.QMARK;
        if(in.equals("Shadow"))
            return Utility.TYPE.SHADOW;
        if(in.equals("Steel"))
            return Utility.TYPE.STEEL;
        if(in.equals("Rock"))
            return Utility.TYPE.ROCK;
        if(in.equals("Bug"))
            return Utility.TYPE.BUG;
        if(in.equals("Ghost"))
            return Utility.TYPE.GHOST;
        if(in.equals("Fairy"))
            return Utility.TYPE.FAIRY;
        if(in.equals("Glitch"))
            return Utility.TYPE.GLITCH;
        if(in.equals("None"))
            return Utility.TYPE.NONE;
        return Utility.TYPE.TYPELESS;
    }

}
