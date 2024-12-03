
import java.util.Random;

public class BirdHouseSim {

    protected int hunterlvl;
    //boolean rabbitsfoot = false;  add later.
    protected Random random = new Random(System.currentTimeMillis());

    protected int godnests = 0;
    protected int seednests = 0;
    protected int ringnests = 0;
    protected int nests = 0;

    protected int beginner, easy, medium, hard, elite;

    public void simulateroll()
    {
        double tierval = 0.175; //assume redwood for now.
        //roll the seed nest
        hunterlvl = 99;
        if(hunterlvl == 99)
        {
            hunterlvl++;
        }
        double seednestodds = 0.785*(hunterlvl); //this can roll once, as a pre-roll. tier of birdhouse doesnt matter

        int modifiedhunterlvl = hunterlvl < 50 ? 50 : hunterlvl;

        double nestodds = tierval*modifiedhunterlvl; //odds for standard nest roll, this rolls 10x.

        boolean clue = false;

        if(random.nextDouble() <= seednestodds)
        {
            seednests++;
            nests++;
        }
        for(int i = 0; i < 10; i++)
        {
            if(random.nextDouble() <= nestodds) //roll successful
            {
            //pre-roll clue drop
                if(!clue)
                {
                /*
                 * beginner = 1/50 (these do not count as a nest)
                 * easy = 1/375 (no CA)
                 * med = 1/500 (no CA)
                 * hard = 1/750 (no CA)
                 * elite = 1/1500 (no CA)
                 */
                if(random.nextDouble()<= (0.02))
                    beginner++;
                if(random.nextDouble() <= (1.0/375.0))
                {
                    easy++;
                    nests++;
                }
                if(random.nextDouble() <= 0.002)
                {
                    medium++;
                    nests++;
                }
                if(random.nextDouble() <= (1.0/750.0))
                {
                    hard++;
                    nests++;
                }
                if(random.nextDouble() <= (1.0/1500.0))
                {
                    elite++;
                    nests++;
                }
                    clue = true;


                } else //roll standard nest
                {
                    double roll = random.nextDouble();
                    if(roll <= 0.03)// roll god egg nest
                        godnests++;
                    else if(roll <=0.68021)
                        ringnests++;

                }

            }
        }

    }


    public void printout()
    {
        System.out.println("You recieved a total of "+nests+" nests from that birdhouse. "+ringnests+ " had rings in them. "+seednests+ " had seeds in them.");
        System.out.println(godnests+" of the nests had god eggs in them.");
        System.out.println("Clues recieved: "+beginner+" beginners, "+easy+" easies, "+medium+" mediums, "+hard+" hards, and "+elite+" elites");
    }

    public void clear()
    {
        nests=0;
        beginner = 0;
        easy = 0;
        medium = 0;
        hard = 0;
        elite = 0;
        seednests = 0;
        godnests = 0;
        ringnests=0;
        System.out.println("cleared results");
    }


}
