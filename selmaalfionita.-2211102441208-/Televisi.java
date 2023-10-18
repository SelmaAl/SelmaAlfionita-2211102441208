import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Televisi extends Actor implements InterfaceElektronik, InterfaceChannelTV {
    private boolean mesin;
    private String merk;
    private boolean listrik;
    
    public Televisi(String merk) {
        this.merk = merk;
        mesin = false;
        listrik = false;
    }
    
    public void on() {
        mesin = true;
    }
    
    public void off() {
        mesin = false;
    }
    
    public void gantiChannel(int c) {
        // Implementasi penggantian channel pada televisi
    }
    
    public void act() {
        // Implementasi perilaku aktor Televisi di setiap siklus aksi
    }

}
