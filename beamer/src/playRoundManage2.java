public class GameMaster {
  public GameMaster(Dice dice, Class<?>[] types) { }
  public Result playRound(int goalScore) { }
  ...
}

public class GameMasterTest {
  public GameMasterTest() { }
  public void playRoundTakesTurns() throws Exception { }
  public void playRoundSortsPlayersByScore() throws Exception { }
  public void playRoundGivesResult() throws Exception { }
  ...
}
