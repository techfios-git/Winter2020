package pages;

import java.util.Random;

public class BasePage {
	
	public static int randomNumGenerator() {
		Random rnd = new Random();
		return rnd.nextInt(999);
	}

}
