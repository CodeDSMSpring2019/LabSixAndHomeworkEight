package edu.dmacc.codedsm.labsixhw8;

public class LoopValidator {

    public static final int GUARD_ONE = 10;
    public static final int GUARD_TWO = 33;

    public static void main(String[] args) {
        int[] values = new int[50];
        int[] matches = new int[50];

        for (int i = 0; i < values.length; i++) {
            values[i] = i;
        }

        int numberOfMatches = 0;
        for (int j = 0; j < values.length; j++) {
            if (outputIfTrue(values[j], GUARD_ONE) && outputIfTrue(values[j] + 1, GUARD_TWO)) {
                System.out.println("Inputs were good!");
                matches[numberOfMatches] = values[j];
                numberOfMatches++;
            }
        }

        int sum = 0;
        for (int k = 0; k < matches.length; k++) {
            sum = sum + matches[k];
        }
        System.out.println("sum = " + sum);
    }

    public static boolean outputIfTrue(int x, int y) {
        boolean meetsCondition = x > y;
        if (meetsCondition) {
            System.out.println("TRUTH! x = [" + x + "], y = [" + y + "]");
        } else {
            System.out.println("FALSEY! x = [" + x + "], y = [" + y + "]");
        }
        return meetsCondition;
    }
}
