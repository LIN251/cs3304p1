
public class P1Q2part1 {

    public static void main(String[] args) {

        addRequest newRequest = new addRequest();
        int index = 0;
        String aString =
            "(  99800       GOOGL     shares        buy at max           5555,  "
                + "99800 GOOGL shares sell at min 10, "
                + "8888AAPLsharesbuy at max999  )    "
                + "for account                \"linzhang_zhouxiaolin112233\"";
        newRequest.checkpasher(aString, index);

        String aString1 =
            "(  99800     GOOGL   shares    buy at max    5555)    "
                + "for account                \"example\"";
        newRequest.checkpasher(aString1, index);

    }

}
