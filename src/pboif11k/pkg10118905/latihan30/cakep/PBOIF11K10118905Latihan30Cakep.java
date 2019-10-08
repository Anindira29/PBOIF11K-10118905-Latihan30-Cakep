/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif11k.pkg10118905.latihan30.cakep;

import java.util.Scanner;
/**
 *
 * @author Fitri
 */
public class PBOIF11K10118905Latihan30Cakep {

    /**
     * @param args the command line arguments
     */
    
    public static final String TXT_MERAH = "\u001B[31m";
    public static final String TXT_HIJAU = "\u001B[32m";
    public static final String TXT_KUNING = "\u001B[33m";
    public static final String TXT_BIRU = "\u001B[34m";
    public static final String TXT_UNGU = "\u001B[35m";
    public static final String TXT_CYAN = "\u001B[36m";
    public static final String TXT_PUTIH = "\u001B[37m";
    public static final String DEFAULT = "\u001B[0m";
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.println(TXT_MERAH+"Kamu "+TXT_HIJAU+"Ngerjain sendiri "+TXT_KUNING+"Latihan 17 "+TXT_BIRU+"sampe latihan 30 ini?");
        System.out.println("jawab"+TXT_MERAH+"(Yoi/Engga) :");
        String jawaban = sc.next();
        System.out.println();
        switch (jawaban.toLowerCase()){
            case "yoi":
                System.out.println(TXT_MERAH+"Cakep Bener."+TXT_UNGU+"Good Joob");
                break;
            case "engga":
                System.out.println(TXT_MERAH+"Tetep cakep sih.");
                System.out.println(TXT_CYAN+"Sing penting paham konsepnya yee");
                System.out.println(DEFAULT+"Keep the code work dude");
                break;
            default:
                System.out.println("Apaan si gajelas");
                break;
        }
    }    
    
}
