/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan46.tandanyakamu;

/**
 *
 * @author nama : indri yuliyanti
 *          nim ; 10115109
 *          kelas : pbo ulng
 *          tugas pbo pert 4 kriterian berdasarkan umur
 */
public class Age {
    private int yearbirth;
    private int yearnow;
    private String red;
    
    public Age(){
    }
    
    public Age(int yearnow){
        this.yearnow = yearnow;
    }

    public int getYearbirth() {
        return yearbirth;
    }

    public void setYearbirth(int yearbirth) {
        this.yearbirth = yearbirth;
    }

    public int getYearnow() {
        return yearnow;
    }

    public int hitungumur(){
        int umur;
        umur = yearnow - yearbirth;
        return umur;
    }
    public String tandanyakamu(int umur){
        if(umur > 0 && umur < 150){
            
            if (umur <= 5 ){
                red = "lagi lucu lucnya ";
            }
            else 
                if (umur <= 10){
                    red = "masih anak- anak";
                    
                }
            
            
            else 
                if (umur <=13){
                    red = "masih remaja";
                    
                }
            
             else 
                if (umur <=19){
                    red = "alay";
                    
                }
             else 
                if (umur <=29){
                    red = "lagi galau nyari jodoh";
                    
                }
            else
                               if (umur <=35){
                                   red = "Lagi Sibuk Nyari Uang";
                                   
                               }
           else
                                   if (umur <=150){
                                       red = "Sudah Tua";
                                       
                                   }
           else
                                       {
                                           red = "Tidak Terdektesi Di Kehidupan";
                                       }
       }
       return red;
        }
}
    
    
    