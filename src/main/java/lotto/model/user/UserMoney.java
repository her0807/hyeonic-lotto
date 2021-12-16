package lotto.model.user;

import lotto.util.Constant;
import lotto.util.Message;

public class UserMoney {
    private final int money;

    public UserMoney(String money, BuyNumber buyNumber) {
        validMoney(money, buyNumber);
        this.money = toInt(money);
    }

    private void validMoney(String money, BuyNumber buyNumber) {
        if (!isNumeric(money)) {
            throw new IllegalArgumentException(Message.USER_MONEY_STRING_ERROR);
        }
        if (!isRangeValid(toInt(money), buyNumber)) {
            throw new IllegalArgumentException(Message.USER_MONEY_RANGE_ERROR);
        }
    }

    private boolean isNumeric(String money) {
        try {
            Integer.parseInt(money);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private boolean isRangeValid(int money, BuyNumber buyNumber) {
        return money > Constant.LOTTO_MIN_RANGE && money >= buyNumber.toPrice();
    }

    private int toInt(String number) {
        return Integer.parseInt(number);
    }
}
