package water;

import java.awt.Image;
import javax.swing.ImageIcon;

public class BanhistaAmarelo extends Banhista{
    private Image icon;
    private Image salvo;

    public BanhistaAmarelo(int x, int y){
        icon = new ImageIcon("src/Imagens/banhistaa.png").getImage();
        salvo = new ImageIcon("src/Imagens/salvoa.png").getImage();
        super.setIcon(icon); //passa os valores para a classe Banhista
        super.setIconsalvo(salvo);
        super.setX(x);
        super.setY(y);
        super.setPeso(2);
        super.setSalvo(0);
    }
}