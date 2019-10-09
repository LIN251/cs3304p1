import java.util.Scanner;

public class P1Q2part2 {

// RULE:
// <stock_cancel_requests> ¡ú ¡®cancel (' <trade> {¡®,¡¯ <trade>} ¡®) for account'
// <acct_ident>
// <trade> ¡ú ¡®cancel all' <stock_symbol> ¡®shares¡¯
// <stock_symbol> ¡ú
// 'AAPL'|'HP'|'IBM'|'AMZN'|'MSFT'|'GOOGL'|'INTC'|'CSCO'|'ORCL'|'QCOM'
// <acct_ident> ¡ú ¡®¡°¡®alpha_char { alpha_char | digit | ¡¯_¡¯} ¡®¡°¡®

// Example:
// "( cancel all GOOGL shares ) "for account \"linzhang_zhouxiaolin112233\""

    public static void main(String[] args) {
        System.out.println("Grammer:");
        System.out.println(
            "<stock_cancel_requests> ¡ú ¡®(¡¯ <trade> {¡®,¡¯ <trade>} ¡®) for account¡¯<acct_ident>");
        System.out.println("<trade> ¡ú ¡®cancel all' <stock_symbol> ¡®shares¡¯");
        System.out.println(
            "<stock_symbol> ¡ú'AAPL'|'HP'|'IBM'|'AMZN'|'MSFT'|'GOOGL'|'INTC'|'CSCO'|'ORCL'|'QCOM'");
        System.out.println(
            "<acct_ident> ¡ú ¡®¡°¡®alpha_char { alpha_char | digit | ¡¯_¡¯} ¡®¡°¡®");

        System.out.println();
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
            "( cancel allGOOGLshares,cancel allAMZNshares, cancel allCSCOshares) for account \"___ID\"");
        System.out.println("Output: ");
        // correct input
        String input10 =
            "( cancel allGOOGLshares,cancel allAMZNshares, cancel allCSCOshares) for account \"___ID\"";
        cancelARequest.cancel(input10, index);

        Scanner inputUser = new Scanner(System.in);
        System.out.println("For User Test:");
        System.out.println("Please enter a cancel request HERE: ");
        String userString1 = inputUser.nextLine();
        cancelARequest.cancel(userString1, index);

    }

}
