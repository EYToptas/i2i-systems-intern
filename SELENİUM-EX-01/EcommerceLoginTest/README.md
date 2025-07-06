# E-Ticaret Giriş Otomasyonu (Selenium + Java)

Bu proje, Selenium kullanılarak Java diliyle yazılmış basit bir test otomasyonudur. Amaç, bir e-ticaret sitesinde kullanıcı girişini otomatikleştirmektir.

---

## 📌 Proje Bilgileri

- **Test Edilen Site:** [SauceDemo](https://www.saucedemo.com/)
- **Senaryo:** Kullanıcının giriş yapmasının otomatik test edilmesi
- **Kullanılan Dil:** Java
- **Yapı Aracı:** Maven
- **Kütüphaneler:**
  - Selenium Java
  - WebDriverManager

---

## ✅ Test Senaryosu Adımları

1. `https://www.saucedemo.com/` adresine git
2. Kullanıcı adı gir: `standard_user`
3. Şifre gir: `secret_sauce`
4. Giriş (Login) butonuna tıkla
5. Girişin başarılı olduğunu kontrol et (URL içinde `inventory` kelimesi aranır)

---

## 🚀 Çalıştırma Talimatları

1. Java JDK ve Maven kurulu olmalı
2. IntelliJ IDEA ile projeyi aç
3. Gerekli kütüphaneler `pom.xml` dosyasından otomatik yüklenecektir
4. `LoginTest.java` dosyasını çalıştır
5. Chrome tarayıcısı otomatik açılır ve test gerçekleşir

---

## 📎 Notlar

- WebDriverManager sayesinde elle driver indirmeye gerek yoktur
- SauceDemo, demo login testleri için ideal bir platformdur
- Test sonucu başarılıysa `Login successful!` çıktısı console’da görülür

---



