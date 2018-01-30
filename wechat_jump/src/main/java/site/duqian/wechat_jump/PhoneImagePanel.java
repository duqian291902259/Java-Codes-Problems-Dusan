package site.duqian.wechat_jump;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import static site.duqian.wechat_jump.Utils.IMAGE_PATH;

public class PhoneImagePanel extends JPanel {

    private static final long serialVersionUID = 1L;

    private Image image = null;

    @Override
    public void paint(Graphics g) {
        try {
            Utils.screen();
            //这个路径需要自己设定
            image = ImageIO.read(new File(IMAGE_PATH));
            //这个图像展示大小需要自己设定，这里用的是Pixel手机1080*1920，我缩减一半
            //720*1280
            g.drawImage(image, 0, 0, 360, 640, null);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
