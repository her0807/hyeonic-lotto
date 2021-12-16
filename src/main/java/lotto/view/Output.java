package lotto.view;

import lotto.model.LuckNumbers;
import lotto.util.Constant;
import lotto.util.Message;

public class Output {
    private Output() {
    }

    public static void message(String message) {
        System.out.println(message);
    }

    public static void errorMessage(String message) {
        System.out.println(String.format(Constant.ERROR_FORMAT, Message.ERROR, message));
    }

    public static void luckNumbers(LuckNumbers luckNumbers) {
        System.out.println(String.format(Message.GUIDE_LUCK_NUMBERS, luckNumbers));
    }
}
