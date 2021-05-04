package day3wh3;

public interface ICampaignManager {
	public void addCampaign(Campaign campaign);
	public void deleteCampaign(Campaign campaign);
	public void updateCampaign(Campaign campaign);
	
	public void applyCampaign(Game game, Campaign campaign);
	public void endCampaign(Game game, Campaign campaign);
}
