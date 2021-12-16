package lotto.model;

public enum PrizeMoney {
    FIRST(5000000, 6),
    SECOND(500000, 5),
    THIRD(50000, 4),
    FOUR(5000, 3);

    private final int money;
    private final int setNumber;

    PrizeMoney(int money, int setNumber) {
        this.money = money;
        this.setNumber = setNumber;
    }

    public int getMoney() {
        return money;
    }

}
