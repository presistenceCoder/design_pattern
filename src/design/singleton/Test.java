package design.singleton;

/**
 * @Description:
 * @author:向德勇
 * @date:2018年11月27日
 */
public class Test {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getSingletonInstance();
		Singleton singleton2 = Singleton.getSingletonInstance();
		Singleton singleton3 = Singleton.getSingletonInstance();
		if(singleton1== singleton2 && singleton1 == singleton3){
			System.out.println("单例模式");
		}
	}
}
