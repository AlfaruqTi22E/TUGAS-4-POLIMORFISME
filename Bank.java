// ============================================================
// Kelas Bank - Method Overloading + sukuBunga()
// ============================================================
public class Bank {

    // ---- Method Overloading: transferUang ----

    // Variasi 1: transfer ke rekening lain (bank yang sama)
    public void transferUang(int jumlah, String rekeningTujuan) {
        System.out.println("=== Transfer Antar Rekening (Bank Sama) ===");
        System.out.println("Rekening Tujuan : " + rekeningTujuan);
        System.out.println("Jumlah Transfer : Rp " + jumlah);
        System.out.println("Biaya Transfer  : Rp " + hitungBiayaTransfer("SAMA"));
        System.out.println("Status          : Berhasil");
        System.out.println();
    }

    // Variasi 2: transfer ke rekening lain di bank berbeda
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("=== Transfer ke Bank Lain ===");
        System.out.println("Rekening Tujuan : " + rekeningTujuan);
        System.out.println("Bank Tujuan     : " + bankTujuan);
        System.out.println("Jumlah Transfer : Rp " + jumlah);
        System.out.println("Biaya Transfer  : Rp " + hitungBiayaTransfer(bankTujuan));
        System.out.println("Status          : Berhasil");
        System.out.println();
    }

    // Variasi 3: transfer ke bank lain dengan tambahan berita
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan, String berita) {
        System.out.println("=== Transfer ke Bank Lain dengan Berita ===");
        System.out.println("Rekening Tujuan : " + rekeningTujuan);
        System.out.println("Bank Tujuan     : " + bankTujuan);
        System.out.println("Jumlah Transfer : Rp " + jumlah);
        System.out.println("Biaya Transfer  : Rp " + hitungBiayaTransfer(bankTujuan));
        System.out.println("Berita          : " + berita);
        System.out.println("Status          : Berhasil");
        System.out.println();
    }

    // ---- sukuBunga (dapat di-override oleh subkelas) ----
    public void sukuBunga() {
        System.out.println("Suku Bunga standar adalah 3%");
    }

    // ---- Bonus: hitung biaya transfer berdasarkan bank tujuan ----
    public int hitungBiayaTransfer(String bankTujuan) {
        switch (bankTujuan.toUpperCase()) {
            case "BNI":  return 6500;
            case "BCA":  return 6500;
            case "SAMA": return 0;
            default:     return 5000;
        }
    }
}
