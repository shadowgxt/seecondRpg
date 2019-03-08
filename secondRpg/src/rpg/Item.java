package rpg;

public enum Item {
	//knight weapon
commonSwordShield(1, 10, 10,0,0,0,0,5,Claass.knight,Rarity.common, ItemType.weapon),
uncommonSwordShield(5, 10, 10,0,0,0,0,5,Claass.knight,Rarity.uncommon, ItemType.weapon),
rareSwordShield(10, 10, 10,0,0,0,0,5,Claass.knight,Rarity.rare, ItemType.weapon),
specialSwordShield(15, 10, 10,0,0,0,0,5,Claass.knight,Rarity.special, ItemType.weapon),
legendarySwordShield(20, 10, 10,0,0,0,0,5,Claass.knight,Rarity.legendary, ItemType.weapon),
mythicalSwordShield(25, 10, 10,0,0,0,0,5,Claass.knight,Rarity.mythical, ItemType.weapon),
commonDualSword(1, 10, 10,0,0,0,0,5,Claass.knight,Rarity.common, ItemType.weapon),
uncommonDualSword(5, 10, 10,0,0,0,0,5,Claass.knight,Rarity.uncommon, ItemType.weapon),
rareDualSword(10, 10, 10,0,0,0,0,5,Claass.knight,Rarity.rare, ItemType.weapon),
specialDualSword(15, 10, 10,0,0,0,0,5,Claass.knight,Rarity.special, ItemType.weapon),
legendaryDualSword(20, 10, 10,0,0,0,0,5,Claass.knight,Rarity.legendary, ItemType.weapon),
mythicalDualSword(25, 10, 10,0,0,0,0,5,Claass.knight,Rarity.mythical, ItemType.weapon),
commonTwoSword(1, 10, 10,0,0,0,0,5,Claass.knight,Rarity.common, ItemType.weapon),
uncommonTwoSword(5, 10, 10,0,0,0,0,5,Claass.knight,Rarity.uncommon, ItemType.weapon),
rareTwoSword(10, 10, 10,0,0,0,0,5,Claass.knight,Rarity.rare, ItemType.weapon),
specialTwoSword(15, 10, 10,0,0,0,0,5,Claass.knight,Rarity.special, ItemType.weapon),
legendaryTwoSword(20, 10, 10,0,0,0,0,5,Claass.knight,Rarity.legendary, ItemType.weapon),
mythicalTwoSword(25, 10, 10,0,0,0,0,5,Claass.knight,Rarity.mythical, ItemType.weapon),
	//ranger weapon
commonBow(1, 10, 10,0,0,0,0,5,Claass.ranger,Rarity.common, ItemType.weapon),
uncommonBow(5, 10, 10,0,0,0,0,5,Claass.ranger,Rarity.uncommon, ItemType.weapon),
rareBow(10, 10, 10,0,0,0,0,5,Claass.ranger,Rarity.rare, ItemType.weapon),
specialBow(15, 10, 10,0,0,0,0,5,Claass.ranger,Rarity.special, ItemType.weapon),
legendaryBow(20, 10, 10,0,0,0,0,5,Claass.ranger,Rarity.legendary, ItemType.weapon),
mythicalBow(25, 10, 10,0,0,0,0,5,Claass.ranger,Rarity.mythical, ItemType.weapon),
commonDagger(1, 10, 10,0,0,0,0,5,Claass.ranger,Rarity.common, ItemType.weapon),
uncommonDagger(5, 10, 10,0,0,0,0,5,Claass.ranger,Rarity.uncommon, ItemType.weapon),
rareDagger(10, 10, 10,0,0,0,0,5,Claass.ranger,Rarity.rare, ItemType.weapon),
specialDagger(15, 10, 10,0,0,0,0,5,Claass.ranger,Rarity.special, ItemType.weapon),
legendaryDagger(20, 10, 10,0,0,0,0,5,Claass.ranger,Rarity.legendary, ItemType.weapon),
mythicalDagger(25, 10, 10,0,0,0,0,5,Claass.ranger,Rarity.mythical, ItemType.weapon),
commonCrossBow(1, 10, 10,0,0,0,0,5,Claass.ranger,Rarity.common, ItemType.weapon),
uncommonCrossBow(5, 10, 10,0,0,0,0,5,Claass.ranger,Rarity.uncommon, ItemType.weapon),
rareCrossBow(10, 10, 10,0,0,0,0,5,Claass.ranger,Rarity.rare, ItemType.weapon),
specialCrossBow(15, 10, 10,0,0,0,0,5,Claass.ranger,Rarity.special, ItemType.weapon),
legendaryCrossBow(20, 10, 10,0,0,0,0,5,Claass.ranger,Rarity.legendary, ItemType.weapon),
mythicalCrossBow(25, 10, 10,0,0,0,0,5,Claass.ranger,Rarity.mythical, ItemType.weapon),
	//mage weapon
commonWand(1, 10, 10,0,0,0,0,5,Claass.mage,Rarity.common, ItemType.weapon),
uncommonWand(5, 10, 10,0,0,0,0,5,Claass.mage,Rarity.uncommon, ItemType.weapon),
rareWand(10, 10, 10,0,0,0,0,5,Claass.mage,Rarity.rare, ItemType.weapon),
specialWand(15, 10, 10,0,0,0,0,5,Claass.mage,Rarity.special, ItemType.weapon),
legendaryWand(20, 10, 10,0,0,0,0,5,Claass.mage,Rarity.legendary, ItemType.weapon),
mythicalWand(25, 10, 10,0,0,0,0,5,Claass.mage,Rarity.mythical, ItemType.weapon),
commonScepter(1, 10, 10,0,0,0,0,5,Claass.mage,Rarity.common, ItemType.weapon),
uncommonScepter(5, 10, 10,0,0,0,0,5,Claass.mage,Rarity.uncommon, ItemType.weapon),
rareScepter(10, 10, 10,0,0,0,0,5,Claass.mage,Rarity.rare, ItemType.weapon),
specialScepter(15, 10, 10,0,0,0,0,5,Claass.mage,Rarity.special, ItemType.weapon),
legendaryScepter(20, 10, 10,0,0,0,0,5,Claass.mage,Rarity.legendary, ItemType.weapon),
mythicalScepter(25, 10, 10,0,0,0,0,5,Claass.mage,Rarity.mythical, ItemType.weapon),
commonStaff(1, 10, 10,0,0,0,0,5,Claass.mage,Rarity.common, ItemType.weapon),
uncommonStaff(5, 10, 10,0,0,0,0,5,Claass.mage,Rarity.uncommon, ItemType.weapon),
rareStaff(10, 10, 10,0,0,0,0,5,Claass.mage,Rarity.rare, ItemType.weapon),
specialStaff(15, 10, 10,0,0,0,0,5,Claass.mage,Rarity.special, ItemType.weapon),
legendaryStaff(20, 10, 10,0,0,0,0,5,Claass.mage,Rarity.legendary, ItemType.weapon),
mythicalStaff(25, 10, 10,0,0,0,0,5,Claass.mage,Rarity.mythical, ItemType.weapon),
	//viking weapon
commonTwoAxe(1, 10, 10,0,0,0,0,5,Claass.viking,Rarity.common, ItemType.weapon),
uncommonTwoAxe(5, 10, 10,0,0,0,0,5,Claass.viking,Rarity.uncommon, ItemType.weapon),
rareTwoAxe(10, 10, 10,0,0,0,0,5,Claass.viking,Rarity.rare, ItemType.weapon),
specialTwoAxe(15, 10, 10,0,0,0,0,5,Claass.viking,Rarity.special, ItemType.weapon),
legendaryTwoAxe(20, 10, 10,0,0,0,0,5,Claass.viking,Rarity.legendary, ItemType.weapon),
mythicalTwoAxe(25, 10, 10,0,0,0,0,5,Claass.viking,Rarity.mythical, ItemType.weapon),
commonDualAxe(1, 10, 10,0,0,0,0,5,Claass.viking,Rarity.common, ItemType.weapon),
uncommonDualAxe(5, 10, 10,0,0,0,0,5,Claass.viking,Rarity.uncommon, ItemType.weapon),
rareDualAxe(10, 10, 10,0,0,0,0,5,Claass.viking,Rarity.rare, ItemType.weapon),
specialDualAxe(15, 10, 10,0,0,0,0,5,Claass.viking,Rarity.special, ItemType.weapon),
legendaryDualAxe(20, 10, 10,0,0,0,0,5,Claass.viking,Rarity.legendary, ItemType.weapon),
mythicalDualAxe(25, 10, 10,0,0,0,0,5,Claass.viking,Rarity.mythical, ItemType.weapon),
commonAxeShield(1, 10, 10,0,0,0,0,5,Claass.viking,Rarity.common, ItemType.weapon),
uncommonAxeShield(5, 10, 10,0,0,0,0,5,Claass.viking,Rarity.uncommon, ItemType.weapon),
rareAxeShield(10, 10, 10,0,0,0,0,5,Claass.viking,Rarity.rare, ItemType.weapon),
specialAxeShield(15, 10, 10,0,0,0,0,5,Claass.viking,Rarity.special, ItemType.weapon),
legendaryAxeShield(20, 10, 10,0,0,0,0,5,Claass.viking,Rarity.legendary, ItemType.weapon),
mythicalAxeShield(25, 10, 10,0,0,0,0,5,Claass.viking,Rarity.mythical, ItemType.weapon),
	//knight armor
commonHeavyArmor(1, 10, 10,0,0,0,0,10,Claass.knight,Rarity.common, ItemType.armor),
uncommonHeavyArmor(5, 10, 10,0,0,0,0,10,Claass.knight,Rarity.uncommon, ItemType.armor),
rareHeavyArmor(10, 10, 10,0,0,0,0,10,Claass.knight,Rarity.rare, ItemType.armor),
specialHeavyArmor(15, 10, 10,0,0,0,0,10,Claass.knight,Rarity.special, ItemType.armor),
legendaryHeavyArmor(20, 10, 10,0,0,0,0,10,Claass.knight,Rarity.legendary, ItemType.armor),
mythicalHeavyArmor(25, 10, 10,0,0,0,0,10,Claass.knight,Rarity.mythical, ItemType.armor),
	//ranger armor
commonLightArmor(1, 10, 10,0,0,0,0,10,Claass.ranger,Rarity.common, ItemType.armor),
uncommonLightArmor(5, 10, 10,0,0,0,0,10,Claass.ranger,Rarity.uncommon, ItemType.armor),
rareLightArmor(10, 10, 10,0,0,0,0,10,Claass.ranger,Rarity.rare, ItemType.armor),
specialLightArmor(15, 10, 10,0,0,0,0,10,Claass.ranger,Rarity.special, ItemType.armor),
legendaryLightArmor(20, 10, 10,0,0,0,0,10,Claass.ranger,Rarity.legendary, ItemType.armor),
mythicalLightArmor(25, 10, 10,0,0,0,0,10,Claass.ranger,Rarity.mythical, ItemType.armor),
	//mage armor
commonRobe(1, 10, 10,0,0,0,0,10,Claass.mage,Rarity.common, ItemType.armor),
uncommonRobe(5, 10, 10,0,0,0,0,10,Claass.mage,Rarity.uncommon, ItemType.armor),
rareRobe(10, 10, 10,0,0,0,0,10,Claass.mage,Rarity.rare, ItemType.armor),
specialRobe(15, 10, 10,0,0,0,0,10,Claass.mage,Rarity.special, ItemType.armor),
legendaryRobe(20, 10, 10,0,0,0,0,10,Claass.mage,Rarity.legendary, ItemType.armor),
mythicalRobe(25, 10, 10,0,0,0,0,10,Claass.mage,Rarity.mythical, ItemType.armor),
	//viking armor
commonMidArmor(1, 10, 10,0,0,0,0,10,Claass.viking,Rarity.common, ItemType.armor),
uncommonMidArmor(5, 10, 10,0,0,0,0,10,Claass.viking,Rarity.uncommon, ItemType.armor),
rareMidArmor(10, 10, 10,0,0,0,0,10,Claass.viking,Rarity.rare, ItemType.armor),
specialkMidArmor(15, 10, 10,0,0,0,0,10,Claass.viking,Rarity.special, ItemType.armor),
legendaryMidArmor(20, 10, 10,0,0,0,0,10,Claass.viking,Rarity.legendary, ItemType.armor),
mythicalMidArmor(25, 10, 10,0,0,0,0,10,Claass.viking,Rarity.mythical, ItemType.armor), 
fists(1,0,0,0,0,0,0,0,Claass.all,Rarity.common, ItemType.weapon),
nakedBody(1,0,0,0,0,0,0,0,Claass.all,Rarity.common, ItemType.armor);


	public ItemType itemTypes;
	public Claass itemClaass;
	public int LVL,HP,MP,S,A,I,L,gold;
	public Rarity raritys;
	
	private Item (int LVL,int HP,int MP,int S,int A,int I,int L,int gold,Claass itemClaass, Rarity raritys, ItemType itemTypes) {
		this.itemClaass=itemClaass;
		this.LVL=LVL;
		this.HP=HP;
		this.MP=MP;
		this.S=S;
		this.A=A;
		this.I=I;
		this.L=L;
		this.gold=gold;
		this.itemTypes=itemTypes;
		this.raritys=raritys;
		
	}
	
	public static void showFullItemDescription(Item itemName){
		System.out.println(itemName + " posiada nastêpuj¹ce statystyki: ");
		System.out.print("LVL: " + itemName.LVL + "\n");
		System.out.print(" HP: " + itemName.HP + " ");
		System.out.print(" MP: " + itemName.MP + " ");
		System.out.print(" S: " + itemName.S + " ");
		System.out.print(" A: " + itemName.A + " ");
		System.out.print(" I: " + itemName.I + " ");
		System.out.print(" L: " + itemName.L + " ");
		System.out.print("\n" + " Sell price: " + itemName.gold + " gold coins\n");
		System.out.print(" Rarity: " + itemName.raritys + "\n");
		System.out.print(" Typ: " + itemName.itemTypes + "\n");
		System.out.print(" Class: " + itemName.itemClaass + "\n");	
	}
	
	public static void showShortItemDescription(Item itemName){
		System.out.println(itemName + " w skrocie: ");
		System.out.print("LVL: " + itemName.LVL);
		System.out.print(" Sell price: " + itemName.gold + " gold coins");
		System.out.print(" Rarity: " + itemName.raritys);
		System.out.print(" Typ: " + itemName.itemTypes);
		System.out.println(" Class: " + itemName.itemClaass);	
	}
}
