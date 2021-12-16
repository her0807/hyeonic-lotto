package lotto.model.autoLotto;

import java.util.Arrays;

import lotto.util.Message;

public enum Jackpot {
    FIRST(5000000, 6),
    SECOND(500000, 5),
    THIRD(50000, 4),
    FOUR(5000, 3);

    private final int money;
    private final int rank;

    Jackpot(int money, int rank) {
        this.money = money;
        this.rank = rank;
    }

    public static int getMoney(int rank) {
        return Arrays.stream(values())
            .filter(jackpot -> jackpot.rank == rank)
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException(Message.NOT_JACKPOT_ERROR)).money;
    }

    public int getMoney() {
        return money;
    }
}
