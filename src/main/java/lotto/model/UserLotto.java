package lotto.model;

import java.util.LinkedList;
import java.util.List;

import lotto.model.autoLotto.AutoLottoProduction;
import lotto.util.Constant;

public class UserLotto {
    private List<Lotto> lotto = new LinkedList<>();

    public UserLotto(BuyNumber buyNumber, AutoLottoProduction autoLottoProduction) {
        int count = Constant.EMPTY;
        while (buyNumber.isOver(count++)) {
            lotto.add(new Lotto(autoLottoProduction.createAutoLotto()));
        }
    }
}
