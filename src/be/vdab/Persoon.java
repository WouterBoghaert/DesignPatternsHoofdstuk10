package be.vdab;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persoon {
    private String voornaam;
    private String familienaam;
    private String titel;
    public Persoon(String voornaam, String familienaam, String titel){
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.titel = titel;
    }
    public String getVoornaam(){
        return voornaam;
    }
    public String getFamilienaam(){
        return familienaam;
    }
    public String getTitel(){
        return titel;
    }
    public String maakBriefHoofding(AansprekingsAlgoritme algoritme){
        StringBuilder builder = new StringBuilder();
        builder.append("Brussel, ");
        LocalDate vandaag = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        builder.append(formatter.format(vandaag));
        builder.append("\n");
        builder.append(algoritme.getAanspreking(this));
        builder.append("\n");
        return builder.toString();
    }
}
