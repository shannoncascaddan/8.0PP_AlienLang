import java.util.Random;

public class AlienLang
{
    public static void main(String [] args)
    {
        blurb();
    }//end main method

    public static String whoozit()
    {
        Random rand = new Random();
        int temp = rand.nextInt(10);
        String whoozit = "x";
        for(int i =0; i<temp;i++)
        {
            whoozit += "y";
        }//end for to add rand num y
        return whoozit;
    }//end whoozit (xy...)
    public static String whatzit()
    {
        Random rand = new Random();
        int temp = rand.nextInt(2);
        String whatzit = "q";
        if(temp == 0)
            whatzit += "z";
        else
            whatzit += "d";
        whatzit +=whoozit();
        return whatzit;
    }//end whatzit (qzd + whatzit)
    public static void blurb()
    {
        Random rand = new Random();
        int temp = rand.nextInt(10)+1;
        String blurb = whoozit();
        for(int i =0; i<temp;i++)
        {
            blurb += whatzit();
        }//end for to produce rand whatzits
        System.out.println(blurb);
    }//end string method to generate blurbs
}//end AlienLag Class
