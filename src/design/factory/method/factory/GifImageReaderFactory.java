package design.factory.method.factory;

import design.factory.method.produce.GifImageReader;
import design.factory.method.produce.ImageReader;

/**
 * @Description:Gif图像读取器工厂实体
 * @author 向德勇
 * Date : 2018年11月29日  上午12:23:12
 */

public class GifImageReaderFactory implements ImageReaderFactory{

	@Override
	public ImageReader creatImageReader() {
		return new GifImageReader();
	}

}
