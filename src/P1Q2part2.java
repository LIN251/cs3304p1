import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P1Q2part2 {

    public static void main(String[] args) {
        System.out.println("Example:");
        System.out.println(
            "( cancel all GOOGL shares ) \"for account \"linzhang_zhouxiaolin112233\"");
        System.out.println();
        System.out.println();
        System.out.println("Run test:");

        cancelRequest cancelARequest = new cancelRequest();
        int index = 0;
        // test wrong input
        System.out.println("Enter: ");
        System.out.println(
            "( cancel all GOOGL shares , cancel all AMZN shares , cancel all CSCO shares ) for account \"cs3304ID\"");
        System.out.println("Output: ");

        String input81 =
            "( cancel all GOOGL shares , cancel all AMZN shares , cancel all CSCO shares ) for account \"cs3304ID\"";
        cancelARequest.cancel(input81, index);
        System.out.println("Enter: ");
        System.out.println(
            "( cancel all GOOGL  shares45 ) for account \"linzhang_zhouxiaolin112233\"");
        System.out.println("Output: ");
        String input =
            "( cancel all GOOGL  shares45 ) for account \"linzhang_zhouxiaolin112233\"";
        cancelARequest.cancel(input, index);

        System.out.println("Enter: ");
        System.out.println(
            "( cancelwq24 all GOOGL  shares ) for account \"linzhang_zhouxiaolin112233\"");
        System.out.println("Output: ");
        String input2 =
            "( cancelwq24 all GOOGL  shares ) for account \"linzhang_zhouxiaolin112233\"";
        cancelARequest.cancel(input2, index);

        System.out.println("Enter: ");
        System.out.println(
            "( cancel all GOOGL4  shares ) for account \"linzhang_zhouxiaolin112233\"");
        System.out.println("Output: ");
        String input3 =
            "( cancel all GOOGL4  shares ) for account \"linzhang_zhouxiaolin112233\"";
        cancelARequest.cancel(input3, index);

        System.out.println("Enter: ");
        System.out.println(
            "( cancel all GOOGL  shares ) for account2223 \"linzhang_zhouxiaolin112233\"");
        System.out.println("Output: ");
        String input4 =
            "( cancel all GOOGL  shares ) for account2223 \"linzhang_zhouxiaolin112233\"";
        cancelARequest.cancel(input4, index);

        System.out.println("Enter: ");
        System.out.println(
            "( cancel all GOOGL  shares ) for account \"@%#^*zhouxiaolin112233\"");
        System.out.println("Output: ");
        String input5 =
            "( cancel all GOOGL  shares ) for account \"@%#^*zhouxiaolin112233\"";
        cancelARequest.cancel(input5, index);

        System.out.println("Enter: ");
        System.out.println(
            "( cancel all GOOGL  shares ) foraccount \"linzhang_zhouxiaolin112233\"");
        System.out.println("Output: ");

        String input6 =
            "( cancel all GOOGL  shares ) foraccount \"linzhang_zhouxiaolin112233\"";
        cancelARequest.cancel(input6, index);

        System.out.println("Enter: ");
        System.out.println(
            "( cancel all GOOGL  shares )%$^for account \"linzhang_zhouxiaolin112233\"");
        System.out.println("Output: ");

        String input7 =
            "( cancel all GOOGL  shares )%$^for account \"linzhang_zhouxiaolin112233\"";
        cancelARequest.cancel(input7, index);

        System.out.println("Enter: ");
        System.out.println(
            "( cancelall GOOGL4  shares ) for account \"linzhang_zhouxiaolin112233\"");
        System.out.println("Output: ");

        String input20 =
            "( cancelall GOOGL4  shares ) for account \"linzhang_zhouxiaolin112233\"";
        cancelARequest.cancel(input20, index);

        // correct input
        System.out.println("Enter: ");
        System.out.println(
            "( cancel all GOOGL  shares ) for account \"linzhang_zhouxiaolin\"");
        System.out.println("Output: ");
        String input8 =
            "( cancel all GOOGL  shares ) for account \"linzhang_zhouxiaolin\"";
        cancelARequest.cancel(input8, index);

        // correct input
        System.out.println("Enter: ");
        System.out.println(
            "( cancel all GOOGL  shares, cancel all AMZN shares ) for account \"Id___correct\"");
        System.out.println("Output: ");
        String input9 =
            "( cancel all GOOGL  shares, cancel all AMZN shares ) for account \"Id___correct\"";
        cancelARequest.cancel(input9, index);

        System.out.println("Enter: ");
        System.out.println(
            "(cancel allGOOGLshares,cancel allAMZNshares, cancel allCSCOshares) for account \"___ID\"");
        System.out.println("Output: ");

        String input10 =
            "(cancel allGOOGLshares,cancel allAMZNshares, cancel allCSCOshares) for account \"___ID\"";
        cancelARequest.cancel(input10, index);

        System.out.println("Enter: ");
        System.out.println(
            "( cancel allGOOGLshares,cancel allAMZNshares, cancel allCSCOshares) for account \"___ID\"");
        System.out.println("Output: ");

        String input80 =
            "( cancel allGOOGLshares,cancel allAMZNshares, cancel allCSCOshares) for account \"___ID\"";
        cancelARequest.cancel(input80, index);

        System.out.println("Enter: ");
        System.out.println(
            "( cancel all GOOGL shares , cancel all AMZN shares , cancel all CSCO shares ) for account \"3304ID\"");
        System.out.println("Output: ");

        String input82 =
            "( cancel all GOOGL shares , cancel all AMZN shares , cancel all CSCO shares ) for account \"3304ID\"";
        cancelARequest.cancel(input82, index);

        System.out.println("Enter: ");
        System.out.println(
            "( cancel all GOOGL shares , cancel all AMZN shares , cancel all CSCO shares ) for account \"_3304ID\"");
        System.out.println("Output: ");

        String input85 =
            "( cancel all GOOGL shares , cancel all AMZN shares , cancel all CSCO shares ) for account \"_3304ID\"";
        cancelARequest.cancel(input85, index);

        Scanner inputUser = new Scanner(System.in);
        System.out.println("For User Test:");
        System.out.println("Please enter a cancel request HERE: ");
        String userString1 = inputUser.nextLine();
        cancelARequest.cancel(userString1, index);

    }


    public static class cancelRequest {
        // ( cancel all GOOGL shares ) for account "linzhang_zhouxiaolin112233"
        static boolean buy = false;
        static boolean sell = false;
        BufferedReader reader = new BufferedReader(new InputStreamReader(
            System.in));


        public int cancel(String input, int index1) {
            if (index1 == -1) {
                return -1;
            }
            int length = input.length();
            int index = index1;
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
            if (index == -1) {
                return -1;
            }
            ch1 = input.charAt(index);
            if (ch1 == 'c') {
                index = index + 1;
                if (index == length) {
                    index = errorOutput(index, input);
                }
                index = checkChar('a', index, length, input);
                index = checkChar('n', index, length, input);
                index = checkChar('c', index, length, input);
                index = checkChar('e', index, length, input);
                index = checkChar('l', index, length, input);
                index = checkChar(' ', index, length, input);
                index = checkChar('a', index, length, input);
                index = checkChar('l', index, length, input);
                index = checkChar('l', index, length, input);
            }
            else {
                index = errorOutput(index, input);
            }
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

                index = cancel(input, index);
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
                rightoutput2(input);
                System.out.println();
                index = -1;
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


        private int checkChar(char c, int index, int length, String input) {
            if (index == -1) {
                return -1;
            }
            char ch1 = input.charAt(index);
            if (ch1 != c) {
                index = errorOutput(index, input);
                if (index == -1) {
                    return -1;
                }
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


        private int infSpace(int index, int length, String input) {
            if (index == -1) {
                return -1;
            }
            char ch1;
            while (index < length) {
                if (index == -1) {
                    return -1;
                }
                ch1 = input.charAt(index);
                if (ch1 == ' ') {
                    index = index + 1;
                    if (index == length) {
                        index = errorOutput(index, input);
                        if (index == -1) {
                            return -1;
                        }
                    }
                }
                else {
                    return index;
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


        public void rightoutput2(String s) {
            String[] opr_account = s.split("for account");
            String[] str_list = opr_account[0].replace('(', ' ').replace(')',
                ' ').replaceAll("cancel", "").replaceAll("AAPL", " AAPL ")
                .replaceAll("HP", " HP ").replaceAll("IBM", " IBM ").replaceAll(
                    "AMZN", " AMZN ").replaceAll("MSFT", " MSFT ").replaceAll(
                        "GOOGL", " GOOGL ").replaceAll("INTC", " INTC ")
                .replaceAll("CSCO", " CSCO ").replaceAll("ORCL", " ORCL ")
                .replaceAll("QCOM", " QCOM ").replaceAll("all", "").replaceAll(
                    "shares", "").split(",");
            String accountID = opr_account[1].replaceAll(" +", " ").replace('"',
                ' ').trim();

            String[][] str_token = new String[str_list.length][1];
            String[] str_temp_token = new String[1];
            for (int i = 0; i < str_list.length; i++) {
                str_temp_token = str_list[i].trim().replaceAll(" +", " ").split(
                    " ");
                str_token[i][0] = str_temp_token[0];

            }

            System.out.println(
                "INSERT INTO Cancal All Requests For (Symbol, AccountID)");
            for (int i = 0; i < str_list.length; i++) {

                System.out.println("        VALUES ('" + str_token[i][0] + "','"
                    + accountID + "')");

            }

        }

    }
}
