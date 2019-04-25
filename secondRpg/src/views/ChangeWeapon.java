package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.PopupMenu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import rpg.Character;
import rpg.Item;
import rpg.ItemType;
import rpg.SaveLoad;

import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.Popup;
import javax.swing.PopupFactory;
import javax.swing.SwingUtilities;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChangeWeapon extends JFrame {

	private JPanel contentPane;
	int numberOfChooseItem=0;
	
	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangeWeapon frame = new ChangeWeapon();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public ChangeWeapon() {
		rpg.Item equipedWeapon = rpg.Character.geteWeapon();

		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextField weaponName = new JTextField();
		weaponName.setEditable(false);
		weaponName.setBounds(70, 20, 450, 60);
		weaponName.setText("Equiped weapon: " + rpg.Character.geteWeapon());
		weaponName.setFont(new Font("Monotype Corsiva", Font.PLAIN, 30));
		contentPane.add(weaponName);
		
		JComboBox<Item> chooseWeapon = new JComboBox();
		chooseWeapon.setFont(new Font ("Tahoma", Font.BOLD, 18));
		chooseWeapon.setBounds(600, 20, 450, 60);
		contentPane.add(chooseWeapon);
		List<Item> actuallyWeaponList = new ArrayList <Item>();
		int g =0;
		List<Integer> bagNumber = new ArrayList <Integer>();
		for(int iii =0;iii<Character.bag.size();iii++){
			if (Character.bag.get(iii).itemTypes == ItemType.weapon){
				actuallyWeaponList.add(Character.bag.get(iii));
				bagNumber.add(iii);
				chooseWeapon.addItem(actuallyWeaponList.get(g));
				g=g+1;
				}
		}
		
		
		JTextArea eWeaponInfo = new JTextArea();
		eWeaponInfo.setEditable(false);
		eWeaponInfo.setBounds(70, 90, 450, 450);
		eWeaponInfo.setText(equipedWeapon + " stats: \n" +
		"LVL: " + equipedWeapon.LVL + "\n" +
		" HP: " + equipedWeapon.HP + "\n" +
		" MP: " + equipedWeapon.MP + "\n" +
		" S: " + equipedWeapon.S + "\n" +
		" A: " + equipedWeapon.A + "\n" +
		" I: " + equipedWeapon.I + "\n" +
		" L: " + equipedWeapon.L + "\n" +
		" Sell price: " + equipedWeapon.gold + " gold coins\n" +
		" Rarity: " + equipedWeapon.raritys + "\n" +
		" Typ: " + equipedWeapon.itemTypes + "\n" +
		" Class: " + equipedWeapon.itemClaass + "\n");
		eWeaponInfo.setFont(new Font("Monotype Corsiva", Font.PLAIN, 30));
		contentPane.add(eWeaponInfo);
		
		
		JTextArea newWeaponInfo = new JTextArea();
		newWeaponInfo.setEditable(true);
		newWeaponInfo.setBounds(600, 90, 450, 450);
		newWeaponInfo.setFont(new Font("Monotype Corsiva", Font.PLAIN, 30));
		contentPane.add(newWeaponInfo);
			
		chooseWeapon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numberOfChooseItem = chooseWeapon.getSelectedIndex();
				newWeaponInfo.setText(actuallyWeaponList.get(numberOfChooseItem) + " stats: \n" +
						"LVL: " + actuallyWeaponList.get(numberOfChooseItem).LVL + "\n" +
						" HP: " + actuallyWeaponList.get(numberOfChooseItem).HP + "\n" +
						" MP: " + actuallyWeaponList.get(numberOfChooseItem).MP + "\n" +
						" S: " + actuallyWeaponList.get(numberOfChooseItem).S + "\n" +
						" A: " + actuallyWeaponList.get(numberOfChooseItem).A + "\n" +
						" I: " + actuallyWeaponList.get(numberOfChooseItem).I + "\n" +
						" L: " + actuallyWeaponList.get(numberOfChooseItem).L + "\n" +
						" Sell price: " + actuallyWeaponList.get(numberOfChooseItem).gold + " gold coins\n" +
						" Rarity: " + actuallyWeaponList.get(numberOfChooseItem).raritys + "\n" +
						" Typ: " + actuallyWeaponList.get(numberOfChooseItem).itemTypes + "\n" +
						" Class: " + actuallyWeaponList.get(numberOfChooseItem).itemClaass + "\n");
			}
		});
		
		JButton changeWeapon = new JButton("CHANGE WEAPON");
		changeWeapon.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				Character.equipWeapon(bagNumber.get(numberOfChooseItem));
				Character.heroInfo();
				SaveLoad.save();
				views.MainMenu.main();
				dispose();
			}
		});
		changeWeapon.setBounds(1043, 618, 200, 30);
		contentPane.add(changeWeapon);
		
		
	}
	
		}


