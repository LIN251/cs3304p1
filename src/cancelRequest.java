
public class cancelRequest {
// ( cancel all GOOGL shares ) for account "linzhang_zhouxiaolin112233"

    public int cancel(String input, int index1) {
        int length = input.length();
        int index = index1;

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
        ch1 = input.charAt(index);
        if (ch1 == 'c') {
            index = index + 1;
            if (index == length) {
                errorOutput(index, input);
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
            errorOutput(index, input);
        }

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
        index = infSpace(index, length, input);
        ch1 = input.charAt(index);
        if (ch1 == ',') {

            index = index + 1;
            if (index == length) {

                errorOutput(index, input);
            }

            index = infSpace(index, length, input);

            cancel(input, index);
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
        // System.out.println("Good to go");
        // System.out.println("call output function here.");
        rightoutput(input);
        return (0);
    }


    public void rightoutput(String s) {
        System.out.println(s);
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

}
