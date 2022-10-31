package bd.operations;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalOperations {
    //#1 - BigDecimal
    public static double doubleBD (BigDecimal bigdecimal){
        MathContext m = new MathContext(4);
        double result = bigdecimal.multiply(bigdecimal, m).doubleValue();
        return result;
    }
    //#2 - BigDecimal
    public static BigDecimal reverseBD (BigDecimal bigdecimal){
        int comparator = bigdecimal.intValue();
        BigDecimal minusOne = new BigDecimal("-1");

        if (comparator == 0 ){
            return bigdecimal;
        } else if (comparator > 0) {
            //number is positive, translate to negative
            return bigdecimal.multiply(minusOne).setScale(1, RoundingMode.HALF_UP);
        } else {
            //number is negative, translate to positive
            return bigdecimal.multiply(minusOne).setScale(1, RoundingMode.HALF_UP);
        }
    }
}
