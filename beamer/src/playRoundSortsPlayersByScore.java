@Test
public void playRoundSortsPlayersByScore() throws Exception {
    GameMaster master = generateGameMaster();
    PlayerScoreComparator comparator = new PlayerScoreComparator(21);
    master.playRound(21);

    assertThat(master.getPlayers())
        .isSortedAccordingTo(comparator);
}
