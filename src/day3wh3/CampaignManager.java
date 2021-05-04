package day3wh3;

public class CampaignManager implements ICampaignManager {

	@Override
	public void applyCampaign(Game game, Campaign campaign) {
		game.setUnitPrice(game.getUnitPrice()-(game.getUnitPrice()*(campaign.getDiscountPercantage()/100)));
		
		System.out.println("Campaign: "+campaign.getCampaignName()+" applied for: "+game.getNameOfGame());
		
	}

	@Override
	public void endCampaign(Game game, Campaign campaign) {
		System.out.println("Campaign: "+campaign.getCampaignName()+"ended for: "+game.getNameOfGame());
		
	}

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("Campaign added: "+campaign.getCampaignName());
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Campaign deleted: "+campaign.getCampaignName());
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println("Campaign updated: "+campaign.getCampaignName());
	}

}
