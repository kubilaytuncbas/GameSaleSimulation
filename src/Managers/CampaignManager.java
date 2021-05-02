package Managers;

import Entities.Campaign;
import Interfaces.CampaignService;

public class CampaignManager implements CampaignService {
	
	public void add() {
		
	}
	

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.campaignName+" Adl� Kampanya Eklenmi�tir");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.campaignName+" Adl� Kampanya Silinmi�tir");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.campaignName+" Adl� Kampanya G�ncellenmi�tir");
		
	}

}
