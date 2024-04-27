Soal 1:
- Praktikkan penggunakan [OpenAI Playground](https://platform.openai.com/playground)
- Bisa menggunakan salah satu template yang ada di [platform.openai.com/examples](https://platform.openai.com/examples)
- Screenshot hasilnya (pastikan semua yang ada di layar masuk ke dalam screenshot)
- Copy-paste input & output (text yang ada di dalam textbox) ke file txt
- Kumpulkan hasil screenshot dan file txt seperti biasa

Jawaban: 
- Hasil screenshoot generate OpenAI ada pada folder screenshoot.

- Command: anda seorang quality assurance engineer pada aplikasi tokopedia, buatkan 3 test case positif dan negatif pada fitur utama yang terdapat di dalam aplikasi tokopedia.

- Berikut ini jawaban dari hasil generate pada website OpenAI, dikarenakan saat menggunakan OpenAI Playground tidak bisa melakukan generate dengan keterangan (You've reached your usage limit. See your usage dashboard and billing settings for more details. If you have further questions, please contact us through our help center at help.openai.com).

Tentu, berikut ini adalah contoh tiga test case positif dan tiga test case negatif untuk fitur utama di aplikasi Tokopedia:

Test Case Positif:

1. Pencarian Produk Berhasil:
   - Langkah:
     1. Buka aplikasi Tokopedia.
     2. Masukkan kata kunci "sepatu" pada kolom pencarian.
     3. Tekan tombol pencarian.

   - Hasil yang diharapkan:
    - Daftar produk sepatu muncul dengan berbagai pilihan, sesuai dengan kata kunci yang dimasukkan.

2. Menambahkan Produk ke Keranjang:
   - Langkah:
     1. Buka halaman detail produk yang ingin dibeli.
     2. Pilih opsi ukuran/warna (jika ada).
     3. Tekan tombol "Tambahkan ke Keranjang".

   - Hasil yang diharapkan:
    - Produk berhasil ditambahkan ke keranjang belanja pengguna.

3. Proses Pembayaran Sukses:
   - Langkah:
     1. Buka keranjang belanja.
     2. Pilih produk yang ingin dibeli.
     3. Tekan tombol "Beli Sekarang".
     4. Pilih metode pembayaran dan masukkan informasi yang diperlukan.
     5. Konfirmasi pembayaran.

   - Hasil yang diharapkan:
    - Pesanan berhasil diproses dan pengguna menerima konfirmasi pembayaran.

Test Case Negatif:

1. Pencarian Produk Gagal:
   - Langkah:
     1. Buka aplikasi Tokopedia.
     2. Masukkan kata kunci yang tidak valid atau tidak relevan.
     3. Tekan tombol pencarian.

   - Hasil yang diharapkan:
    - Tidak ada produk yang ditemukan atau muncul pesan yang jelas bahwa hasil pencarian tidak ditemukan.

2. Stok Produk Habis:
   - Langkah:
     1. Pilih produk yang ingin dibeli.
     2. Cek ketersediaan stok.
     3. Jika stok habis, coba tambahkan produk ke keranjang.

   - Hasil yang diharapkan:
    - Muncul pesan yang menjelaskan bahwa produk tidak tersedia karena stok habis.

3. Pembayaran Gagal:
   - Langkah:
     1. Buka keranjang belanja.
     2. Pilih produk yang ingin dibeli.
     3. Tekan tombol "Beli Sekarang".
     4. Pilih metode pembayaran.
     5. Masukkan informasi pembayaran yang salah atau tidak valid.
     6. Konfirmasi pembayaran.

   - Hasil yang diharapkan:
    - Muncul pesan yang menjelaskan bahwa pembayaran gagal dan memberi petunjuk untuk memperbaiki informasi pembayaran.