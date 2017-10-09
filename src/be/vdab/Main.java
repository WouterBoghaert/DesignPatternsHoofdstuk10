package be.vdab;
public class Main {
    public static void main(String[] args) {
        Persoon[] personen = new Persoon[]{
            new Persoon("Jean","Smits","heer"),
            new Persoon("Jeanine","Desmet","mevrouw")};
        //briefhoofdingen met informele aansprekingen:
        for (Persoon persoon: personen){
//            System.out.println(persoon.maakBriefHoofding((pers) ->
//            "Dag " + pers.getVoornaam()));
            System.out.println(persoon.maakBriefHoofding((pers) ->
            informeel(pers.getVoornaam())));
        }
        //briefhoofdingen met formele aansprekingen:
        for(Persoon persoon: personen){
//            System.out.println(persoon.maakBriefHoofding((pers) ->
//            "Geachte " + pers.getTitel() + " " + pers.getFamilienaam()));
            System.out.println(persoon.maakBriefHoofding((pers) ->
            formeel(pers.getFamilienaam(),pers.getTitel())));
        }
    }
    private static String informeel(String voornaam){
        return "Dag " + voornaam;
    }
    private static String formeel(String familienaam, String titel){
        return "Geachte " + titel + " " + familienaam;
    }    
}
