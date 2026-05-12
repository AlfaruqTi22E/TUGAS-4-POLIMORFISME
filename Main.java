// ============================================================
// Kelas Main - Pengujian Method Overloading & Overriding
// ============================================================
public class Main {
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("     PROGRAM TRANSAKSI PERBANKAN");
        System.out.println("        Konsep Polimorfisme Java");
        System.out.println("========================================\n");

        // ---- 1. Uji Method Overloading pada kelas Bank ----
        System.out.println(">>> KELAS BANK (Method Overloading) <<<\n");
        Bank bank = new Bank();

        // Suku bunga standar
        bank.sukuBunga();
        System.out.println();

        // Variasi 1: transfer sesama bank
        bank.transferUang(500000, "1234567890");

        // Variasi 2: transfer ke bank lain
        bank.transferUang(1000000, "0987654321", "BNI");

        // Variasi 3: transfer ke bank lain + berita
        bank.transferUang(2000000, "1122334455", "BCA", "Pembayaran sewa bulan Mei");

        // ---- 2. Uji Method Overriding pada BankBNI ----
        System.out.println(">>> KELAS BankBNI (Method Overriding) <<<\n");
        BankBNI bni = new BankBNI();

        bni.sukuBunga();
        System.out.println();

        // Overloading variasi 1 (diwarisi dari Bank)
        bni.transferUang(750000, "1111222233");

        // Overriding variasi 2 (bank tujuan otomatis "BNI")
        bni.transferUang(1500000, "4444555566", "apa saja - akan jadi BNI");

        // Overloading variasi 3 (diwarisi dari Bank)
        bni.transferUang(3000000, "7777888899", "BCA", "Transferan proyek");

        // ---- 3. Uji Method Overriding pada BankBCA ----
        System.out.println(">>> KELAS BankBCA (Method Overriding) <<<\n");
        BankBCA bca = new BankBCA();

        bca.sukuBunga();
        System.out.println();

        // Overloading variasi 1 (diwarisi dari Bank)
        bca.transferUang(250000, "9999000011");

        // Overriding variasi 2 (bank tujuan otomatis "BCA")
        bca.transferUang(2500000, "2233445566", "apa saja - akan jadi BCA");

        // Overloading variasi 3 (diwarisi dari Bank)
        bca.transferUang(5000000, "6677889900", "BNI", "Gaji bulan Mei");

        // ---- 4. Demo Polimorfisme (referensi Bank) ----
        System.out.println(">>> DEMO POLIMORFISME (Referensi Bank) <<<\n");
        Bank[] bankList = { new Bank(), new BankBNI(), new BankBCA() };
        for (Bank b : bankList) {
            b.sukuBunga(); // memanggil method yang tepat sesuai objek nyata
        }
    }
}
