/**
 * Created by Taylor on 1/15/2017.
 */
public class Base {
    private Utility.STATS Gen;
    private Utility.NATURE Nature;
    private int Base_Stat;
    private int IV;
    private int EV;
    private int LVL;
    public Base TOTAL;

    public Base(){
        Gen = Utility.STATS.TOTAL;
        Base_Stat = 0;
        IV = 0;
        EV = 0;
    }
    public Base(Utility.STATS type, int Base, Base total){
        TOTAL = total;
        Base_Stat = Base;
        Gen = type;
        EV = 0;
        IV = (int)Math.random()*32;
    }


    public int getBase_Stat() {
        return Base_Stat;
    }

    public void increaseBase_Stat(int increase){
        Base_Stat += increase;
        if(Gen != Utility.STATS.TOTAL)
        TOTAL.increaseBase_Stat(increase);
    }
    public int getIV() {
        return IV;
    }

    public void increaseIV(int increase){
        IV += increase;
        if(Gen != Utility.STATS.TOTAL)
        TOTAL.increaseIV(increase);
    }
    public int getEV() {
        return EV;
    }

    public void increaseEV(int increase) {
        if((EV + increase) > 252){
         increase = 252 - EV;   
        }
        if((TOTAL.getEV() + increase) > 510){
            increase = 510 - TOTAL.getEV();            
        }
        EV += increase;
        if(Gen != Utility.STATS.TOTAL){
            TOTAL.increaseEV(increase);
        }
    }
    public void setLVL(int lvl){
        LVL = lvl;
    }

    public int StatMechanics() {
        int B = Base_Stat;
        int I = IV;
        int E = EV;
        int L = LVL; // ADD TO BASE
        float N = Utility.nature(Gen, Nature);//Nature; // ADD TO BASE At the moment
        /*
        
        N (Nature)
https://www.dragonflycave.com/stats.aspx
https://webcache.googleusercontent.com/search?q=cache:yH9JF3tPKWoJ:https://www.dragonflycave.com/stats.aspx+&cd=10&hl=en&ct=clnk&gl=us
A Pokémon's nature describes its personality and is displayed on every Pokémon's summary screen in the Advance games onwards.
Natures didn't exist in the pre-Advance games, so for the purposes of R/B/Y/G/S/C, always regard N as being 1.

Some natures are neutral and have no effect on your Pokémon's stats, while others increase one stat by 10% at the cost of decreasing another by 10%.
Hit Points are never affected by natures, but there is a nature corresponding to every possible pair of the other five stats to raise/lower,
in addition to five neutral ones. Since HeartGold and SoulSilver, your Pokémon's nature's effect on its stats has been indicated on the stat screen
by coloring the name of the boosted stat red and the name of the reduced stat blue, but for reference, here's a table of all the natures:

Nature	Increases	Decreases
Hardy	None	None
Lonely	Attack	Defense
Brave	Attack	Speed
Adamant	Attack	Special Attack
Naughty	Attack	Special Defense
Docile	None	None
Bold	Defense	Attack
Relaxed	Defense	Speed
Impish	Defense	Special Attack
Lax	Defense	Special Defense
Serious	None	None
Timid	Speed	Attack
Hasty	Speed	Defense
Jolly	Speed	Special Attack
Naive	Speed	Special Defense
Bashful	None	None
Modest	Special Attack	Attack
Mild	Special Attack	Defense
Quiet	Special Attack	Speed
Rash	Special Attack	Special Defense
Quirky	None	None
Calm	Special Defense	Attack
Gentle	Special Defense	Defense
Sassy	Special Defense	Speed
Careful	Special Defense	Special Attack
Incidentally, Pokémon also have different PokéBlock/Poffin flavor preferences depending on their nature. Each flavor corresponds to one stat
(Spicy for Attack, Sour for Defense, Sweet for Speed, Dry for Special Attack and Bitter for Special Defense),
and the Pokémon will like the flavor associated with the stat their nature raises but dislike the one associated with the stat it lowers.

The N value in the formula itself will take on one of three values:

1.1 if the Pokémon's nature raises the stat in question;
1 if the Pokémon's nature does not affect the stat in question;
0.9 if the Pokémon's nature lowers the stat in question.
        */

        if (Gen != Utility.STATS.HP || Gen != Utility.STATS.TOTAL || Gen != Utility.STATS.AVG)
            return (int)Math.floor(Math.floor((2 * B + I + E) * L / 100 + 5) * N); // Not for Health
        if (Gen == Utility.STATS.HP)
            return (int)Math.floor((2 * B + I + E) * L / 100 + L + 10);
        return 0;
    }
}
