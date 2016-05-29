/**
 * Starts one round in which every player gets one turn and
 * determines the winner.
 * @param goalScore score the players have to get close to
 * @return outcome of the round (may be a tie)
 */
 public Result playRound(int goalScore) {
   // Every player gets one turn
   for (Player player : this.players) {
       player.resetScore();
       player.play(this.dice, goalScore);
   }

   // Sorting the players by their score
   this.players.sort(new PlayerScoreComparator(goalScore));

   // Determine the result and return it
   return new Result(goalScore, this.players);
}
