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
public class BanhistaVerde extends Banhista {
    private Image icon;
    private int xa, ya;

    public BanhistaVerde(int x0, int x1, int y0, int y1){
        icon = new ImageIcon("src/Imagens/banhista.png").getImage();
        geraVals(x0, x1, y0, y1);
        super.setIcon(icon);
        super.setX(xa);
        super.setY(ya);
        super.setPeso(1);
    }
    

    public int getXa() {
        return xa;
    }

    public void setXa(int xa) {
        this.xa = xa;
    }

    public int getYa() {
        return ya;
    }

    public void setYa(int ya) {
        this.ya = ya;
    }
    

    private void geraVals(int x0, int x1, int y0, int y1) {
        Random ran = new Random();
        setYa(ran.nextInt(y1-y0)+y0);
        setXa(ran.nextInt(x1-x0)+x0);
        System.out.println(ya);
        System.out.println(xa);
    }
    
}
