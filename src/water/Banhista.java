package water;

import java.awt.Image;
//classe abstrata com informações basicas sobre o banhista
public abstract class Banhista {
    private int x, y, peso; //x, y -> posições / peso -> cor
    private Image icon;
    private Image iconsalvo;//icon -> imagem
    private int salvo;

    public int getSalvo() {
        return salvo;
    }

    public void setSalvo(int salvo) {
        this.salvo = salvo;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Image getIcon() {
        return icon;
    }

    public void setIcon(Image icon) {
        this.icon = icon;
    }

    public Image getIconsalvo() {
        return iconsalvo;
    }

    public void setIconsalvo(Image iconsalvo) {
        this.iconsalvo = iconsalvo;
    }
    
    
    
}
