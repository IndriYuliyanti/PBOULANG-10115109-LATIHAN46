/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan46.tandanyakamu;
import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author nama : indri yuliyanti
 *          nim ; 10115109
 *          kelas : pbo ulng
 *          tugas pbo pert 4 kriterian berdasarkan umur
 */
public class Pboulang10115109Latihan46Tandanyakamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int yearnow = Calendar.getInstance().get(Calendar.YEAR);
        Age age1 = new Age (yearnow);
        System.out.print("masukan tahun lahir anda :");
        Scanner input = new Scanner(System.in);
        int yearbirth = input.nextInt();
        age1.setYearbirth(yearbirth);
        System.out.print("kamu" + age1.tandanyakamu(age1.hitungumur())+"\n\n");
        
        
        
        
    }
    
}
