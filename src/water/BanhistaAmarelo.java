package water;

import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;

public class BanhistaAmarelo extends Banhista{
    private Image icon;

    public BanhistaAmarelo(int x, int y){
        icon = new ImageIcon("src/Imagens/banhistaa.png").getImage();
        super.setIcon(icon); //passa os valores para a classe Banhista
        super.setX(x);
        super.setY(y);
        super.setPeso(2);
    }
}