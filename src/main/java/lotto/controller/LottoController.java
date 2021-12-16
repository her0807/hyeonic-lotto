package lotto.controller;

import java.util.List;

import lotto.model.LottoMachine;
import lotto.model.autoLotto.AutoLottoProduction;
import lotto.model.autoLotto.Jackpot;
import lotto.model.autoLotto.LuckNumbers;
import lotto.model.user.BuyNumber;
import lotto.model.user.LottoResult;
import lotto.model.user.UserLotto;
import lotto.model.user.UserMoney;
import lotto.view.Input;
import lotto.view.Output;

public class LottoController {
    private final LottoMachine machine;

    public LottoController(AutoLottoProduction autoLottoProduction) {
        this.machine = new LottoMachine(autoLottoProduction);
    }

    public void start() {
        BuyNumber buyNumber = Input.buyNumber();
        UserMoney money = Input.userMoney(buyNumber);
        UserLotto userLotto = machine.generateUserLotto(buyNumber);
        LuckNumbers luckNumbers = machine.generateLuckNumbers();
        Output.luckNumbers(luckNumbers);
        List<Jackpot> ranks = userLotto.createCount(luckNumbers);
        printResult(buyNumber, money, ranks);

    }

    private void printResult(BuyNumber buyNumber, UserMoney money, List<Jackpot> ranks) {
        LottoResult lottoResult = new LottoResult(buyNumber, money, ranks);

        Output.result(buyNumber.toString(), buyNumber.toPrice(), lottoResult.maxRank().getName(), lottoResult.total(),
            lottoResult.yield());

    }
}
