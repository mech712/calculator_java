import java.util.Map;
import java.util.HashMap;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class RomeCalculator implements Calculator{
    private final Evaluator evaluator;

    public RomeCalculator(String a,String b,String op){
        var operand1 = RomeUtils.romeToInt(a);
        var operand2 = RomeUtils.romeToInt(b);
        this.evaluator =  new BasicEvaluator(operand1, operand2, op);
    }

    @Override
    public String calculate() throws Exception{
        var res = this.evaluator.eval();
        if(res <= 0){
            throw new Exception("В римской системе нет отрицательных чисел");
        }
        return RomeUtils.IntToRome(res);
    }

    static class RomeUtils{
        private static final Object[][] rome_arabic_arr = new Object[][] {
                { "I", 1 },
                { "II", 2 },
                { "III", 3 },
                { "IV", 4 },
                { "V", 5 },
                { "VI", 6 },
                { "VII", 7 },
                { "VIII", 8 },
                { "IX", 9 },
                { "X", 10 },
                { "XI", 11 },
                { "XII", 12 },
                { "XIII", 13 },
                { "XIV", 14 },
                { "XV", 15 },
                { "XVI", 16 },
                { "XVII", 17 },
                { "XVIII", 18 },
                { "XIX", 19 },
                { "XX", 20 },
        };
        private static final Map<String, Integer> toIntMap = Stream.of(rome_arabic_arr).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));
        private static final Map<Integer, String> toRomeMap = Stream.of(rome_arabic_arr).collect(Collectors.toMap(data -> (Integer) data[1], data -> (String) data[0]));
        public static int romeToInt(String num){
            return toIntMap.get(num);
        }
        public static String IntToRome(int num){
            return toRomeMap.get(num);
        }
    }
}
