@org.junit.Test
public void testPlayRound() throws Exception {
    GameMaster master = new GameMaster(new Dice(6), new Class<?>[] { BalancedPlayer.class });

    for (int i = 0; i < 20; i++) {
        Result result = master.playRound(21);

        if (result.isTie()) {
            assertThat(result.getWinners()).hasSize(2);
        } else {
            assertThat(result.getWinners()).hasSize(1);
        }
    }
}
