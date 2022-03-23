package Proxy;

import java.net.URL;

/**
 * Name: Donghang He
 * Date: 2022/3/22 9:41 下午
 * Description:
 */
public class ImageViewer {
    public static void main(String[] args) throws Exception {
        String image = "http://image.jpg";
        URL url = new URL(image);
        HighResolutionImage highResolutionImage = new HighResolutionImage(url);
        ImageProxy imageProxy = new ImageProxy(highResolutionImage);
        imageProxy.showImage();
    }
}
