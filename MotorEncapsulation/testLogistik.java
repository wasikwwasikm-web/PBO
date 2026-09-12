package MotorEncapsulation;

import java.util.Scanner;

public class testLogistik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        kontainer kontainerAlfa = new kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        System.out.print("\nMasukkan berat muatan yang ingin ditambahkan (kg): ");
        int tambah1 = sc.nextInt();
        kontainerAlfa.tambahMuatan(tambah1);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan berat muatan yang ingin dibongkar (kg): ");
        int bongkar1 = sc.nextInt();
        kontainerAlfa.turunkanMuatan(bongkar1);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
    }
}
