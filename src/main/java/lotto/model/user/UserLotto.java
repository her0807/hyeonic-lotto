package lotto.model.user;

import java.util.LinkedList;
import java.util.List;

import lotto.model.autoLotto.AutoLottoProduction;
import lotto.model.autoLotto.LuckNumbers;
import lotto.util.Constant;

public class UserLotto {
    private List<Lotto> lotto = new LinkedList<>();

    public UserLotto(BuyNumber buyNumber, AutoLottoProduction autoLottoProduction) {
        int count = Constant.EMPTY;
        while (buyNumber.isOver(count++)) {
            lotto.add(new Lotto(autoLottoProduction.createAutoLotto()));
        }
    }

    public int totalJackpotMoney(LuckNumbers luckNumbers) {
        return lotto
            .stream()
            .map(lotto -> lotto.calculateJackpot(luckNumbers))
            .mapToInt(i -> i)
            .sum();
    }
}
