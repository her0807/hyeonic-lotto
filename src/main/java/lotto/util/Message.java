package lotto.util;

public class Message {
    public static final String NOT_JACKPOT_ERROR = "[ERROR] 로또에 당첨되지 않았습니다. ";
    public static final String BUY_NUMBER_STRING_ERROR = "[ERROR] 구입 갯수는 숫자여야 합니다. ";
    public static final String BUY_NUMBER_RANGE_ERROR = "[ERROR] 구입 갯수는 1개 이상, 100개 이하 여야 합니다. ";
    public static final String USER_MONEY_STRING_ERROR = "[ERROR] 구입 금액은 숫자여야 합니다. ";
    public static final String USER_MONEY_RANGE_ERROR = "[ERROR] 구입 금액은 구매 갯수 X 1000원 이상이어야 합니다.";

    private Message() {
    }
}
