package Managers;

import Entities.User;
import Interfaces.PersonVerification;
import Interfaces.UserService;

public class UserManager  implements UserService {

	PersonVerification personVerification;
	public UserManager(PersonVerification personVerification) {
		this.personVerification = personVerification;
	}

	@Override
	public void add(User user) {
		if (personVerification.CheckIfRealPerson(user)==true) {
			
			System.out.println(user.getFirstName()+" İsimli Kullanıcı Eklenmiştir.");
		}
		else 
		{
			System.out.println("Kullanıcı doğrulanamamıştır!!");
		}
		
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+" İsimli Kullanıcı Silinmiştir.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+" İsimli Kullanıcı Güncellenmiştir.");
		
	}

	
	

}
