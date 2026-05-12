// ============================================================
// Kelas BankBNI - Method Overriding
// ============================================================
public class BankBNI extends Bank {

    // Override sukuBunga: BNI = 4%
    @Override
    public void sukuBunga() {
        System.out.println("Suku Bunga BNI adalah 4%");
    }

    // Override transferUang(jumlah, rekeningTujuan, bankTujuan)
    // Bank tujuan otomatis diset ke "BNI"
    @Override
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        bankTujuan = "BNI"; // override: bank tujuan selalu BNI
        System.out.println("=== [BankBNI] Transfer ke Bank Lain ===");
        System.out.println("Rekening Tujuan : " + rekeningTujuan);
        System.out.println("Bank Tujuan     : " + bankTujuan);
        System.out.println("Jumlah Transfer : Rp " + jumlah);
        System.out.println("Biaya Transfer  : Rp " + hitungBiayaTransfer(bankTujuan));
        System.out.println("Status          : Berhasil");
        System.out.println();
    }
}
