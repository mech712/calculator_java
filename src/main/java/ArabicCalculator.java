public class ArabicCalculator implements Calculator{
    private final Evaluator evaluator;

    public ArabicCalculator(String a,String b,String op){
        var operand1 = Integer.parseInt(a);
        var operand2 = Integer.parseInt(b);
        this.evaluator =  new BasicEvaluator(operand1, operand2, op);
    }

    @Override
    public String calculate() {
        return Integer.toString(this.evaluator.eval());
    }
}
