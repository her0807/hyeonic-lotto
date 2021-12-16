package lotto.model;

import java.util.List;

import lotto.model.autoLotto.AutoLottoProduction;
import lotto.model.autoLotto.Jackpot;
import lotto.model.autoLotto.LottoNumber;
import lotto.util.Constant;

public class LuckNumbers {
    private final List<LottoNumber> luckNumbers;

    public LuckNumbers(AutoLottoProduction generateLotto) {
        this.luckNumbers = generateLotto.createAutoLotto();
    }

    public int askJackpot(List<LottoNumber> lotto) {
        int count = Constant.LOTTO_MIN_RANGE;
        for (LottoNumber number : lotto) {
            if (isJackpot(number)) {
                count++;
            }
        }
        if (count > Constant.LOTTO_JACKPOT_MIN_VALUE)
            return Jackpot.getMoney(count);
        return Constant.LOTTO_MIN_RANGE;
    }

    private boolean isJackpot(LottoNumber lottoNumber) {
        return luckNumbers.stream()
            .anyMatch(luckNumbers -> lottoNumber.isSameNumber(luckNumbers.getNumber()));
    }
}
