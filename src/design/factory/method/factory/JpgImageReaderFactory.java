package design.factory.method.factory;

import design.factory.method.produce.ImageReader;
import design.factory.method.produce.JpgImageReader;

/**
 * @Description:Jpg图像读取器工厂类实体
 * @author 向德勇
 * Date : 2018年12月1日  下午11:37:42
 */

public class JpgImageReaderFactory implements ImageReaderFactory{

	@Override
	public ImageReader creatImageReader() {
		return new JpgImageReader();
	}
	
}
