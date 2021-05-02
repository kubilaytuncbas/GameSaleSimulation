package Managers;
import Entities.Campaign;
import Entities.Sale;
import Entities.User;
import Interfaces.SaleService;

public class SaleManager implements SaleService {
	
	Campaign campaign;
	User user;

	public SaleManager(User user,Campaign campaign) {
		this.user = user;
		this.campaign=campaign;
	}

	@Override
	public void add(Sale sale) {
		System.out.println(user.getFirstName()+" adl� ki�iye fatura kesilmi�tir "+campaign.campaignName+"uygulanm��t�r");
		
	}

	@Override
	public void delete(Sale sale) {
		System.out.println(user.getFirstName()+" adl� ki�inin faturas� silinmi�tir");
		
	}

	@Override
	public void update(Sale sale) {
		System.out.println(user.getFirstName()+" adl� ki�inin iade i�lemi yap�lm��t�r.");
		
	}

}
