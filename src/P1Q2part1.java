import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1Q2part1 {

    public static void main(String[] args) {
        addRequest newRequest = new addRequest();
        int index = 0;

        // correct example with more spaces
        // more stacks

        System.out.println("Enter: ");
        System.out.println(
            "(  99800       GOOGL     shares        buy at max           5555 ,  "
                + "99800 GOOGL shares sell at min 10 , "
                + "8888 AAPL    shares buy at max 999  )    "
                + "for account                \"linzhang_zhouxiaolin112233\"");
        System.out.println("Output: ");

        String aString =
            "(  99800       GOOGL     shares        buy at max           5555 ,  "
                + "99800 GOOGL shares sell at min 10 , "
                + "8888 AAPL    shares buy at max 999  )    "
                + "for account                \"linzhang_zhouxiaolin112233\"";
        newRequest.checkpasher(aString, index);

        // correct example with one space
        System.out.println("Enter: ");
        System.out.println(
            "( 99800 GOOGL shares sell at min 5555 ) for account \"example\"");
        System.out.println("Output: ");

        String aString1 =
            "( 99800 GOOGL shares sell at min 5555 ) for account \"example\"";
        newRequest.checkpasher(aString1, index);

        System.out.println("Enter: ");
        System.out.println(
            "( 998005555 AMZN shares buy at max 5555 ) for account \"testexmaple___a\"");
        // correct example with no space
        String aString3 =
            "( 998005555 AMZN shares buy at max 5555 ) for account \"testexmaple___a\"";
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
            "( 99800 AMZN shares buyatmax 5555 ) for account \"testexmaple___a\"");
        System.out.println("Output: ");

        String aString13 =
            "( 99800 AMZN shares buyatmax 5555 ) for account \"testexmaple___a\"";
        newRequest.checkpasher(aString13, index);

        // error example
        System.out.println("Enter: ");
        System.out.println(
            "( 99800 AMZN shares buy at max 5555amazon ) for account \"testexmaple___a\"");
        System.out.println("Output: ");

        String aString14 =
            "( 99800 AMZN shares buy at max 5555amazon ) for account \"testexmaple___a\"";
        newRequest.checkpasher(aString14, index);

        // error example
        System.out.println("Enter: ");
        System.out.println(
            "( 99800 AMZN shares buy at max 5555)foraccount\"testexmaple___a\"");
        System.out.println("Output: ");
        String aString15 =
            "( 99800 AMZN shares buy at max 5555 ) foraccount \"testexmaple___a\"";
        newRequest.checkpasher(aString15, index);

        // error example
        System.out.println("Enter: ");
        System.out.println(
            "( 99800 AMZN shares buy at max 5555 ) for account \"!@#$$%___a\"");
        System.out.println("Output: ");
        String aString16 =
            "( 99800 AMZN shares buy at max 5555 ) for account \"!@#$$%___a\"";
        newRequest.checkpasher(aString16, index);

        // error example
        System.out.println("Enter: ");
        System.out.println(
            "( 99800 AMZN shares buy at max ) for account \"testexmaple___a\"");
        System.out.println("Output: ");
        String aString20 =
            "( 99800 AMZN shares buy at max ) for account \"testexmaple___a\"";
        newRequest.checkpasher(aString20, index);

        // error example
        System.out.println("Enter: ");
        System.out.println(
            "(99800 AMZN shares buy at max 55501, 99800 AMZN shares buy at max, ) for account \"testexmaple___a\"");
        System.out.println("Output: ");
        String aString22 =
            "(99800 AMZN shares buy at max 55501, 99800 AMZN shares buy at max, ) for account \"testexmaple___a\"";
        newRequest.checkpasher(aString22, index);

        // error example
        System.out.println("Enter: ");
        System.out.println(
            "( 99800AMZNshares buy at max 55501, 99800 AMZN shares buy at max, ) for account \"testexmaple___a\"");
        System.out.println("Output: ");
        String aString23 =
            "( 99800AMZNshares buy at max 55501, 99800 AMZN shares buy at max, ) for account \"testexmaple___a\"";
        newRequest.checkpasher(aString23, index);

        // error example
        System.out.println("Enter: ");
        System.out.println(
            "( 99800 AMZN shares buy at max 55501 , 99800 AMZN shares buy at max 99 ) for account \"6estexmaple___a\"");
        System.out.println("Output: ");
        String aString24 =
            "( 99800 AMZN shares buy at max 55501 , 99800 AMZN shares buy at max 99 ) for account \"6estexmaple___a\"";
        newRequest.checkpasher(aString24, index);

        Scanner inputUser = new Scanner(System.in);
        System.out.println("User Test:");
        System.out.println("Please enter a request HERE: ");
        String userString1 = inputUser.nextLine();
        newRequest.checkpasher(userString1, index);

    }


    public static class addRequest {
        static boolean buy = false;
        static boolean sell = false;
        BufferedReader reader = new BufferedReader(new InputStreamReader(
            System.in));


        public int checkpasher(String input, int currentindex) {

            int length = input.length();
            int index = currentindex;
            if (index == -1) {
                return -1;
            }
            char ch1 = input.charAt(0);

            if (index == 0) {
                if (ch1 != '(') {
                    index = errorOutput(index, input);
                }
                index = index + 1;
                if (index == length) {
                    index = errorOutput(index, input);
                }
                index = requireSpace(index, length, input);
            }

            index = infSpace(index, length, input);
            index = checkTrade(index, length, input);
            index = requireSpace(index, length, input);
            index = infSpace(index, length, input);
            if (index == -1) {
                return -1;
            }
            ch1 = input.charAt(index);
            if (ch1 == 'A') {

                index = index + 1;
                if (index == length) {
                    index = errorOutput(index, input);
                }

                if (index == -1) {
                    return -1;
                }

                ch1 = input.charAt(index);
                if (ch1 == 'A') {
                    index = index + 1;
                    if (index == length) {
                        index = errorOutput(index, input);
                    }
                    index = checkChar('P', index, length, input);
                    index = checkChar('L', index, length, input);

                }
                else if (ch1 == 'M') {
                    index = index + 1;
                    if (index == length) {
                        index = errorOutput(index, input);
                    }
                    index = checkChar('Z', index, length, input);
                    index = checkChar('N', index, length, input);
                }
                else {
                    index = errorOutput(index, input);
                }
            }
            else if (ch1 == 'I') {
                index = index + 1;
                if (index == length) {
                    index = errorOutput(index, input);
                }
                if (index == -1) {
                    return -1;
                }
                ch1 = input.charAt(index);
                if (ch1 == 'B') {
                    index = index + 1;
                    if (index == length) {
                        index = errorOutput(index, input);
                    }
                    index = checkChar('M', index, length, input);
                }
                else if (ch1 == 'N') {
                    index = index + 1;
                    if (index == length) {
                        index = errorOutput(index, input);
                    }
                    index = checkChar('T', index, length, input);
                    index = checkChar('C', index, length, input);
                }
                else {
                    index = errorOutput(index, input);
                }
            }
            else if (ch1 == 'H') {
                index = index + 1;
                if (index == length) {
                    index = errorOutput(index, input);
                }
                index = checkChar('P', index, length, input);
            }
            else if (ch1 == 'M') {
                index = index + 1;
                if (index == length) {
                    index = errorOutput(index, input);
                }
                index = checkChar('S', index, length, input);
                index = checkChar('F', index, length, input);
                index = checkChar('T', index, length, input);
            }
            else if (ch1 == 'G') {
                index = index + 1;
                if (index == length) {
                    index = errorOutput(index, input);
                }
                index = checkChar('O', index, length, input);
                index = checkChar('O', index, length, input);
                index = checkChar('G', index, length, input);
                index = checkChar('L', index, length, input);
            }
            else if (ch1 == 'C') {
                index = index + 1;
                if (index == length) {
                    index = errorOutput(index, input);
                }
                index = checkChar('S', index, length, input);
                index = checkChar('C', index, length, input);
                index = checkChar('O', index, length, input);
            }
            else if (ch1 == 'O') {
                index = index + 1;
                if (index == length) {
                    index = errorOutput(index, input);
                }
                index = checkChar('R', index, length, input);
                index = checkChar('C', index, length, input);
                index = checkChar('L', index, length, input);

            }
            else if (ch1 == 'Q') {
                index = index + 1;
                if (index == length) {
                    index = errorOutput(index, input);
                }
                index = checkChar('C', index, length, input);
                index = checkChar('O', index, length, input);
                index = checkChar('M', index, length, input);

            }
            else {
                index = errorOutput(index, input);
            }
            index = requireSpace(index, length, input);
            index = infSpace(index, length, input);
            index = checkChar('s', index, length, input);
            index = checkChar('h', index, length, input);
            index = checkChar('a', index, length, input);
            index = checkChar('r', index, length, input);
            index = checkChar('e', index, length, input);
            index = checkChar('s', index, length, input);
            index = requireSpace(index, length, input);
            index = infSpace(index, length, input);
            if (index == -1) {
                return -1;
            }
            ch1 = input.charAt(index);
            if (ch1 == 'b') {
                index = index + 1;
                if (index == length) {
                    index = errorOutput(index, input);
                }
                index = checkChar('u', index, length, input);
                index = checkChar('y', index, length, input);
                index = checkChar(' ', index, length, input);
                index = checkChar('a', index, length, input);
                index = checkChar('t', index, length, input);
                index = checkChar(' ', index, length, input);
                index = checkChar('m', index, length, input);
                index = checkChar('a', index, length, input);
                index = checkChar('x', index, length, input);
            }
            else if (ch1 == 's') {
                index = index + 1;
                if (index == length) {
                    index = errorOutput(index, input);
                }
                index = checkChar('e', index, length, input);
                index = checkChar('l', index, length, input);
                index = checkChar('l', index, length, input);
                index = checkChar(' ', index, length, input);
                index = checkChar('a', index, length, input);
                index = checkChar('t', index, length, input);
                index = checkChar(' ', index, length, input);
                index = checkChar('m', index, length, input);
                index = checkChar('i', index, length, input);
                index = checkChar('n', index, length, input);
            }
            else {
                index = errorOutput(index, input);
            }
            if (index == -1) {
                return -1;
            }

            index = requireSpace(index, length, input);
            index = infSpace(index, length, input);
            ch1 = input.charAt(index);
            index = checkTrade(index, length, input);
            index = requireSpace(index, length, input);
            index = infSpace(index, length, input);
            if (index == -1) {
                return -1;
            }
            ch1 = input.charAt(index);
            if (ch1 == ',') {
                index = index + 1;
                if (index == length) {
                    index = errorOutput(index, input);
                }
                index = requireSpace(index, length, input);
                index = infSpace(index, length, input);
                int tempindex = checkpasher(input, index);
                if (tempindex + 1 == input.length()) {
                    return tempindex;
                }
                if (tempindex == -1) {
                    return -1;
                }

            }
            else {

                index = checkChar(')', index, length, input);
                index = requireSpace(index, length, input);
                index = infSpace(index, length, input);
                index = checkChar('f', index, length, input);
                index = checkChar('o', index, length, input);
                index = checkChar('r', index, length, input);
                index = checkChar(' ', index, length, input);
                index = checkChar('a', index, length, input);
                index = checkChar('c', index, length, input);
                index = checkChar('c', index, length, input);
                index = checkChar('o', index, length, input);
                index = checkChar('u', index, length, input);
                index = checkChar('n', index, length, input);
                index = checkChar('t', index, length, input);
            }

            index = requireSpace(index, length, input);
            index = infSpace(index, length, input);
            index = checkChar('"', index, length, input);

            index = checkChar2(index, length, input);

            index = checkident(index, length, input);
            if (length > index + 1) {
                index = index + 1;
                index = errorOutput(index, input);
            }

            if (index >= 0) {
                rightoutput(input);
                System.out.println();
            }

            return index;

        }


        /*
         * 
         */
        private int infSpace(int index, int length, String input) {
            if (index == -1) {
                return -1;
            }
            char ch1;
            while (index < length) {
                ch1 = input.charAt(index);
                if (ch1 == ' ') {
                    index = index + 1;
                    if (index == length) {
                        index = errorOutput(index, input);

                    }
                }
                else {
                    return index;
                }

            }
            return index;
        }


        private int requireSpace(int index, int length, String input) {
            if (index == -1) {
                return -1;
            }
            char ch1;
            for (int i = 0; i < 1; i++) {
                ch1 = input.charAt(index);
                if (ch1 == ' ') {
                    index = index + 1;
                    if (index == length) {
                        index = errorOutput(index, input);

                    }
                }
                else {
                    index = errorOutput(index, input);
                }

            }
            return index;
        }


        private int checkident(int index, int length, String input) {
            if (index == -1) {
                return -1;
            }
            for (int i = index; i < input.length(); i++) {
                if (Character.isDigit(input.charAt(i)) || input.charAt(i) == '_'
                    || String.valueOf(input.charAt(i)).matches("[A-Za-z]{1}")) {
                    index = index + 1;
                    if (index == length) {
                        index = errorOutput(index, input);
                        if (index == -1) {
                            return -1;
                        }
                    }
                }
                else if (input.charAt(i) == '"') {
                    return index;
                }
                else {
                    index = errorOutput(index, input);
                    if (index == -1) {
                        return -1;
                    }
                }
            }
            return index;
        }


        private int checkChar2(int index, int length, String input) {
            if (index == -1) {
                return -1;
            }
            char ch1 = input.charAt(index);
            String str = String.valueOf(ch1);
            if (!str.matches("[A-Za-z]{1}")) {
                int tempres = errorOutput(index, input);

                return tempres;

            }
            else {
                index = index + 1;
                if (index == length) {
                    index = errorOutput(index, input);
                    if (index == -1) {
                        return -1;
                    }
                }
            }
            return index;
        }


        private int checkChar(char c, int index, int length, String input) {
            if (index == -1) {
                return -1;
            }
            char ch1 = input.charAt(index);
            if (ch1 != c) {
                int tempres = errorOutput(index, input);

                return tempres;

            }
            else {
                index = index + 1;
                if (index == length) {
                    index = errorOutput(index, input);
                    if (index == -1) {
                        return -1;
                    }
                }
            }
            return index;
        }


        private int checkTrade(int index, int length, String input) {
            if (index == -1) {
                return -1;
            }
            if (index == length) {
                index = errorOutput(index, input);
                if (index == -1) {
                    return -1;
                }
            }
            if (Character.isDigit(input.charAt(index))) {
                index = index + 1;
                if (index == length) {
                    index = errorOutput(index, input);
                    if (index == -1) {
                        return -1;
                    }
                }
                while (Character.isDigit(input.charAt(index))) {
                    index = index + 1;
                    if (index == length) {
                        index = errorOutput(index, input);
                        if (index == -1) {
                            return -1;
                        }
                    }
                }
            }
            else {
                index = errorOutput(index, input);
                if (index == -1) {
                    return -1;
                }

            }
            return index;
        }


        public int errorOutput(int index, String input) {
            if (index == 0) {
                return -1;
            }
            if (index != -1) {
                System.out.println(input);
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < index; i++) {
                    result.append(" ");
                }
                result.append("^");
                System.out.println(result);
                return -1;
            }
            return -1;
        }


        public void rightoutput(String s) {
            String[] opr_account = s.split("for account");
            String[] str_list = opr_account[0].replace('(', ' ').replace(')',
                ' ').replaceAll("buy at max", " buy ").replaceAll("sell at min",
                    " sell ").replaceAll("AAPL", " AAPL ").replaceAll("HP",
                        " HP ").replaceAll("IBM", " IBM ").replaceAll("AMZN",
                            " AMZN ").replaceAll("MSFT", " MSFT ").replaceAll(
                                "GOOGL", " GOOGL ").replaceAll("INTC", " INTC ")
                .replaceAll("CSCO", " CSCO ").replaceAll("ORCL", " ORCL ")
                .replaceAll("QCOM", " QCOM ").replaceAll("shares", " ").split(
                    ",");
            String accountID = opr_account[1].replaceAll(" +", " ").replace('"',
                ' ').trim();

            String[][] str_token = new String[str_list.length][4];
            String[] str_temp_token = new String[4];
            for (int i = 0; i < str_list.length; i++) {
                str_temp_token = str_list[i].trim().replaceAll(" +", " ").split(
                    " ");
                str_token[i][0] = str_temp_token[0];
                str_token[i][1] = str_temp_token[1];
                str_token[i][2] = str_temp_token[2];
                str_token[i][3] = str_temp_token[3];
                if (!buy && str_temp_token[2].equals("buy")) {
                    buy = true;
                }
                if (!sell && str_temp_token[2].equals("sell")) {
                    sell = true;
                }
            }
            int counter1 = 0;
            int counter2 = 0;

            if (buy) {
                System.out.println(
                    "INSERT INTO BuyRequests (NumShares, Symbol, MaxPrice, AccountID)");
                for (int i = 0; i < str_list.length; i++) {
                    if (str_token[i][2].equals("buy")) {
                        counter1++;
                        System.out.println("        VALUES ('" + str_token[i][0]
                            + "','" + str_token[i][1] + "','" + str_token[i][3]
                            + "','" + accountID + "')");
                    }
                }
                if (0 == counter1) {
                    System.out.println(
                        "        No buy requests for this account");
                }

            }

            if (sell) {
                System.out.println(
                    "INSERT INTO SellRequests(NumShares, Symbol, MinPrice, AccountID)");
                for (int i = 0; i < str_list.length; i++) {
                    if (str_token[i][2].equals("sell")) {
                        counter2++;
                        System.out.println("        VALUES ('" + str_token[i][0]
                            + "','" + str_token[i][1] + "','" + str_token[i][3]
                            + "','" + accountID + "')");
                    }
                }
                if (0 == counter2) {
                    System.out.println(
                        "        No sell requests for this account");
                }

            }
        }
    }

}
