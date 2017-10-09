package be.vdab;
public abstract class OversteekMethode {
    public String getOversteek(OversteekAlgoritme algoritme){
        return "Inpakken\n" + algoritme.getOversteekMethode(this) + "\nUitpakken";
    }
    public abstract String getMethode();
}
