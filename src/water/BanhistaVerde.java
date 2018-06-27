package water;

import java.awt.Image;
import javax.swing.ImageIcon;

public class BanhistaVerde extends Banhista {
    private Image icon;
    private Image salvo;

    public BanhistaVerde(int x, int y){
        icon = new ImageIcon("src/Imagens/banhistav.png").getImage();
        salvo = new ImageIcon("src/Imagens/salvov.png").getImage();
        super.setIcon(icon); //passa os valores para a classe Banhista
        super.setIconsalvo(salvo);
        super.setX(x);
        super.setY(y);
        super.setPeso(1);
        super.setSalvo(0);
    }
}
