package be.vdab;

import java.util.Scanner;

public class OversteekMain {
    public static void main(String[] args) {
        int windsnelheid;
        int temperatuur;
        System.out.println("Geef de windsnelheid op");
        Scanner sc = new Scanner(System.in);
        windsnelheid = sc.nextInt();
        System.out.println("Geef de temperatuur op");
        temperatuur = sc.nextInt();
        
        OversteekMethode oversteekMethode = new OversteekBeslissing().getBeslissing(temperatuur, windsnelheid);
        System.out.println(oversteekMethode.getOversteek((methode) -> methode.getMethode()));
    }

    
}
