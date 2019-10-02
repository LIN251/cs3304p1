
import java.io.IOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class addRequest {
    static boolean buy = false;
    static boolean sell = false;
    BufferedReader reader = new BufferedReader(new InputStreamReader(
        System.in));


    public void checkpasher(String input, int currentindex) {
        int length = input.length();
        int index = currentindex;
        char ch1 = input.charAt(0);
        if (index == 0) {
            if (ch1 != '(') {
                errorOutput(index, input);
            }
            index = index + 1;
            if (index == length) {
                errorOutput(index, input);
            }
        }
        index = infSpace(index, length, input);
        index = checkTrade(index, length, input);
        index = infSpace(index, length, input);
        ch1 = input.charAt(index);
        if (ch1 == 'A') {

            index = index + 1;
            if (index == length) {
                errorOutput(index, input);
            }
            ch1 = input.charAt(index);
            if (ch1 == 'A') {
                index = index + 1;
                if (index == length) {
                    errorOutput(index, input);
                }
                index = checkChar('P', index, length, input);
                index = checkChar('L', index, length, input);

            }
            else if (ch1 == 'M') {
                index = index + 1;
                if (index == length) {
                    errorOutput(index, input);
                }
                index = checkChar('Z', index, length, input);
                index = checkChar('N', index, length, input);
            }
            else {
                errorOutput(index, input);
            }
        }
        else if (ch1 == 'I') {
            index = index + 1;
            if (index == length) {
                errorOutput(index, input);
            }
            ch1 = input.charAt(index);
            if (ch1 == 'B') {
                index = index + 1;
                if (index == length) {
                    errorOutput(index, input);
                }
                index = checkChar('M', index, length, input);
            }
            else if (ch1 == 'N') {
                index = index + 1;
                if (index == length) {
                    errorOutput(index, input);
                }
                index = checkChar('T', index, length, input);
                index = checkChar('C', index, length, input);
            }
            else {
                errorOutput(index, input);
            }
        }
        else if (ch1 == 'H') {
            index = index + 1;
            if (index == length) {
                errorOutput(index, input);
            }
            index = checkChar('P', index, length, input);
        }
        else if (ch1 == 'M') {
            index = index + 1;
            if (index == length) {
                errorOutput(index, input);
            }
            index = checkChar('S', index, length, input);
            index = checkChar('F', index, length, input);
            index = checkChar('T', index, length, input);
        }
        else if (ch1 == 'G') {
            index = index + 1;
            if (index == length) {
                errorOutput(index, input);
            }
            index = checkChar('O', index, length, input);
            index = checkChar('O', index, length, input);
            index = checkChar('G', index, length, input);
            index = checkChar('L', index, length, input);
        }
        else if (ch1 == 'C') {
            index = index + 1;
            if (index == length) {
                errorOutput(index, input);
            }
            index = checkChar('S', index, length, input);
            index = checkChar('C', index, length, input);
            index = checkChar('O', index, length, input);
        }
        else if (ch1 == 'O') {
            index = index + 1;
            if (index == length) {
                errorOutput(index, input);
            }
            index = checkChar('R', index, length, input);
            index = checkChar('C', index, length, input);
            index = checkChar('L', index, length, input);

        }
        else if (ch1 == 'Q') {
            index = index + 1;
            if (index == length) {
                errorOutput(index, input);
            }
            index = checkChar('C', index, length, input);
            index = checkChar('O', index, length, input);
            index = checkChar('M', index, length, input);

        }
        else {
            errorOutput(index, input);
        }
        index = infSpace(index, length, input);
        index = checkChar('s', index, length, input);
        index = checkChar('h', index, length, input);
        index = checkChar('a', index, length, input);
        index = checkChar('r', index, length, input);
        index = checkChar('e', index, length, input);
        index = checkChar('s', index, length, input);
        index = infSpace(index, length, input);
        ch1 = input.charAt(index);
        if (ch1 == 'b') {
            index = index + 1;
            if (index == length) {
                errorOutput(index, input);
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
                errorOutput(index, input);
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
            errorOutput(index, input);
        }

        ch1 = input.charAt(index);
        index = infSpace(index, length, input);
        index = checkTrade(index, length, input);
        index = infSpace(index, length, input);
        ch1 = input.charAt(index);
        if (ch1 == ',') {

            index = index + 1;
            if (index == length) {
                errorOutput(index, input);
            }

            index = infSpace(index, length, input);

            checkpasher(input, index);
        }
        else {
            index = checkChar(')', index, length, input);
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
        index = infSpace(index, length, input);
        index = checkChar('"', index, length, input);
        index = checkident(index, length, input);

        if (length > index + 1) {
            index = index + 1;
            errorOutput(index, input);
        }

        rightoutput(input);
        System.exit(0);
    }


    /*
     * 
     */
    private int infSpace(int index, int length, String input) {

        char ch1;
        while (index < length) {
            ch1 = input.charAt(index);
            if (ch1 == ' ') {
                index = index + 1;
                if (index == length) {
                    errorOutput(index, input);
                }
            }
            else {
                return index;
            }

        }
        return index;
    }


    private int checkident(int index, int length, String input) {
        for (int i = index; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i)) || input.charAt(i) == '_'
                || String.valueOf(input.charAt(i)).matches("[A-Za-z]{1}")) {
                index = index + 1;
                if (index == length) {
                    errorOutput(index, input);
                }
            }
            else if (input.charAt(i) == '"') {
                return index;
            }
            else {
                errorOutput(index, input);
            }
        }
        return index;
    }


    private int checkChar(char c, int index, int length, String input) {
        char ch1 = input.charAt(index);
        if (ch1 != c) {
            errorOutput(index, input);
        }
        else {
            index = index + 1;
            if (index == length) {
                errorOutput(index, input);
            }
        }
        return index;
    }


    private int checkTrade(int index, int length, String input) {
        index = index + 1;
        if (index == length) {
            errorOutput(index, input);
        }
        if (Character.isDigit(input.charAt(index))) {
            index = index + 1;
            if (index == length) {
                errorOutput(index, input);
            }
            while (Character.isDigit(input.charAt(index))) {
                index = index + 1;
                if (index == length) {
                    errorOutput(index, input);
                }
            }
        }
        else {
            errorOutput(index, input);

        }
        return index;
    }


    public void errorOutput(int index, String input) {
        System.out.println(input);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < index; i++) {
            result.append(" ");
        }
        result.append("^");
        System.out.println(result);
        System.exit(0);
    }


    public void rightoutput(String s) {
        // System.out.println(s);
        String[] opr_account = s.split("for account");
        String[] str_list = opr_account[0].replace('(', ' ').replace(')', ' ')
            .replaceAll("buy at max", " buy ").replaceAll("sell at min",
                " sell ").replaceAll("AAPL", " AAPL ").replaceAll("HP", " HP ")
            .replaceAll("IBM", " IBM ").replaceAll("AMZN", " AMZN ").replaceAll(
                "MSFT", " MSFT ").replaceAll("GOOGL", " GOOGL ").replaceAll(
                    "INTC", " INTC ").replaceAll("CSCO", " CSCO ").replaceAll(
                        "ORCL", " ORCL ").replaceAll("QCOM", " QCOM ")
            .replaceAll("shares", " ").split(",");
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

        if (buy) {
            System.out.println(
                "INSERT INTO BuyRequests (NumShares, Symbol, MaxPrice, AccountID)");
            for (int i = 0; i < str_list.length; i++) {
                if (str_token[i][2].equals("buy")) {
                    System.out.println("        VALUES ('" + str_token[i][0]
                        + "','" + str_token[i][1] + "','" + str_token[i][3]
                        + "','" + accountID + "')");
                }
            }
        }

        if (sell) {
            System.out.println(
                "INSERT INTO SellRequests(NumShares, Symbol, MinPrice, AccountID)");
            for (int i = 0; i < str_list.length; i++) {
                if (str_token[i][2].equals("sell")) {
                    System.out.println("        VALUES ('" + str_token[i][0]
                        + "','" + str_token[i][1] + "','" + str_token[i][3]
                        + "','" + accountID + "')");
                }
            }
        }
    }
}
