package Praktikum6.Tugas;

public class TestTiket {
    public static void main(String[] args) {
        TiketKereta tiketKereta = new TiketKereta(
                "KA-001", "Andi", "Malang", "Jakarta", 350000, 3, "12A");
        tiketKereta.tampilKereta();

        TiketDomestik tiketDomestik = new TiketDomestik(
                "GA-102", "Sinta", "Surabaya", "Denpasar", 900000,
                "Garuda Indonesia", 25, 75000);
        tiketDomestik.tampilDomestik();

        TiketInternasional tiketInternasional = new TiketInternasional(
                "SQ-205", "Budi", "Jakarta", "Singapura", 2500000,
                "Singapore Airlines", 20, "C1234567", 150000);
        tiketInternasional.tampilInternasional();
    }
}
