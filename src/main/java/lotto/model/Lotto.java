package lotto.model;

import java.util.List;

import lotto.model.autoLotto.LottoNumber;

public class Lotto {
    private final List<LottoNumber> lotto;

    public Lotto(List<LottoNumber> lotto) {
        this.lotto = lotto;
    }

    public int calculateJackpot(LuckNumbers luckNumbers) {
        return luckNumbers.askJackpot(lotto);
    }
}
