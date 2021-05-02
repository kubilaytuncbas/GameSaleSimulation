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
			
			System.out.println(user.getFirstName()+" �simli Kullan�c� Eklenmi�tir.");
		}
		else 
		{
			System.out.println("Kullan�c� do�rulanamam��t�r!!");
		}
		
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+" �simli Kullan�c� Silinmi�tir.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+" �simli Kullan�c� G�ncellenmi�tir.");
		
	}

	
	

}
