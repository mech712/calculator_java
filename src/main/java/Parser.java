class Parser{
    private final String str;

    public Parser(String str){
        this.str = str;
    }

    public Calculator parse() throws Exception{
        var tokens = str.split(" ");

        if( !(tokens.length==3 && tokens[1].matches("[+\\-*/]")) ) {
            throw new Exception("Неверное арифметическое выражение");
        }
        if( tokens[0].matches("1|2|3|4|5|6|7|8|9|10") && tokens[2].matches("1|2|3|4|5|6|7|8|9|10")  ) {
            return new ArabicCalculator(tokens[0],tokens[2],tokens[1]);
        }
        if( tokens[0].matches("I|II|III|IV|V|VI|VII|VIII|IX|X") && tokens[2].matches("I|II|III|IV|V|VI|VII|VIII|IX|X") ) {
            return new RomeCalculator(tokens[0],tokens[2],tokens[1]);
        }
        throw new Exception("Неверное арифметическое выражение");
    }
}