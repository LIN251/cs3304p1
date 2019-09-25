
public class P1Q2 {

    public static void main(String[] args) {

        checkpasher(
            "(22222 GOOGL shares buy at max 5555) for account \"linzhang_zhouxiaolin112233\"",
            0);
    }
    
    
    
    public static void checkpasher(String input, int currentindex) {
        int length = input.length();
        int index = currentindex;
        char ch1 = input.charAt(0);
        if (ch1 != '(') {
            errorOutput(index, input);
        }
        index = checkTrade(index, length, input);
        index = checkChar(' ', index, length, input);
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
        index = checkChar(' ', index, length, input);
        index = checkChar('s', index, length, input);
        index = checkChar('h', index, length, input);
        index = checkChar('a', index, length, input);
        index = checkChar('r', index, length, input);
        index = checkChar('e', index, length, input);
        index = checkChar('s', index, length, input);
        index = checkChar(' ', index, length, input);
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
        index = checkChar(' ', index, length, input);
        index = checkTrade(index, length, input);
        if (ch1 == ',') {
            index = index + 1;
            if (index == length) {
                errorOutput(index, input);
            }
            checkpasher(input, index);
        }
        else {
            index = checkChar(')', index, length, input);
            index = checkChar(' ', index, length, input);
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
        index = checkChar(' ', index, length, input);
        index = checkChar('"', index, length, input);
        index = checkident(index, length, input);

        if (length > index + 1) {
            index = index + 1;
            errorOutput(index, input);
        }
        System.out.println("Input correct!");
        System.out.println("Good to go");
        System.out.println("call output function here.");
        //rightoutput(input);
    }


    private static int checkident(int index, int length, String input) {
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


    private static int checkChar(char c, int index, int length, String input) {
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


    private static int checkTrade(int index, int length, String input) {
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


    public static void errorOutput(int index, String input) {
        System.out.println(input);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < index; i++) {
            result.append(" ");
        }
        result.append("^");
        System.out.println(result);
        System.exit(0);
    }


    public static void rightoutput(String s) {
        //////// `````
    }

}
