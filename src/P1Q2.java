
public class P1Q2 {

    public static void main(String[] args) {
        checkpasher("(22222->sharescc");
    }


    public static void checkpasher(String input) {
        int length = input.length();
        int index = 0;
        char ch1 = input.charAt(0);
        if (ch1 != '(') {
            errorOutput(index, input);
        }
        index = checkTrade(index, length, input);
        index = checkChar('-', index, length, input);
        index = checkChar('>', index, length, input);
       // index = checkStock_Symbol(index, length, input);
        index = checkChar('s', index, length, input);
        index = checkChar('h', index, length, input);
        index = checkChar('a', index, length, input);
        index = checkChar('r', index, length, input);
        index = checkChar('e', index, length, input);
        index = checkChar('s', index, length, input);
        System.out.println(index);
        System.out.println("Come here already");

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

//  private static int checkStock_Symbol(int index, int length, String input) {
//
//      char ch1 = input.charAt(index);
//      if (ch1 != '-') {
//          errorOutput(index, input);
//      }
//      else {
//          index = index + 1;
//          if (index == length) {
//              errorOutput(index, input);
//          }
//          ch1 = input.charAt(index);
//          if (ch1 != '>') {
//              errorOutput(index, input);
//          }
//          else {
//              index = index + 1;
//              if (index == length) {
//                  errorOutput(index, input);
//              }
//              return index;
//          }
//      }
//      return index;
//  }
    
    public void rightoutput(String s) {
        //////// `````
    }

}
