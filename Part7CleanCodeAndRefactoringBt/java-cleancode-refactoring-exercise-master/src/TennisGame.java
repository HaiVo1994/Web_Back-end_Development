public class TennisGame {

    public static final int scoreZero = 0;
    public static final int scoreOne = 1;
    public static final int scoreTwo = 2;
    public static final int scoreThree = 3;

    public static String getScore(String firstPlayerName, String secondPlayerName, int firstPlayerScore, int secondPlayerScore) {
        String score = "";
        int tempScore = scoreZero;
        if (firstPlayerScore == secondPlayerScore) {
            score = getScore(firstPlayerScore);
        } else if (firstPlayerScore >= 4 || secondPlayerScore >= 4) {
            int minusResult = firstPlayerScore - secondPlayerScore;
            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult == -1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            else score = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = firstPlayerScore;
                else {
                    score += "-";
                    tempScore = secondPlayerScore;
                }
                score += getScoreDifferent(tempScore);
            }
        }
        return score;
    }

    private static String getScore(int firstPlayerScore) {
        String score;
        switch (firstPlayerScore) {
            case scoreZero:
                score = "Love-All";
                break;
            case scoreOne:
                score = "Fifteen-All";
                break;
            case scoreTwo:
                score = "Thirty-All";
                break;
            case scoreThree:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
    private static String getScoreDifferent(int tempScore) {
        String score;
        switch (tempScore) {
            case scoreZero:
                score = "Love";
                break;
            case scoreOne:
                score = "Fifteen";
                break;
            case scoreTwo:
                score = "Thirty";
                break;
            case scoreThree:
                score = "Forty";
                break;
            default:
                score = "";
        }
        return score;
    }
}
