package lotto.model.user;

import java.util.List;
import java.util.stream.Collectors;

import lotto.model.autoLotto.Jackpot;
import lotto.model.autoLotto.LuckNumbers;

public class UserLotto {
    private final List<Lotto> lotto;

    public UserLotto(List<Lotto> lotto) {
        this.lotto = lotto;
    }

    public List<Jackpot> createCount(LuckNumbers luckNumbers) {
        return lotto.stream().
            map(luckNumbers::getMatchCount)
            .map(Jackpot::getRank)
            .collect(Collectors.toList());
    }

}
