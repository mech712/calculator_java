public class BasicEvaluator implements Evaluator {

    private final int operand1;
    private final int operand2;
    private final String operator;

    public BasicEvaluator(int a, int b, String operator){
        this.operand1 = a;
        this.operand2 = b;
        this.operator = operator;
    }

    public int eval(){
        return switch (operator) {
            case "+" -> operand1 + operand2;
            case "-" -> operand1 - operand2;
            case "*" -> operand1 * operand2;
            case "/" -> operand1 / operand2;
            default -> -11111;
        };
    }
}