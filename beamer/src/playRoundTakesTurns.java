@Test
public void playRoundTakesTurns() throws Exception {
    GameMaster master = generateGameMaster();
    master.playRound(21);

    for (Player player : master.getPlayers()) {
        assertThat(player.getScore()).isGreaterThan(0);
    }
}
