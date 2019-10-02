public class TennisGame {

    public static final String MINUS = "-";

    public static String getScore(String firstPlayerName, String SecondPlayerName, int firstScore, int secondScore) {
        String score = "";
        int tempScore = 0;
        boolean isFirstScoreEqualSecondScore = firstScore == secondScore;
        if (isFirstScoreEqualSecondScore) {
            switch (firstScore) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else {
            boolean isFirstScoreEqualOrBigger4 = firstScore >= 4;
            boolean isSecondScoreEqualOrBigger4 = secondScore >= 4;
            if (isFirstScoreEqualOrBigger4 || isSecondScoreEqualOrBigger4) {
                int minusResult = firstScore - secondScore;
                boolean isMinusResultEqual1 = minusResult == 1;
                boolean isMinusResultEqualMinus1 = minusResult == -1;
                boolean isMinusResultBiggerOrEqual2 = minusResult >= 2;
                if (isMinusResultEqual1) score = "Advantage player1";
                else {

                    if (isMinusResultEqualMinus1) score = "Advantage player2";
                    else {

                        if (isMinusResultBiggerOrEqual2) score = "Win for player1";
                        else score = "Win for player2";
                    }
                }
            } else {
                for (int i = 1; i < 3; i++) {
                    if (i == 1) tempScore = firstScore;
                    else {
                        score += MINUS;
                        tempScore = secondScore;
                    }
                    switch (tempScore) {
                        case 0:
                            score += "Love";
                            break;
                        case 1:
                            score += "Fifteen";
                            break;
                        case 2:
                            score += "Thirty";
                            break;
                        case 3:
                            score += "Forty";
                            break;
                    }
                }
            }
        }
        return score;
    }
}