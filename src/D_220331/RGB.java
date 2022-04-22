package D_220331;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RGB 
{

	public static void main(String[] args) throws IOException 
	{
		File ifile = new File("sky.jpg");
		BufferedImage myImage = ImageIO.read(ifile);
		int width = myImage.getWidth();
		int height = myImage.getHeight();
		
		for (int y = 0; y < height; y++)//높이 만큼 
		{
			for (int x = 0; x < width; x++)//너비 만큼 
			{
				Color c = new Color(myImage.getRGB(x,y));//x,y좌표의 픽셀의 컬러값을 가져온다
				int red = (int)(0.299 * c.getRed());//해당 픽셀의 RGB값을 가져와서 gray스케일 공식을 적용한다
				int green = (int)(0.587 * c.getRed());
				int blue = (int)(0.114 * c.getRed());
				int gray = red + green + blue;
				Color grayColor = new Color(gray,gray,gray);//gray 컬러값으로 color객체를 새로 생성
				
				myImage.setRGB(x, y, grayColor.getRGB());
			}
		}
		
		File newFile = new File("gray_sky.jpg");//새로 파일에 쓸 객체를 생성
		ImageIO.write(myImage, "jpg", newFile);//write 메소드를 호출: 변환된 myImage파일을 jpg형식으로 newFile에 씀
		
		System.out.println("변환 완료");
		
	}

}