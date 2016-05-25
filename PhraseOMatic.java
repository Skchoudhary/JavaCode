public class PhraseOMatic
{
    public static void main(String [] agrs)
    {

        String [] oneWordList={"24/7","multi-Tier","30,000","B-to-B","win-win","front-end","web-based","pervasive","smart","six-sigma","critical-path","dynamic"};
        String [] twoWordList={"empowered","sticky","value-added","oriented","centric","distributed","clustered","branded","outside-the-box","networked","focused","leverged","shared","cooperative","accelerated","targeted","aligned"};
        String [] threeWordList={"process","tipping","architecture","mindshare","portal","space","vision","solution","core compentency","strategy","paradigm","tripping-point"};

        int oneLength=oneWordList.length;
        int twoLength=twoWordList.length;
        int threeLength=threeWordList.length;

        int rand1=(int) (Math.random()* oneLength);
        int rand2=(int) (Math.random()* twoLength);
        int rand3=(int) (Math.random()* threeLength);

        String phrase=oneWordList[rand1]+" "+twoWordList[rand2]+" "+threeWordList[rand3];

        System.out.println("What we need is a "+phrase);
    }
}
