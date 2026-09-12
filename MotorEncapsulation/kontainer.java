package MotorEncapsulation;

public class kontainer {
    private String NoResi;
    private String NamaPemilik;
    private int KapasitasMaksimal;
    private int BeratMuatanSaatIni;

    public kontainer(String NoResi, String NamaPemilik, int KapasitasMaksimal) {
        this.NoResi = NoResi;
        this.NamaPemilik = NamaPemilik;
        this.KapasitasMaksimal = KapasitasMaksimal;
        this.BeratMuatanSaatIni = 0;
    }

    public String getNamaPemilik() {
        return NamaPemilik;
    }

    public int getBeratMuatanSaatIni() {
        return BeratMuatanSaatIni;
    }

    public int getKapasitasMaksimal() {
        return KapasitasMaksimal;
    }

    public void tambahMuatan(int berat) {
        if (BeratMuatanSaatIni + berat > KapasitasMaksimal) {
            System.out.println("Tidak dapat menambahkan muatan. TERLALU BERAT!");
        } else {
            BeratMuatanSaatIni += berat;
            System.out.println("Muatan berhasil ditambahkan.");
        }
    }

    public void turunkanMuatan(int berat) {
        if (BeratMuatanSaatIni - berat < 0) {
            System.out.println("Tidak dapat menurunkan muatan. Berat muatan saat ini tidak mencukupi.");
        } else if (BeratMuatanSaatIni - berat > KapasitasMaksimal / 2) {
            System.out.println(
                    "Maaf, demi keselamatan, pembongkaran muatan satu kali jalan tidak boleh melebihi 50% dari muatan saat ini.");
        } else {
            BeratMuatanSaatIni -= berat;
            System.out.println("Muatan berhasil diturunkan.");
        }
    }
}
