package day3wh3;

public class SellManager implements ISellManager{

	private ICampaignManager campaignManager;
	
	public SellManager(ICampaignManager campaignManager) {
		super();
		this.campaignManager = campaignManager;
	}

	@Override
	public void sellWithoutCampaign(User user, Game game) {
		
		
		System.out.println("Sold "+ game.getNameOfGame() +" to "+user.getFirstName());
		
	}

	@Override
	public void sellMultipleGame(User user, Game[] games) {
		System.out.println("Sold some games to "+user.getFirstName());
		
	}

	@Override
	public void sellWithCampaign(User user, Game game, Campaign campaign) {
		
		campaignManager.applyCampaign(game, campaign);
		System.out.println("Sold "+ game.getNameOfGame() +" to "+user.getFirstName()+" for: "+game.getUnitPrice()+" with discount: "+campaign.getDiscountPercantage()+" percent");
	}
	
}
