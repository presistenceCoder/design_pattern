package design.factory.method;

import design.factory.method.factory.GifImageReaderFactory;
import design.factory.method.factory.ImageReaderFactory;
import design.factory.method.produce.ImageReader;

/**
 * @Description:方法工厂测试类
 * @author 向德勇
 * Date : 2018年12月1日  下午11:40:14
 */

public class Test {

	public static void main(String[] args) {
			//每增加一个产品都需要增加一个具体工厂类和一个具体产品类
			ImageReaderFactory imageReaderFactory = new GifImageReaderFactory();
			ImageReader imageReader =imageReaderFactory.creatImageReader();
			imageReader.readImage();
	}

}
