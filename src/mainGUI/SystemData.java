package mainGUI;


import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import birds.EnemyEntity;
import birds.EnemyUnit;
import birds.Boss;
import main.Skin;

public class SystemData {

	public static ArrayList<Skin> allSkins = new ArrayList<Skin>();
	public static ArrayList<EnemyEntity> allEnemies = new ArrayList<EnemyEntity>();
	public static Image backgroundImg;
	public static Image[] playerImages = new Image[100];
	public static Image[] bulletImages = new Image[50];
	public static Image[] birdImages = new Image[100];
	public static Image coinImage;
	public static Image trophyIcon;
	public static Image victoryIcon;
	public static Image defeatIcon;
	public static Image targetIcon;
	public static Image playButton;
	public static Image playButtonP;
	public static Image switchButton;
	public static Image switchButtonP;
	public static Image rubyIcon;
	public static Image mainBG;
	public static Image skinBG;
	public static Image enemyBG;
	
	public static boolean showHitbox = false;

	public static void loadGameData(){
		try {
			loadSkins("/Skindata.txt");
			loadEnemies("/Enemydata.txt");
			loadBosses("/Bossdata.txt");
			loadImages();
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}

	private static void loadImages(){
		// Background
		backgroundImg = new ImageIcon(SystemData.class.getResource("/ab.jpg")).getImage();
		mainBG = new ImageIcon(SystemData.class.getResource("/playPanel.jpg")).getImage();
		skinBG = new ImageIcon(SystemData.class.getResource("/skinPanel.jpg")).getImage();
		enemyBG = new ImageIcon(SystemData.class.getResource("/epp.png")).getImage();
		// Player Skins
		playerImages[0] = new ImageIcon(SystemData.class.getResource("/Player.png")).getImage();
		playerImages[1] = new ImageIcon(SystemData.class.getResource("/Player1.png")).getImage();
		playerImages[2] = new ImageIcon(SystemData.class.getResource("/Player2.png")).getImage();
		playerImages[3] = new ImageIcon(SystemData.class.getResource("/Player3.png")).getImage();
		playerImages[4] = new ImageIcon(SystemData.class.getResource("/Player4.png")).getImage();
		playerImages[5] = new ImageIcon(SystemData.class.getResource("/Player5.png")).getImage();
		// Special Skins
		playerImages[7] = new ImageIcon(SystemData.class.getResource("/Playerghost.png")).getImage();
		playerImages[16] = new ImageIcon(SystemData.class.getResource("/Player16.png")).getImage();
		playerImages[17] = new ImageIcon(SystemData.class.getResource("/Player17.png")).getImage();
		playerImages[18] = new ImageIcon(SystemData.class.getResource("/Player18.png")).getImage();
		playerImages[21] = new ImageIcon(SystemData.class.getResource("/Player21.png")).getImage();
		playerImages[24] = new ImageIcon(SystemData.class.getResource("/Player24.png")).getImage();
		playerImages[25] = new ImageIcon(SystemData.class.getResource("/Player25.png")).getImage();
		playerImages[26] = new ImageIcon(SystemData.class.getResource("/Player26.png")).getImage();
		playerImages[29] = new ImageIcon(SystemData.class.getResource("/Player29.png")).getImage();
		playerImages[30] = new ImageIcon(SystemData.class.getResource("/Player30.png")).getImage();
		playerImages[31] = new ImageIcon(SystemData.class.getResource("/Player31.png")).getImage();
		playerImages[34] = new ImageIcon(SystemData.class.getResource("/Player34.png")).getImage();
		playerImages[42] = new ImageIcon(SystemData.class.getResource("/Player42.png")).getImage();
		// CDBGs
		playerImages[50] = new ImageIcon(SystemData.class.getResource("/cdbg/Sum.png")).getImage();
		playerImages[51] = new ImageIcon(SystemData.class.getResource("/cdbg/Alex.png")).getImage();
		playerImages[52] = new ImageIcon(SystemData.class.getResource("/cdbg/Tim.png")).getImage();
		playerImages[53] = new ImageIcon(SystemData.class.getResource("/cdbg/Ihallaw.png")).getImage();
		playerImages[54] = new ImageIcon(SystemData.class.getResource("/cdbg/Gray.png")).getImage();
		playerImages[55] = new ImageIcon(SystemData.class.getResource("/cdbg/Udrew2.png")).getImage();
		//playerImages[56] = new ImageIcon(SystemData.class.getResource("/cdbg/Gray2.png")).getImage();
		//playerImages[56] = new ImageIcon(SystemData.class.getResource("/cdbg/Udrew2.png")).getImage();
		// Bullet Skins
		bulletImages[0] = new ImageIcon(SystemData.class.getResource("/bullet0.png")).getImage();
		bulletImages[1] = new ImageIcon(SystemData.class.getResource("/bullet1.png")).getImage();
		bulletImages[2] = new ImageIcon(SystemData.class.getResource("/bullet2.png")).getImage();
		bulletImages[3] = new ImageIcon(SystemData.class.getResource("/bullet3.png")).getImage();
		bulletImages[4] = new ImageIcon(SystemData.class.getResource("/bullet4.png")).getImage();
		bulletImages[5] = new ImageIcon(SystemData.class.getResource("/bullet5.png")).getImage();
		bulletImages[6] = new ImageIcon(SystemData.class.getResource("/bullet6.png")).getImage();
		bulletImages[7] = new ImageIcon(SystemData.class.getResource("/bullet7.png")).getImage();
		bulletImages[8] = new ImageIcon(SystemData.class.getResource("/bullet8.png")).getImage();
		bulletImages[9] = new ImageIcon(SystemData.class.getResource("/bullet9.png")).getImage();
		bulletImages[10] = new ImageIcon(SystemData.class.getResource("/bullet10.png")).getImage();
		bulletImages[11] = new ImageIcon(SystemData.class.getResource("/bullet11.png")).getImage();
		bulletImages[12] = new ImageIcon(SystemData.class.getResource("/bullet12.png")).getImage();
		bulletImages[13] = new ImageIcon(SystemData.class.getResource("/bullet13.png")).getImage();
		bulletImages[14] = new ImageIcon(SystemData.class.getResource("/bullet14.png")).getImage();
		bulletImages[15] = new ImageIcon(SystemData.class.getResource("/bullet15.png")).getImage();
		bulletImages[16] = new ImageIcon(SystemData.class.getResource("/bullet16.png")).getImage();
		bulletImages[17] = new ImageIcon(SystemData.class.getResource("/bullet17.png")).getImage();
		bulletImages[18] = new ImageIcon(SystemData.class.getResource("/bullet18.png")).getImage();
		bulletImages[19] = new ImageIcon(SystemData.class.getResource("/bullet19.png")).getImage();

		// Enemy Skins
//		birdImages[0] = new ImageIcon(SystemData.class.getResource("/ybird.png")).getImage();
		birdImages[1] = new ImageIcon(SystemData.class.getResource("/Enemies/bird1.png")).getImage();
		birdImages[2] = new ImageIcon(SystemData.class.getResource("/Enemies/bird2.png")).getImage();
		birdImages[3] = new ImageIcon(SystemData.class.getResource("/Enemies/bird3.png")).getImage();
		birdImages[4] = new ImageIcon(SystemData.class.getResource("/Enemies/bird4.png")).getImage();
		birdImages[5] = new ImageIcon(SystemData.class.getResource("/Enemies/bird5.png")).getImage();
		birdImages[6] = new ImageIcon(SystemData.class.getResource("/Enemies/bird6.png")).getImage();
		birdImages[7] = new ImageIcon(SystemData.class.getResource("/Enemies/bird7.png")).getImage();
		birdImages[8] = new ImageIcon(SystemData.class.getResource("/Enemies/bird8.png")).getImage();
		birdImages[11] = new ImageIcon(SystemData.class.getResource("/Enemies/bird11.png")).getImage();
		birdImages[27] = new ImageIcon(SystemData.class.getResource("/Enemies/bird27.png")).getImage();
		birdImages[29] = new ImageIcon(SystemData.class.getResource("/Enemies/bird29.png")).getImage();
		birdImages[30] = new ImageIcon(SystemData.class.getResource("/Enemies/bird30.png")).getImage();

		
		birdImages[20] = new ImageIcon(SystemData.class.getResource("/cdbg/tomo.png")).getImage();
		birdImages[21] = new ImageIcon(SystemData.class.getResource("/cdbg/b1.png")).getImage();
		birdImages[22] = new ImageIcon(SystemData.class.getResource("/cdbg/v2.png")).getImage();
		birdImages[23] = new ImageIcon(SystemData.class.getResource("/cdbg/v1.png")).getImage();
		birdImages[24] = new ImageIcon(SystemData.class.getResource("/cdbg/r2.png")).getImage();
		birdImages[25] = new ImageIcon(SystemData.class.getResource("/cdbg/t1.png")).getImage();
		birdImages[26] = new ImageIcon(SystemData.class.getResource("/cdbg/r1.png")).getImage();
		
		// Misc Objects
		coinImage = new ImageIcon(SystemData.class.getResource("/coinicon.png")).getImage();
		trophyIcon = new ImageIcon(SystemData.class.getResource("/trophyicon.png")).getImage();
		rubyIcon = new ImageIcon(SystemData.class.getResource("/ruby.png")).getImage();
		victoryIcon = new ImageIcon(SystemData.class.getResource("/victory.png")).getImage();
		defeatIcon = new ImageIcon(SystemData.class.getResource("/defeat.png")).getImage();
		targetIcon = new ImageIcon(SystemData.class.getResource("/targeticon.png")).getImage();

		// Buttons
		playButton = new ImageIcon(SystemData.class.getResource("/playbutton.png")).getImage();
		playButtonP = new ImageIcon(SystemData.class.getResource("/playbutton1.png")).getImage();
		switchButton = new ImageIcon(SystemData.class.getResource("/switch.png")).getImage();
		switchButtonP = new ImageIcon(SystemData.class.getResource("/switch1.png")).getImage();
	}

	private static void loadSkins(String fileName) throws NumberFormatException, IOException{
		//FileReader f = new FileReader();
		InputStream in = SystemData.class.getResourceAsStream(fileName);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String line = "";
		while ((line = br.readLine()) != null) {
			String[] tokens = line.split(",");
			int id = Integer.parseInt(tokens[0].trim());
			String name = tokens[1].trim();
			int xs = Integer.parseInt(tokens[2].trim());
			int ys = Integer.parseInt(tokens[3].trim());
			int pow = Integer.parseInt(tokens[4].trim());
			int prc = Integer.parseInt(tokens[5].trim());
			int cr = Integer.parseInt(tokens[6].trim());
			int cp = Integer.parseInt(tokens[7].trim());
			int def = Integer.parseInt(tokens[8].trim());
			double mr = Double.parseDouble(tokens[9].trim());
			int sizeX = Integer.parseInt(tokens[10].trim());
			int sizeY = Integer.parseInt(tokens[11].trim());
			int xo = Integer.parseInt(tokens[12].trim());
			int yo = Integer.parseInt(tokens[13].trim());
			Skin s = new Skin(id, name, xs, ys, pow, prc, cr, cp ,def, mr ,sizeX, sizeY);
			s.setOffset(xo, yo);
			int shoot = Integer.parseInt(tokens[14].trim());
			int BID = Integer.parseInt(tokens[15].trim());
			int BX = Integer.parseInt(tokens[16].trim());
			int BY = Integer.parseInt(tokens[17].trim());
			int MC = Integer.parseInt(tokens[18].trim());
			s.setFire(shoot, BID, BX, BY, MC);
			String desc = "";
			while (!(line = br.readLine()).equals("ENDBIO")){
				desc += line + "\n";
			}
			s.setDescription(desc);
			allSkins.add(s);
		}
		br.close();
	}
	
	private static void loadEnemies(String fileName) throws NumberFormatException, IOException{
		InputStream in = SystemData.class.getResourceAsStream(fileName);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String line = "";
		while ((line = br.readLine()) != null) {
			String[] tokens = line.split(",");
			int id = Integer.parseInt(tokens[0].trim());
			String name = tokens[1].trim();
			int xs = Integer.parseInt(tokens[2].trim());
			int ys = Integer.parseInt(tokens[3].trim());
			int dmg = Integer.parseInt(tokens[4].trim());
			int hp = Integer.parseInt(tokens[5].trim());
			int def = Integer.parseInt(tokens[6].trim());
			int scr = Integer.parseInt(tokens[7].trim());
			int msc = Integer.parseInt(tokens[8].trim());
			int sx = Integer.parseInt(tokens[9].trim());
			int sy = Integer.parseInt(tokens[10].trim());
			int tarr = Integer.parseInt(tokens[11].trim());
			int tarp = Integer.parseInt(tokens[12].trim());
			int zig = Integer.parseInt(tokens[13].trim());
			int hpd = Integer.parseInt(tokens[14].trim());
			int dr = Integer.parseInt(tokens[15].trim());
			int dma = Integer.parseInt(tokens[16].trim());
			int da = Integer.parseInt(tokens[17].trim());
			EnemyUnit b = new EnemyUnit(id, name, xs, ys, dmg, hp, def, scr, 
					msc, sx, sy, tarr, tarp, zig, hpd, dr, dma, da);
			String desc = "";
			while (!(line = br.readLine()).equals("ENDBIO")){
				desc += line + "\n";
			}
			b.setDescription(desc);
			allEnemies.add(b);
		}
		br.close();
	}
	
	private static void loadBosses(String fileName) throws NumberFormatException, IOException{
		InputStream in = SystemData.class.getResourceAsStream(fileName);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String line = "";
		while ((line = br.readLine()) != null) {
			String[] tokens = line.split(",");
			int id = Integer.parseInt(tokens[0].trim());
			String name = tokens[1].trim();
			int xs = Integer.parseInt(tokens[2].trim());
			int ys = Integer.parseInt(tokens[3].trim());
			int dmg = Integer.parseInt(tokens[4].trim());
			int hp = Integer.parseInt(tokens[5].trim());
			int def = Integer.parseInt(tokens[6].trim());
			int scr = Integer.parseInt(tokens[7].trim());
			int msc = Integer.parseInt(tokens[8].trim());
			int sx = Integer.parseInt(tokens[9].trim());
			int sy = Integer.parseInt(tokens[10].trim());
			int tarr = Integer.parseInt(tokens[11].trim());
			int tarp = Integer.parseInt(tokens[12].trim());
			int zig = Integer.parseInt(tokens[13].trim());
			int hpd = Integer.parseInt(tokens[14].trim());
			int dr = Integer.parseInt(tokens[15].trim());
			int dma = Integer.parseInt(tokens[16].trim());
			int da = Integer.parseInt(tokens[17].trim());
			tokens = br.readLine().split(",");
			int freq = Integer.parseInt(tokens[0].trim());
			int bID = Integer.parseInt(tokens[1].trim());
			int ox = Integer.parseInt(tokens[2].trim());
			int oy = Integer.parseInt(tokens[3].trim());
			int bsx = Integer.parseInt(tokens[4].trim());
			int bsy = Integer.parseInt(tokens[5].trim());
			int sp = Integer.parseInt(tokens[6].trim());
			int pow = Integer.parseInt(tokens[7].trim());
			int prc = Integer.parseInt(tokens[8].trim());
			Boss b = new Boss(id, name, xs, ys, dmg, hp, def, scr, 
					msc, sx, sy, tarr, tarp, zig, hpd, dr, dma, da,
					freq, bID, ox, oy, bsx, bsy, sp, pow, prc);
			String desc = "";
			while (!(line = br.readLine()).equals("ENDBIO")){
				desc += line + "\n";
			}
			b.setDescription(desc);
			allEnemies.add(b);
		}
		br.close();
	}

	public static Skin getSkin(int skinID){
		for (Skin s : allSkins){
			if (s.skinID == skinID)	return s;
		}
		return null;
	}
	
	public static EnemyEntity getEnemy(int enemyID){
		for (EnemyEntity b : allEnemies){
			if (b.eID == enemyID) return b;
		}
		return null;
	}
	
	

}
