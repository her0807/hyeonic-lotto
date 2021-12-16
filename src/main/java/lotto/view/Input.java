package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.model.user.BuyNumber;
import lotto.model.user.UserMoney;
import lotto.util.Message;

public class Input {

    private Input() {
    }

    public static BuyNumber buyNumber() {
        try {
            Output.message(Message.INPUT_GUIDE_BUY_NUMBER);
            return new BuyNumber(Console.readLine());

        } catch (IllegalArgumentException e) {
            Output.errorMessage(e.getMessage());
            return buyNumber();
        }
    }

    public static UserMoney userMoney(BuyNumber number) {
        try {
            Output.message(String.format(Message.INPUT_GUIDE_USER_MONEY, number.toStringPrice()));
            return new UserMoney(Console.readLine(), number);
        } catch (IllegalArgumentException e) {
            Output.errorMessage(e.getMessage());
            return userMoney(number);
        }
    }
}
