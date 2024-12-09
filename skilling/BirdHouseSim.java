
import java.util.Random;
import java.util.Scanner;

public class BirdHouseSim {

    protected int hunterlvl;
    //boolean rabbitsfoot = false;  add later.
    protected Random random = new Random(System.currentTimeMillis());
    protected int godnests = 0;
    protected int seednests = 0;
    protected int ringnests = 0;
    protected int nests = 0;
    protected double tierval;
    Scanner input = new Scanner(System.in);
    protected int beginner, easy, medium, hard, elite;

    public void simulateroll()
    {
        //roll the seed nest
        hunterlvl = 99;
        /*
        *   TODO: change method to allow custom tierval for tiers of birdhouse and hunter level.
        */
       
        double seednestodds = 0.785*(hunterlvl); //this can roll once, as a pre-roll. tier of birdhouse doesnt matter


        double nestodds = tierval*hunterlvl / 100; //odds for standard nest roll, this rolls 10x.

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
                 * TODO: add CA modifier (Low prio)
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
                    if(roll <= 0.03)// roll god egg nest TODO: add rabbit's foot modifier
                        godnests++;
                    else if(roll <=0.68021)
                        ringnests++;
                    nests++;
                }

            }
        }

    }


    public void printout()
    {
        System.out.println("Ring Nests: "+ringnests+"\tSeed Nests: "+seednests+"\tTotal Nests: "+nests);
        System.out.println(godnests+" of the nests had god eggs in them.");
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

    protected void setLevel()
    {
        int value;
        do{

        System.out.println("Enter Hunter Level.");
        value = input.nextInt();

        }while(value<0 || value > 99);
        
        value = value == 99 ? 100 : value; // if the value is 99, set it to 100 for calculations

        hunterlvl = value > 50 ? value : 50; //sets hunterlevel for calculation to be a minimum of 50
        
    }

    protected void setHouseTier()
    {
        int choice;
        do{

            System.out.println("What tier of Birdhouse? \nRegular: 0\tOak: 1\tWillow: 2\nTeak: 3\tMaple: 4\tMahogany: 5\n\tYew: 6\tMagic: 7\tRedwood: 8");
            choice = input.nextInt();

        } while(choice<0 || choice >8);
        
        switch (choice)
        {
            case 0:
                tierval = 0.10;
                break;
            case 1:
                tierval = 0.125;
                break;
            case 2:
                tierval = 0.128;
                break;
            case 3:
                tierval = 0.13;
                break;
            case 4:
                tierval = 0.14;
                break;
            case 5:
                tierval = 0.15;
                break;
            case 6:
                tierval = 0.16;
                break;
            case 7:
                tierval = 0.17;
                break;
            case 8:
                tierval = 0.175;
                break;
        }
    }
}
