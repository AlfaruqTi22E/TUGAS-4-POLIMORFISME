// ============================================================
// Kelas BankBCA - Method Overriding
// ============================================================
public class BankBCA extends Bank {

    // Override sukuBunga: BCA = 4.5%
    @Override
    public void sukuBunga() {
        System.out.println("Suku Bunga BCA adalah 4.5%");
    }

    // Override transferUang(jumlah, rekeningTujuan, bankTujuan)
    // Bank tujuan otomatis diset ke "BCA"
    @Override
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        bankTujuan = "BCA"; // override: bank tujuan selalu BCA
        System.out.println("=== [BankBCA] Transfer ke Bank Lain ===");
        System.out.println("Rekening Tujuan : " + rekeningTujuan);
        System.out.println("Bank Tujuan     : " + bankTujuan);
        System.out.println("Jumlah Transfer : Rp " + jumlah);
        System.out.println("Biaya Transfer  : Rp " + hitungBiayaTransfer(bankTujuan));
        System.out.println("Status          : Berhasil");
        System.out.println();
    }
}
