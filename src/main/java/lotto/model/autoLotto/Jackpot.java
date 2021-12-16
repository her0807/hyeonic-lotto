package lotto.model.autoLotto;

import java.util.Arrays;

import lotto.util.Message;

public enum Jackpot {
    FIRST(1,5000000, 6),
    SECOND(2,500000, 5),
    THIRD(3,50000, 4),
    FOUR(4,5000, 3),
    FIVE(5,0, 2),
    SIX(6,0, 1),
    SEVEN(7,0, 0);

    private final int name;
    private final int money;
    private final int rank;

    Jackpot(int name,int money, int rank) {
        this.name = name;
        this.money = money;
        this.rank = rank;
    }

    public int getMoney() {
        return money;
    }

    public int getRank() {
        return rank;
    }

    public int getName() {
        return name;
    }

    public static Jackpot getRank(int target) {
        return Arrays.stream(Jackpot.values())
            .filter(jackpot -> jackpot.rank == target)
            .findFirst()
            .orElse(SEVEN);
    }
}
