package dev.android.cl.colorpalette.color;

/**
 * Created by fran on 15-02-16.
 */
public class MaterialColor {

    private int color;
    private String name;
    private String HEX;

    public MaterialColor() {
    }

    public MaterialColor(int color) {
        this.color = color;
    }

    public MaterialColor(int color, String name, String HEX) {
        this.color = color;
        this.name = name;
        this.HEX = HEX;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHEX() {
        return HEX;
    }

    public void setHEX(String HEX) {
        this.HEX = HEX;
    }
}
