package day3wh3;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1,"Engin", "Demiroğ", 120);
		
		ICustomerCheckService customerCheckService=new CustomerCheckManager();
		BaseUserManager userManager=new BaseUserManager(customerCheckService);
		userManager.addUser(user1);
		
		
		Game game1=new Game(1, "CS:GO", 100);
		Campaign campaign1 = new Campaign(1, "Spring Campaign", 30);
		ICampaignManager campaignManager=new CampaignManager();
		campaignManager.addCampaign(campaign1);
		SellManager sellManager=new SellManager(campaignManager);
		sellManager.sellWithCampaign(user1, game1, campaign1);
		
		userManager.updateUser(user1);
		userManager.deleteUser(user1);
		
		campaignManager.updateCampaign(campaign1);
		campaignManager.deleteCampaign(campaign1);

	}

}
