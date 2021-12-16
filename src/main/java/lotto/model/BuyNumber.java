package lotto.model;

import lotto.util.Constant;
import lotto.util.Message;

public class BuyNumber {
    private final int number;

    public BuyNumber(String number) {
        validNumber(number);
        this.number = toInt(number);
    }

    public int toPrice() {
        return this.number * Constant.LOTTO_PRICE;
    }

    public boolean isOver(int target) {
        return number < target;
    }

    private void validNumber(String number) {
        if (!isNumeric(number)) {
            throw new IllegalArgumentException(Message.BUY_NUMBER_STRING_ERROR);
        }
        if (!isRangeValid(toInt(number))) {
            throw new IllegalArgumentException(Message.BUY_NUMBER_RANGE_ERROR);
        }
    }

    private boolean isNumeric(String number) {
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private boolean isRangeValid(int number) {
        return number > Constant.LOTTO_MIN_RANGE && number <= Constant.LOTTO_MAX_RANGE;
    }

    private int toInt(String number) {
        return Integer.parseInt(number);
    }
}
