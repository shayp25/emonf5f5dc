import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;

/**
 * Created by taylor hudson on 1/13/2017.
 */
public class Pokemon {
    private String id;
    private String Poke;
    private String NickName;
    private long maxHealth;
    private long currentHealth;
    private int BIN1, BIN2;
    // private BufferedImage img;
    private Integer level;
    private Long XP;
    private Long TNLxp;
    private Long EvolveLevel;
    private ArrayList<Move> KNOWNMOVES;
    private HashMap<Integer, Move> LEARNED;
    private HashMap<Utility.STATS, Base> pokeSTAT;
    private Utility.ExperienceGroup XPMODE;
    private Utility.TYPE MAIN;
    private Utility.TYPE SUB;

    public Pokemon(String ID){
        id = ID;
    }


    public int randomdistrubte(int x, int y, int r){
        int ranRange = 0;

        return ranRange;
    }
    public void gainXP(long xp){
        XP += xp;
        if(level != 100){
            if(XP.compareTo(TNLxp) >= 0){
                LevelUp();
            }
        }
    }
    private void LevelUp(){
        level = level + 1;
        TNLxp = Utility.TNL(level, XPMODE);
        AbilityMod();
        // increase all elements of pokeSTAT with *.setLVL(level)
        if(level == 100){
            TNLxp = Long.MAX_VALUE;
            return;
        }
        if(XP.compareTo(TNLxp) >= 0){
            gainXP(0);
        }
    }
    private void AbilityMod(){

    }
    public String displayXPNEED(){
        if(level == 100){
            return "UNKNOWN";
        }
        else{
            return String.valueOf(TNLxp);
        }
    }

    private void splitUP(){
        String binary = "";
        binary = Integer.toBinaryString(BIN1);


        binary = Integer.toBinaryString(BIN2);

    }

}
