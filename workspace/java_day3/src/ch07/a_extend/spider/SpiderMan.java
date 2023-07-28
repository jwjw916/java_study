package ch07.a_extend.spider;

public class SpiderMan extends Person {

	boolean isSpider;
	
	Spider spider = new Spider();
	
	public SpiderMan(String name) {
		super(name); //생성자 표기가 없으면 생성자 생략된 것 -> super() 생략도 마찬가지
	}
	
	public SpiderMan(String name, boolean isSpider) {
		super(name);
		this.isSpider = isSpider;
	}
	
	public SpiderMan(String name, boolean isSpider, Spider spider) {
		this(name, isSpider);
		this.spider = spider;
	}
	
	
	public void fierWeb() {
		System.out.println("어떻게 쏘지??");
		if(this.isSpider) {
			this.spider.fierWeb();
		}else {
			System.out.println("사람이면 못쏴요");
		}
	}
	
	
	//method override
	public void jump() {
		if (this.isSpider) {
			this.spider.jump();
		}else {
			super.jump();
		}
	}

}
