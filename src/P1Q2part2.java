
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
        cancelRequest cancelARequest = new cancelRequest();
        int index = 0;
        // pass
        String input =
            "( cancel all GOOGL  shares ) for account \"linzhang_zhouxiaolin112233\"";
        cancelARequest.cancel(input, index);

    }

}
