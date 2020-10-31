/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan23NilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int banyakMhs,max, min;
        
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("====Program Nilai terbesar dan terkecil nilai mahasiswa====");
        System.out.printf("Masukan nama petugas: ");
        String namaPetugas = scanner.next();
        
        System.out.printf("Masukan banyaknya mahasiswa: ");
        banyakMhs = scanner.nextInt();
        
        int[] nilaiMhs = new int[banyakMhs];
        
        for (int i = 0; i < banyakMhs; i++){
            System.out.printf("nilai mahasiswa ke-" + (i+1) +": ");
            nilaiMhs[i] = scanner.nextInt();

        }
        max = nilaiMhs[0];
        min = nilaiMhs[0];
        for (int i = 0; i < banyakMhs; i++){
            if(nilaiMhs[i] > max){
                max = nilaiMhs[i];
            }
            else if (nilaiMhs[i] < min){
                min = nilaiMhs[i];
            }
        }
        System.out.println("Nilai max = " + max);
        System.out.println("Nilai min = " + min);
    }
    
}
