package lotto.view;

import lotto.model.autoLotto.LuckNumbers;
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

    public static void result(String number, int money, int rank, int total, double rate) {
        StringBuilder sb = new StringBuilder();
        sb.append(Message.FINAL_GUIDE).append(Message.NEXT_LINE);
        sb.append(String.format(Message.BUY_NUMBER, number)).append(Message.NEXT_LINE);
        sb.append(String.format(Message.BUY_PRICE, money)).append(Message.NEXT_LINE);
        sb.append(String.format(Message.FINAL_RANK, rank)).append(Message.NEXT_LINE);
        sb.append(String.format(Message.FINAL_MONEY, total)).append(Message.NEXT_LINE);
        sb.append(String.format(Message.FINAL_RATE, rate));
        System.out.println(sb);
    }
}
