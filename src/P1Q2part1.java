
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
        
        //1.
        //需要fix 输入两条request
        //因为完事一条request直接就exit了，所以不会运行第二条指令
        //2.
        //cancel 的正确output
    }

}
