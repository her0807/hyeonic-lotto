package lotto.model.user;

import java.util.List;

import lotto.model.autoLotto.Jackpot;

public class LottoResult {

    private static final int PERCENT = 100;

    private final BuyNumber buyNumber;
    private final UserMoney money;
    private final List<Jackpot> ranks;

    public LottoResult(BuyNumber buyNumber, UserMoney money, List<Jackpot> ranks) {
        this.buyNumber = buyNumber;
        this.money = money;
        this.ranks = ranks;
    }

    public double yield() {
        return (double)total() / money.getMoney() * PERCENT;
    }

    public int total() {
        return ranks.stream()
            .mapToInt(Jackpot::getMoney)
            .sum();
    }

    public Jackpot maxRank() {
        Jackpot maxRank = Jackpot.SEVEN;
        int maxReward = 0;
        for (Jackpot rank : ranks) {
            if (maxReward < rank.getMoney()) {
                maxRank = rank;
                maxReward = rank.getMoney();
            }
        }
        return maxRank;
    }
}
