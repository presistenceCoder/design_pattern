package design.singleton;

/**
 * @Description: 单例设计模式
 * 作用：确保该对象在项目生命周期内唯一实例
 * 举例：windows系统任务管理器
 * @author:向德勇
 * @date:2018年11月27日
 */
public class Singleton {
	
	/**
	 * 私有构造
	 */
	private Singleton(){}
	
	/**
	 * @Description: 静态内部类在外部类初始化时不会初始化
	 */
	private static class InnerClass{
		/**
		 * 静态变量，在初始化时由虚拟机保证线程安全
		 */
		private static Singleton singleton = new Singleton();
	}
	
	/**
	 * @Description:通过调用内部类静态变量触发内部类初始化
	 * 达到 懒加载+线程安全 效果
	 * @param:
	 * @return Singleton 单例对象实例
	 */
	public static Singleton getSingletonInstance(){
		return InnerClass.singleton;
	}
}         

