package chapter05;

class BaseballPlayer{
    String name;
    double battingAverage;
    int homeRuns;
    static int playCount;

    public BaseballPlayer(String name, double battingAverage, int homeRuns) {
        this.name = name;
        this.battingAverage = battingAverage;
        this.homeRuns = homeRuns;

        playCount++;
    }


    //인스턴스 메서드
    void updateStatus(double newBattingAverage, int newHomeruns){
        battingAverage = newBattingAverage;
        homeRuns = newHomeruns;

    }

    //정적 메서드
    //-->특정 홈런 수 이상인 선수를 평가하다
    static String evaluateHomeRun(int homeRunCount){
        if(homeRunCount>20){
            return "홈런상 후보에 등록됩니다";
        }else{
            return "후보 등록에 실패하였습니다";
        }
    }


}

public class E_practice {
    public static void main(String[] args) {
        BaseballPlayer player1 = new BaseballPlayer("a",0.325,16);
        BaseballPlayer player2 = new BaseballPlayer("b",0.293,20);
        BaseballPlayer player3 = new BaseballPlayer("c",0.301,11);
        BaseballPlayer player4 = new BaseballPlayer("d",0.292,21);

        System.out.println("생성된 선수의 수"+BaseballPlayer.playCount);

        player2.updateStatus(0.312,22);
        System.out.println(player2.battingAverage);
        System.out.println(player2.homeRuns);

        System.out.println(BaseballPlayer.evaluateHomeRun(player3.homeRuns));
        System.out.println(BaseballPlayer.evaluateHomeRun(player4.homeRuns));


    }
}
