import java.util.Scanner;

public class P1Q2part1 {

    public static void main(String[] args) {
        addRequest newRequest = new addRequest();
        int index = 0;

        // correct example with more spaces
        // more stacks

        System.out.println("Enter: ");
        System.out.println(
            "(  99800       GOOGL     shares        buy at max           5555,  "
                + "99800 GOOGL shares sell at min 10, "
                + "8888AAPLsharesbuy at max999  )    "
                + "for account                \"linzhang_zhouxiaolin112233\"");
        System.out.println("Output: ");

        String aString =
            "(  99800       GOOGL     shares        buy at max           5555,  "
                + "99800 GOOGL shares sell at min 10, "
                + "8888AAPLsharesbuy at max999  )    "
                + "for account                \"linzhang_zhouxiaolin112233\"";
        newRequest.checkpasher(aString, index);

        // correct example with one space
        System.out.println("Enter: ");
        System.out.println(
            "( 99800 GOOGL shares buy at max 5555)for account \"example\"");
        System.out.println("Output: ");

        String aString1 =
            "( 99800 GOOGL shares buy at max 5555)for account \"example\"";
        newRequest.checkpasher(aString1, index);

        System.out.println("Enter: ");
        System.out.println(
            "(99800AMZNsharesbuy at max5555)for account\"testexmaple___a\"");
        // correct example with no space
        String aString3 =
            "(99800AMZNsharesbuy at max5555)for account\"testexmaple___a\"";
        newRequest.checkpasher(aString3, index);

        // correct example with more spaces
        // more stacks

        System.out.println("Enter: ");
        System.out.println(
            "(  99800       GOOGL     shares        buy at max           5555,  "
                + "6800 GOOGL shares sell at min 20, "
                + "79800 GOOGL shares sell at min 30, "
                + "89800 GOOGL shares sell at min 40, "
                + "09800 GOOGL shares sell at min 50)"
                + "for account                \"linzhang_zhouxiaolin112233\"");
        System.out.println("Output: ");

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
        System.out.println("Enter: ");
        System.out.println(
            "(  a99800       GOOGL     shares        buy at max           5555,  "
                + "99800 GOOGL shares sell at min 10, "
                + "8888AAPLsharesbuy at max999  )    "
                + "for account                \"linzhang_zhouxiaolin112233\"");
        System.out.println("Output: ");
        String aString11 =
            "(  a99800       GOOGL     shares        buy at max           5555,  "
                + "99800 GOOGL shares sell at min 10, "
                + "8888AAPLsharesbuy at max999  )    "
                + "for account                \"linzhang_zhouxiaolin112233\"";
        newRequest.checkpasher(aString11, index);

        // error test
        System.out.println("Enter: ");
        System.out.println(
            "(  9800       testGOOGL     shares        buy at max           5555,  "
                + "99800 GOOGL shares sell at min 10, "
                + "8888AAPLsharesbuy at max999  )    "
                + "for account                \"linzhang_zhouxiaolin112233\"");
        System.out.println("Output: ");

        String aString12 =
            "(  9800       testGOOGL     shares        buy at max           5555,  "
                + "99800 GOOGL shares sell at min 10, "
                + "8888AAPLsharesbuy at max999  )    "
                + "for account                \"linzhang_zhouxiaolin112233\"";
        newRequest.checkpasher(aString12, index);

        // error test
        System.out.println("Enter: ");
        System.out.println(
            "(  9800       GOOGL     sharees        buy at max           5555,  "
                + "99800 GOOGL shares sell at min 10, "
                + "8888AAPLsharesbuy at max999  )    "
                + "for account                \"linzhang_zhouxiaolin112233\"");
        System.out.println("Output: ");

        String aString18 =
            "(  9800       GOOGL     sharees        buy at max           5555,  "
                + "99800 GOOGL shares sell at min 10, "
                + "8888AAPLsharesbuy at max999  )    "
                + "for account                \"linzhang_zhouxiaolin112233\"";
        newRequest.checkpasher(aString18, index);

        // error test
        System.out.println("Enter: ");
        System.out.println(
            "(  9800       GOOGL     sharees        buy atmax           5555,  "
                + "99800 GOOGL shares sell at min 10, "
                + "8888AAPLsharesbuy at max999  )    "
                + "for account                \"linzhang_zhouxiaolin112233\"");
        System.out.println("Output: ");

        String aString19 =
            "(  9800       GOOGL     sharees        buy atmax           5555,  "
                + "99800 GOOGL shares sell at min 10, "
                + "8888AAPLsharesbuy at max999  )    "
                + "for account                \"linzhang_zhouxiaolin112233\"";
        newRequest.checkpasher(aString19, index);

        // error example
        System.out.println("Enter: ");
        System.out.println(
            "(99800 AMZN shares buyatmax 5555)for account\"testexmaple___a\"");
        System.out.println("Output: ");

        String aString13 =
            "(99800 AMZN shares buyatmax 5555)for account\"testexmaple___a\"";
        newRequest.checkpasher(aString13, index);

        // error example
        System.out.println("Enter: ");
        System.out.println(
            "(99800 AMZN shares buy at max 5555amazon)for account\"testexmaple___a\"");
        System.out.println("Output: ");

        String aString14 =
            "(99800 AMZN shares buy at max 5555amazon)for account\"testexmaple___a\"";
        newRequest.checkpasher(aString14, index);

        // error example
        System.out.println("Enter: ");
        System.out.println(
            "(99800 AMZN shares buy at max 5555)foraccount\"testexmaple___a\"");
        System.out.println("Output: ");
        String aString15 =
            "(99800 AMZN shares buy at max 5555)foraccount\"testexmaple___a\"";
        newRequest.checkpasher(aString15, index);

        // error example
        System.out.println("Enter: ");
        System.out.println(
            "(99800 AMZN shares buy at max 5555)for account\"!@#$$%___a\"");
        System.out.println("Output: ");
        String aString16 =
            "(99800 AMZN shares buy at max 5555)for account\"!@#$$%___a\"";
        newRequest.checkpasher(aString16, index);

        // error example
        System.out.println("Enter: ");
        System.out.println(
            "(99800 AMZN shares buy at max)for account\"testexmaple___a\"");
        System.out.println("Output: ");
        String aString20 =
            "(99800 AMZN shares buy at max)for account\"testexmaple___a\"";
        newRequest.checkpasher(aString20, index);

        // error example
        System.out.println("Enter: ");
        System.out.println(
            "(99800 AMZN shares buy at max 55501, 99800 AMZN shares buy at max,)for account\"testexmaple___a\"");
        System.out.println("Output: ");
        String aString21 =
            "(99800 AMZN shares buy at max 55501, 99800 AMZN shares buy at max,)for account\"testexmaple___a\"";
        newRequest.checkpasher(aString21, index);

        Scanner inputUser = new Scanner(System.in);
        System.out.println("User Test:");
        System.out.println("Please enter a request HERE: ");
        String userString1 = inputUser.nextLine();
        newRequest.checkpasher(userString1, index);

    }

}
