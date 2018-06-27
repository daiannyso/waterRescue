/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package water;

import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author rafae
 */
public class BanhistaVermelho extends Banhista{
    private Image icon;

    public BanhistaVermelho(int x, int y){
        icon = new ImageIcon("src/Imagens/banhistavm.png").getImage();
        super.setIcon(icon); //passa os valores para a classe Banhista
        super.setX(x);
        super.setY(y);
        super.setPeso(3);
        super.setSalvo(0);
    }
}
