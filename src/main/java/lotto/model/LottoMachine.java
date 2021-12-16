package lotto.model;

import java.util.LinkedList;
import java.util.List;

import lotto.model.autoLotto.AutoLottoProduction;
import lotto.model.autoLotto.LuckNumbers;
import lotto.model.user.BuyNumber;
import lotto.model.user.Lotto;
import lotto.model.user.UserLotto;
import lotto.util.Constant;

public class LottoMachine {
    private final AutoLottoProduction lottoGenerator;

    public LottoMachine(AutoLottoProduction lottoGenerator) {
        this.lottoGenerator = lottoGenerator;
    }

    public LuckNumbers generateLuckNumbers() {
        return new LuckNumbers(lottoGenerator.createAutoLotto());
    }

    public UserLotto generateUserLotto(BuyNumber buyNumber) {
        List<Lotto> lotto = new LinkedList<>();
        int count = Constant.EMPTY;
        while (!buyNumber.isOver(count++)) {
            lotto.add(new Lotto(lottoGenerator.createAutoLotto()));
        }
        return new UserLotto(lotto);
    }
}
