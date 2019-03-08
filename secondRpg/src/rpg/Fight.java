package rpg;

import java.util.Random;

public class Fight extends Character {
	public Fight(String[] args) {
		super(args);
	}

	static double monsterLVL = 0;
	static Random rand = new Random();	
	public static void main(int manyBattles) throws InterruptedException {
		for (int ll = 0; ll<manyBattles; ll++){
			battle();
		}
	}


	static void battle () throws InterruptedException{
		Monster oponent = createMonster();
		int thisHeroHP = Character.heroHP;
		int licznik =0;
		do {int thisAttack = Fight.attack();
			if (thisAttack>oponent.monsterDEF)
			oponent.monsterHP= (oponent.monsterHP) + (oponent.monsterDEF - Fight.attack());
			thisHeroHP = thisHeroHP - oponent.monsterATT ;
			System.out.println("thisHeroHP: "+thisHeroHP +" thisHeroHP: "+ thisHeroHP +" oponent.monsterATT: "+ oponent.monsterATT);
			System.out.println(thisAttack);
			System.out.println(thisHeroHP);
			System.out.println(oponent.monsterHP);
			//Thread.sleep(1000);
			//if (licznik>100) break;
		}while(oponent.monsterHP>=0 && thisHeroHP>=0);
		if (thisHeroHP<=0) {
			System.out.println("I think you died, maybe not all, but now yes, you are dead");
		}
		else if (oponent.monsterHP<=0) {
			getEXP ((int) oponent.monsterEXP); 
			getGold();
			System.out.println("You have won and get " + oponent.monsterEXP + " EXP from monster.");
		}
		else System.out.println("Co sie do cholery jasnej niby stalo?");
		
	}
	public static Monster createMonster(){
		Monster monsterek = Monster.getRandomMonster();
		System.out.println("You meet " + monsterek);
		monsterek.monsterATT = (int) ((int) monsterek.monsterATT * Math.pow(1.3,monsterLVL));
		monsterek.monsterDEF= (int) ((int) monsterek.monsterDEF * Math.pow(1.3,monsterLVL));
		monsterek.monsterEXP= (int) ((int) monsterek.monsterEXP * Math.pow(1.3,monsterLVL));
		monsterek.monsterHP= (int) ((int) monsterek.monsterHP * Math.pow(1.3,monsterLVL));
		return(monsterek);
	}
	
	/*public void monster (double monsterHP, double monsterAttack, double monsterDef, int difficulty){
		
	if (difficulty == 0) monsterLVL = heroLVL;
		else if (difficulty == 1) monsterLVL = heroLVL +1;
		else if (difficulty == 2) monsterLVL = heroLVL +2;
		else if (difficulty == 3) monsterLVL = heroLVL+4;
		monsterHP = monsterHP * monsterLVL;
		monsterAttack = monsterAttack * monsterLVL;
		monsterDef = monsterDef * monsterLVL;
		
	}*/
	
	public static int attack () {
		int attack = 0;
		double h = rand.nextDouble();
		double luck;
		if (h<heroL/10) luck =(5+(2*h));  //critical attack
		else luck = 5;
		if (heroClaass == Claass.knight || heroClaass == Claass.viking)
			attack = (int) ((double)heroS*luck);
			else if (heroClaass == Claass.mage)
			attack = (int) ((double)heroI*luck);
			else if (heroClaass == Claass.ranger)
			attack = (int) ((double)heroA*luck);
		return attack;
	}
	
}
