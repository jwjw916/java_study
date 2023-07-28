package ch07.a_extend.spider;

public class SpidermanTest {

	public static void main(String[] args) {
		SpiderMan sman = new SpiderMan("name", true, new Spider());
		// String name, boolean isSpider, Spider spider
		sman.fierWeb();
		sman.jump();
//		sman.isSpider = true;
//		sman.fierWeb();
//		sman.jump();
		
	}

}
