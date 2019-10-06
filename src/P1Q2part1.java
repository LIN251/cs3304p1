
public class P1Q2part1 {

    public static void main(String[] args) {
        addRequest newRequest = new addRequest();
        int index = 0;

        // correct example with more spaces
        // more stacks
        String aString =
            "(  99800       GOOGL     shares        buy at max           5555,  "
                + "99800 GOOGL shares sell at min 10, "
                + "8888AAPLsharesbuy at max999  )    "
                + "for account                \"linzhang_zhouxiaolin112233\"";
        newRequest.checkpasher(aString, index);

        // correct example with one space
        String aString1 =
            "( 99800 GOOGL shares buy at max 5555)for account \"example\"";
        newRequest.checkpasher(aString1, index);

        // correct example with no space
        String aString3 =
            "(99800AMZNsharesbuy at max5555)for account\"testexmaple___a\"";
        newRequest.checkpasher(aString3, index);

        // correct example with more spaces
        // more stacks
        String aString4 =
            "(  99800       GOOGL     shares        buy at max           5555,  "
                + "6800 GOOGL shares sell at min 20, "
                + "79800 GOOGL shares sell at min 30, "
                + "89800 GOOGL shares sell at min 40, "
                + "09800 GOOGL shares sell at min 50)"
                + "for account                \"linzhang_zhouxiaolin112233\"";
        newRequest.checkpasher(aString4, index);

        // error test
        // more stacks
        String aString11 =
            "(  a99800       GOOGL     shares        buy at max           5555,  "
                + "99800 GOOGL shares sell at min 10, "
                + "8888AAPLsharesbuy at max999  )    "
                + "for account                \"linzhang_zhouxiaolin112233\"";
        newRequest.checkpasher(aString11, index);

        // error test
        String aString12 =
            "(  9800       testGOOGL     shares        buy at max           5555,  "
                + "99800 GOOGL shares sell at min 10, "
                + "8888AAPLsharesbuy at max999  )    "
                + "for account                \"linzhang_zhouxiaolin112233\"";
        newRequest.checkpasher(aString12, index);

        // error test
        String aString18 =
            "(  9800       GOOGL     sharees        buy at max           5555,  "
                + "99800 GOOGL shares sell at min 10, "
                + "8888AAPLsharesbuy at max999  )    "
                + "for account                \"linzhang_zhouxiaolin112233\"";
        newRequest.checkpasher(aString18, index);

        // error test
        String aString19 =
            "(  9800       GOOGL     sharees        buy atmax           5555,  "
                + "99800 GOOGL shares sell at min 10, "
                + "8888AAPLsharesbuy at max999  )    "
                + "for account                \"linzhang_zhouxiaolin112233\"";
        newRequest.checkpasher(aString19, index);

        // error example
        String aString13 =
            "(99800 AMZN shares buyatmax 5555)for account\"testexmaple___a\"";
        newRequest.checkpasher(aString13, index);

        // error example
        String aString14 =
            "(99800 AMZN shares buy at max 5555amazon)for account\"testexmaple___a\"";
        newRequest.checkpasher(aString14, index);

        // error example
        String aString15 =
            "(99800 AMZN shares buy at max 5555)foraccount\"testexmaple___a\"";
        newRequest.checkpasher(aString15, index);

        // error example
        String aString16 =
            "(99800 AMZN shares buy at max 5555)for account\"!@#$$%___a\"";
        newRequest.checkpasher(aString16, index);

        // error example
        String aString17 =
            "(99800 AMON shares buy at max 5555)for account\"!@#$$%___a\"";
        newRequest.checkpasher(aString17, index);

        // error example
        String aString20 =
            "(99800 AMZN shares buy at max)for account\"testexmaple___a\"";
        newRequest.checkpasher(aString20, index);

        // error example
        String aString21 =
            "(99800 AMZN shares buy at max 55501, 99800 AMZN shares buy at max,)for account\"testexmaple___a\"";
        newRequest.checkpasher(aString21, index);

    }

}
