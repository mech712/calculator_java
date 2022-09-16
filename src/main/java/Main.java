public class Main {
    public static String calc(String input) throws Exception{
        var parser = new Parser(input);
        var calculator = parser.parse();
        return calculator.calculate();
    }
}