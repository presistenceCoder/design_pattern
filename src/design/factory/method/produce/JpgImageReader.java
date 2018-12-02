package design.factory.method.produce;

 /**
 * @Description:具体jpg图片读取器
 * @author 向德勇
 * Date : 2018年11月29日  上午12:24:25
 */

public class JpgImageReader implements ImageReader{
	public JpgImageReader(){
		System.out.println("jpg读取器被创建");
	}
	
	@Override
	public void readImage() {
		System.out.println("只读取jpg图像");
	}

}
