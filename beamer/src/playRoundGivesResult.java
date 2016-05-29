@Test
public void playRoundGivesResult() throws Exception {
    GameMaster master = generateGameMaster();
    Result actualResult = master.playRound(21),
          expectedResult = new Result(21, master.getPlayers());

    assertThat(actualResult).isEqualTo(expectedResult);
}
