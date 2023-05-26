package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        float decimalPart = numberToBeRounded - (int) numberToBeRounded;
        int result = 0;
        if (decimalPart < 0.5) {
            result = (int) numberToBeRounded;
        } else if (decimalPart >= 0.5) {
            result = (int) numberToBeRounded + 1;
        }
        System.out.println(result);
    }
}
