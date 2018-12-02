package design.factory.method.produce;

 /**
 * @Description:具体Gif图片读取器
 * @author 向德勇
 * Date : 2018年11月29日  上午12:24:08
 */

public class GifImageReader implements ImageReader{

	@Override
	public void readImage() {
		System.out.println("只读取gif图片");
	}
	public GifImageReader(){
		System.out.println("gif图片读取器创建");
	}

}
