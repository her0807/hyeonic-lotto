package lotto.util;

public class Message {

    public static final String NEXT_LINE = "\n";
    public static final String BUY_NUMBER = "구매 개수: %s";
    public static final String BUY_PRICE = "구매 금액: %d";
    public static final String FINAL_RANK = "최대 당첨 등수: %d등";
    public static final String FINAL_MONEY = "총 당첨 금액: %d";
    public static final String FINAL_RATE = "수익률: %.2f";
    public static final String FINAL_GUIDE = "당신의 수익률은 아래와 같습니다.";
    public static final String GUIDE_LUCK_NUMBERS = "금주의 당첨 번호는 %s 입니다.";
    public static final String INPUT_GUIDE_BUY_NUMBER = "구매할 로또의 개수를 입력해주세요.";
    public static final String INPUT_GUIDE_USER_MONEY = "구입 금액은 %s 입니다. 구입 금액을 입력해주세요.";
    public static final String ERROR = "[ERROR]";
    public static final String NOT_JACKPOT_MAX_ERROR = "최대 당첨금액을 찾을 수 없습니다. ";
    public static final String NOT_JACKPOT_ERROR = "로또에 당첨되지 않았습니다. ";
    public static final String BUY_NUMBER_STRING_ERROR = "구입 갯수는 숫자여야 합니다. ";
    public static final String BUY_NUMBER_RANGE_ERROR = "구입 갯수는 1개 이상, 100개 이하 여야 합니다. ";
    public static final String USER_MONEY_STRING_ERROR = "구입 금액은 숫자여야 합니다. ";
    public static final String USER_MONEY_RANGE_ERROR = "구입 금액은 구매 갯수 X 1000원 이상이어야 합니다.";

    private Message() {
    }
}
