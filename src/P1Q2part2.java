
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
        // test wrong input
        String input =
            "( cancel all GOOGL  shares45 ) for account \"linzhang_zhouxiaolin112233\"";
        cancelARequest.cancel(input, index);

        String input2 =
            "( cancelwq24 all GOOGL  shares ) for account \"linzhang_zhouxiaolin112233\"";
        cancelARequest.cancel(input2, index);

        String input3 =
            "( cancel all GOOGL4  shares ) for account \"linzhang_zhouxiaolin112233\"";
        cancelARequest.cancel(input3, index);

        String input4 =
            "( cancel all GOOGL  shares ) for account2223 \"linzhang_zhouxiaolin112233\"";
        cancelARequest.cancel(input4, index);

        String input5 =
            "( cancel all GOOGL  shares ) for account \"@%#^*zhouxiaolin112233\"";
        cancelARequest.cancel(input5, index);

        String input6 =
            "( cancel all GOOGL  shares ) foraccount \"linzhang_zhouxiaolin112233\"";
        cancelARequest.cancel(input6, index);

        String input7 =
            "( cancel all GOOGL  shares )%$^for account \"linzhang_zhouxiaolin112233\"";
        cancelARequest.cancel(input7, index);
        
        String input20 =
            "( cancelall GOOGL4  shares ) for account \"linzhang_zhouxiaolin112233\"";
        cancelARequest.cancel(input20, index);

        // correct input
        String input8 =
            "( cancel all GOOGL  shares ) for account \"linzhang_zhouxiaolin\"";
        cancelARequest.cancel(input8, index);
        
        // correct input
        String input9 =
            "( cancel all GOOGL  shares, cancel all AMZN shares ) for account \"Id___correct\"";
        cancelARequest.cancel(input9, index);
        
        
        
        // correct input
        String input10 =
            "( cancel allGOOGLshares,cancel allAMZNshares, cancel allCSCOshares) for account \"___ID\"";
        cancelARequest.cancel(input10, index);
        
        

        

    }

}
