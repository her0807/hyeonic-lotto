package lotto.model.autoLotto;

public class LottoNumber {
    private final int number;

    public LottoNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public boolean isSameNumber(int number) {
        return this.number == number;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}
