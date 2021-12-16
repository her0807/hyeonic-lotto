package lotto.model.autoLotto;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import java.util.Set;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.util.Constant;

public class AutoLottoProduction {

    public List<LottoNumber> createAutoLotto() {
        List<LottoNumber> lotto = new LinkedList<>();

        for (int number : createRandomLottoNumbers()) {
            lotto.add(new LottoNumber(number));
        }
        return lotto;
    }

    public Set<Integer> createRandomLottoNumbers() {
        Set<Integer> lotto = new HashSet();

        while (lotto.size() < Constant.LOTTO_COUNT) {
            lotto.add(Randoms.pickNumberInRange(Constant.LOTTO_START_RANGE, Constant.LOTTO_END_RANGE));
        }
        return lotto;
    }
}
