package MotorEncapsulation;

public class testLogistik {

    public static void main(String[] args) {
        kontainer kontainerAlfa = new kontainer("REQ-9988", "PT. Maju Bersama", 10000);

        System.out.println("Nama Pemilik Kontainer:  " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Kontainer: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        System.out.println("\nMasukkan muatan baru seberat 6000 kg...");
        kontainerAlfa.tambahMuatan(6000);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.println("\nMasukkan muatan baru seberat 4000 kg...");
        kontainerAlfa.tambahMuatan(4000);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.println("\nMembongkar muatan seberat 6000 kg...");
        kontainerAlfa.turunkanMuatan(6000);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
    }
}
