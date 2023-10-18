import greenfoot.*; 
public class Radio extends Actor implements InterfaceElektronik, InterfaceChannelRadio {
    private boolean mesin;
    private int volume;
    
    public Radio() {
        mesin = false;
        volume = 0;
    }
    
    public void on() {
        mesin = true;
    }
    
    public void off() {
        mesin = false;
    }
    
    public void gantiChannel(int c) {
        // Implementasi penggantian channel pada radio
    }
    
    public void perbesarVolume() {
        // Implementasi peningkatan volume pada radio
    }
    
    public void perkecilVolume() {
        // Implementasi penurunan volume pada radio
    }
    
    public void act() {
        // Implementasi perilaku aktor Radio di setiap siklus aksi
    }
}
