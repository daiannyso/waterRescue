/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package water;

import java.awt.Image;
import javax.swing.ImageIcon;

public class BanhistaVermelho extends Banhista{
    private Image icon;
    private Image salvo;

    public BanhistaVermelho(int x, int y){
        icon = new ImageIcon("src/Imagens/banhistavm.png").getImage();
        salvo = new ImageIcon("src/Imagens/salvovm.png").getImage();
        super.setIcon(icon); //passa os valores para a classe Banhista
        super.setIconsalvo(salvo);
        super.setX(x);
        super.setY(y);
        super.setPeso(3);
        super.setSalvo(0);
    }
}
