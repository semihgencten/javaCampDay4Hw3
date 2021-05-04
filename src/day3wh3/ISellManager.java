package day3wh3;

public interface ISellManager {
	public void sellWithoutCampaign(User user, Game game);
	public void sellMultipleGame(User user , Game[] games);
	public void sellWithCampaign(User user, Game game, Campaign campaign);
}
