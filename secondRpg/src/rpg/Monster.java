package rpg;

import java.util.Random;

public enum Monster {
	skeletonKnight(50, 20, 6, 10),
	skeletonRanger(25, 32, 3, 10),
	skeletonMage(15, 60, 2, 20),
	zombie(80, 12, 6, 15),
	dryad(100, 28, 7, 20),
	wywern(50, 20, 8, 20),
	dragon(200, 40, 10, 100),
	litch(70, 40, 5, 18),
	rabbit(5, 1, 1, 5);
	
	int monsterHP;
	int monsterATT;
	int monsterDEF;
	double monsterEXP;
	
	private Monster(int monsterHP, int monsterATT, int monsterDEF, double monsterEXP){
		this.monsterHP = monsterHP;
		this.monsterATT= monsterATT;
		this.monsterDEF = monsterDEF;
		this.monsterEXP= monsterEXP;
		
	}
	
	public static Monster getRandomMonster() {
        Random randomm = new Random();
        return values()[randomm.nextInt(values().length)];
	}

}
