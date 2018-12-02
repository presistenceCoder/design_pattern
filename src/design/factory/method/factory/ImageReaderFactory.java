package design.factory.method.factory;

import design.factory.method.produce.ImageReader;

/**
 * @Description:抽象图像读取器工厂类
 * @author 向德勇
 * Date : 2018年11月29日  上午12:16:59
 */

public interface ImageReaderFactory {
	/**
	 * 创建图片读取器
	 * @param
	 * @return
	 */
	 ImageReader creatImageReader();
}
