package be.vdab;
public class OversteekBeslissing {
    public OversteekMethode getBeslissing(int temperatuur, int windsnelheid){
        if (temperatuur < -5){
            return new Ijsschaatsen();
        }
        else {
            if (windsnelheid < 20){
                return new Motorboot();
            }
            else {
                return new Zeilen();
            }
        }
    }            
}
