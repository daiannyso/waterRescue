package water;

import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;

public class BanhistaVerde extends Banhista {
    private Image icon;

    public BanhistaVerde(int x, int y){
        icon = new ImageIcon("src/Imagens/banhistav.png").getImage();
        super.setIcon(icon); //passa os valores para a classe Banhista
        super.setX(x);
        super.setY(y);
        super.setPeso(1);
        super.setSalvo(0);
    }
}
