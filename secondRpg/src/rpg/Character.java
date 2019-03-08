package rpg;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Character extends main{

	public Character(String[] args) {
		super();
	}

	private static String heroName;
	static Claass heroClaass;
	static int heroHP,heroMP,heroS,heroA,heroI,heroL;
	static double heroEXP=0;
	static double heroLVL=1;
	static Item eWeapon = Item.fists;
	static Item eArmor = Item.nakedBody;
	static List<Item> bag = new ArrayList <Item>();
	static int gold;
	
	
	public final static void chooseClaass(int mm){
		switch (mm) {
		case 1: heroClaass=Claass.knight;
		setFirstStat();
		giveItem(Item.commonSwordShield, Item.commonDualSword, Item.commonTwoSword, Item.commonHeavyArmor);
		equipWeapon();
		equipArmor();
			break;
		case 2: heroClaass=Claass.ranger;
		setFirstStat();
		giveItem(Item.commonBow, Item.commonDagger, Item.commonCrossBow, Item.commonLightArmor);
		equipWeapon();
		equipArmor();
			break;
		case 3: heroClaass=Claass.mage;
		setFirstStat();
		giveItem(Item.commonWand, Item.commonScepter, Item.commonStaff, Item.commonRobe);
		equipWeapon();
		equipArmor();
			break;
		case 4:	heroClaass=Claass.viking;
		setFirstStat();
		giveItem(Item.commonTwoAxe, Item.commonDualAxe, Item.commonAxeShield, Item.commonMidArmor);
		equipWeapon();
		equipArmor();
			break;
		}
		SaveLoad.save();
	}
	final static void setFirstStat(){
		heroHP=heroClaass.HP;
		heroMP=heroClaass.MP;
		heroS=heroClaass.S;
		heroA=heroClaass.A;
		heroI=heroClaass.I;
		heroL=heroClaass.L;
	}
	
	public final static void setHeroName(){
		views.ChangeName.main();
	}
	
	final static void getEXP (int EXP) {
		heroEXP += EXP;
		System.out.println("heroEXP: " + heroEXP +"     heroLVL: "+ heroLVL);
		if (heroEXP >= (100*(Math.pow((1.2),heroLVL)))){
			heroEXP = heroEXP - (int) (100*(Math.pow((1.2),heroLVL)));
			heroLVL++;
		}
	}
	final static void getGold (){
	Random rand = new Random();
	double m = rand.nextDouble();
	Character.gold = (int) (Character.gold + (((m+0.1) *10) * (Character.heroLVL*(Math.pow(1.3, heroLVL)))));
	}
	
	final static void giveItem(Item item0, Item...items){
		System.out.println("You have received: ");
		Item.showShortItemDescription(item0);
		bag.add(item0);
		for(int i=0; i<items.length; i++)
			{System.out.println("You have received: ");
			Item.showShortItemDescription(items[0]);
			bag.add(items[i]);
			}
	}
	
	final static void equipWeapon(){
		if (bag.isEmpty())System.out.println("You don't have any items to equip! [LOOSER]");
		else {
			showBag();
			System.out.print("Which iteem you would like to equip (Weapon): ");
			Scanner scan = new Scanner(System.in);
			int wI = -1;
			try {wI = scan.nextInt();}
			catch (InputMismatchException e) { System.out.println("to nie jest liczba");}
			if (wI>bag.size() || wI <0)System.out.println("Podana liczba jest b³êdna");
			else if (wI <= bag.size()) 
			{
		if ((bag.get(wI)).itemTypes==ItemType.weapon){
		if ((bag.get(wI)).itemClaass==heroClaass) 
			{
			bag.add(eWeapon);
			eWeapon = bag.get(wI);
			heroHP = heroClaass.HP + bag.get(wI).HP +eArmor.HP;
			heroMP = heroClaass.MP + bag.get(wI).MP + eArmor.MP;
			heroS = heroClaass.S + bag.get(wI).S + eArmor.S;
			heroA = heroClaass.A + bag.get(wI).A + eArmor.A;
			heroI = heroClaass.I + bag.get(wI).I + eArmor.I;
			heroL = heroClaass.L + bag.get(wI).L + eArmor.L;
			bag.remove(wI);
			}
		else System.out.println("Wrong class of item, you can equip this Weapon");
	}else System.out.println("This is not Weapon!");
		}
			}
		}
	
	final static void equipArmor(){
		if (bag.isEmpty())System.out.println("You don't have any items to equip! [LOOSER]");
		else {
			showBag();
			System.out.print("Which iteem you would like to equip (Armor): ");
			Scanner scan = new Scanner(System.in);
			int wI = -1;
			try {wI = scan.nextInt();}
			catch (InputMismatchException e) { System.out.println("to nie jest liczba");}
			if (wI>bag.size() || wI <0)System.out.println("Podana liczba jest b³êdna");
			else if (wI <= bag.size()) 
			{
		if ((bag.get(wI)).itemTypes==ItemType.armor){
		if ((bag.get(wI)).itemClaass==heroClaass) 
			{
			bag.add(eArmor);
			eArmor = bag.get(wI);
			heroHP = heroClaass.HP + bag.get(wI).HP + eWeapon.HP;
			heroMP = heroClaass.MP + bag.get(wI).MP + eWeapon.MP;
			heroS = heroClaass.S + bag.get(wI).S + eWeapon.S;
			heroA = heroClaass.A + bag.get(wI).A + eWeapon.A;
			heroI = heroClaass.I + bag.get(wI).I + eWeapon.I;
			heroL = heroClaass.L + bag.get(wI).L + eWeapon.L;
			bag.remove(wI);
			}
		else System.out.println("Wrong class of item, you can equip this armor");
	}else System.out.println("This is not Armor!");
		}
			}
		}
	
	
	
	
	final static void showBag() {
		if (bag.isEmpty())System.out.println("You don't have any items! [LOOSER]");
		else {
		System.out.println("You have " + bag.size() + " items.");
		for(int iii =0;iii<bag.size();iii++){
			System.out.print(iii +" item: ");
			Item.showShortItemDescription(bag.get(iii));
		}
		}
		//mozliwosc rozwiniecia opisu konkretnego przedmiotu jako showFullItemDescription
			
	}
	
	final static void sellItem() {
		
		if (bag.isEmpty())System.out.println("You don't have any items to sell! [LOOSER]");
		else {
			showBag();
			System.out.println("Podaj numer przedmiotu");
			Scanner scan = new Scanner(System.in);
			int whichItem = -1;
			try {whichItem = scan.nextInt();}
			catch (InputMismatchException e) { System.out.println("to nie jest liczba");}
			if (whichItem>bag.size() || whichItem <0)System.out.println("Podana liczba jest b³êdna");
			else if (whichItem <= bag.size()) 
			{
			System.out.println("You have sold item number: " + whichItem);
			Item.showShortItemDescription(bag.get(whichItem));
			bag.remove(whichItem);}
			else System.out.println("WTF man??");
		}
		
	}
	
	final static void showLVL() { 
	System.out.println("Your actually LVL is: " + heroLVL + " and you have " + heroEXP + "/" + (int)(100*(Math.pow((1.2),heroLVL))) + " EXP.");	//mozna sparsowac na int przy wyswietlaniu
	}
	
	final static void heroInfo(){
		System.out.println(
				 "heroName: " + Character.getHeroName() + ";"+
				 " heroClaass : " +  Character.heroClaass+";"+
				 " heroHP: " +  Character.heroHP+";"+
				 " heroMP: " +  Character.heroMP+";"+
				 " heroS: " +  Character.heroS+";"+
				 " heroA: " +  Character.heroA+";"+
				 " heroI: " +  Character.heroI+";"+
				 " heroL: " +  Character.heroL+";"+
				 " heroEXP: " +  Character.heroEXP+";"+
				 " heroLVL: " +  Character.heroLVL+";"+
				 " eWeapon: " +  Character.eWeapon+";"+
				 " eArmor: " +  Character.eArmor+";"+
				 " gold: " +  Character.gold+";"
				  );
	}
	public static String getHeroName() {
		return heroName;
	}
	public static void setHeroName(String heroName) {
		Character.heroName = heroName;
	}
	
	public static Item geteWeapon() {
		return eWeapon;
	}
	public static void seteWeapon(Item eWeapon) {
		Character.eWeapon = eWeapon;
	}
	
	public static Item geteArmor() {
		return eWeapon;
	}
	public static void seteArmor(Item eWeapon) {
		Character.eWeapon = eWeapon;
	}
	
}
