package springico2;

public class Rabbit {
	static{
		System.out.println("class loading");
	}
	{
		System.out.println("instance creation");
	}
	public void init() {
		System.out.println("init method is load");
	}
	public void destroy() {
		System.out.println("destroy method is load");
	}
	

}
