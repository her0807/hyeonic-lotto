package lotto.model.autoLotto;

import java.util.List;

import lotto.model.user.Lotto;

public class LuckNumbers {
    private final Lotto winnerLotto;

    public LuckNumbers(List<LottoNumber> winningNumber) {
        this.winnerLotto = new Lotto(winningNumber);
    }

    public int getMatchCount(Lotto lottoTicket) {
        return lottoTicket.calculateMatchCount(winnerLotto);
    }
    @Override
    public String toString() {
        return String.join(",", winnerLotto.toString());
    }
}
