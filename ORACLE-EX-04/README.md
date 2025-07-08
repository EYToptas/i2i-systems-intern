# ORACLEDB-EX-04: Java Uygulaması ile Oracle Veritabanına Veri Ekleme

## 🔍 Açıklama
Bu ödevde, Java kullanarak Oracle veritabanına JDBC aracılığıyla bağlanılmakta ve `BOOK` tablosuna 100 adet örnek kayıt eklenmektedir. `NAME` ve `ISBN` alanları için rastgele veriler kullanılmıştır.

## 🔧 Gereksinimler
- Java JDK 17+ (Temurin 21 kullanıldı)
- Oracle JDBC Sürücüsü (`ojdbc11.jar`)
- Oracle veritabanı (Docker ile kuruldu)
- `BOOK` tablosu oluşturulmuş olmalıdır

## 📁 Klasör Yapısı
```
oracle-jdbc/
├── BookDataInserter.java
├── ojdbc11.jar
```

## ✍️ Java Dosyası
Java uygulaması, JDBC ile bağlantı kurarak veritabanına 100 adet veri ekler. 

## 📆 Tablo Yapısı (`BOOK`)
```sql
CREATE TABLE BOOK (
  ID NUMBER,
  NAME VARCHAR2(128),
  ISBN VARCHAR2(32),
  CREATE_DATE DATE DEFAULT SYSDATE
);
```

## 🚀 Çalıştırma Adımları
1. 
```bash
cd C:\Users\Yusuf\oracle-jdbc
```
2. Derleme:
```bash
javac -cp "ojdbc11.jar" BookDataInserter.java
```
3. Çalıştırma:
```bash
java -cp ".;ojdbc11.jar" BookDataInserter
```

## ✅ Sonuç
Program başarıyla çalıştığında veritabanındaki `BOOK` tablosuna 100 adet kayıt eklenmiş olacaktır.

## 📄 Notlar
- Şifre, kullanıcı adı ve bağlantı bilgileri kod içinde doğru girilmelidir.
- `ojdbc11.jar` dosyası Oracle Developer sitesinden indirilebilir.

---

Tarih: 08.07.2025
