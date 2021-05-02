package Managers;

import Entities.Game;
import Interfaces.GameService;

public class GameManager implements GameService {


	@Override
	public void add(Game game) {
		System.out.println(game.gameName+" �simli Oyununuz eklendi");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.gameName+" �simli Oyununuz silindi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.gameName+" �simli Oyununuz g�ncellendi");
		
	}

}
