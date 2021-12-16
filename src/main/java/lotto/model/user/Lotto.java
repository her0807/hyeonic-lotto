package lotto.model.user;

import java.util.Collections;
import java.util.List;

import lotto.model.autoLotto.LottoNumber;

public class Lotto {
    private final List<LottoNumber> lotto;

    public Lotto(List<LottoNumber> lotto) {
        this.lotto = lotto;
    }

    public int calculateMatchCount(Lotto winningNumbers) {
        long count = winningNumbers.lotto.stream()
            .filter(lotto::contains)
            .count();
        System.out.println("여기 둘어오니"+count);
        return Long.valueOf(count).intValue();
    }

    public List<LottoNumber> getLottoNumbers() {
        return Collections.unmodifiableList(lotto);
    }

    @Override
    public String toString() {
        return String.join(",", lotto.toString());
    }
}
