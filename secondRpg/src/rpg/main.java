package rpg;

import java.nio.channels.ShutdownChannelGroupException;

public class main {

	public static void main(String[] args) {
		//views.StartMenu.main(args);
		Item myAxe = Item.commonAxeShield;
		System.out.println(myAxe);
		myAxe.raritys = Rarity.uncommon;
		System.out.println(myAxe);
		System.out.println(Item.showFullItemDescription(myAxe));
		//views.ChooseWeapon.main();
		//views.changeName.main();
		//views.whichName.main();
		//views.whichHeroClaass.main();
		//try {Fight.main(10);} 
		//catch (InterruptedException e) {e.printStackTrace();}
		//finally {SaveLoad.save();}
	}





}
