# ORACLEDB-EX-03 - Oracle SQL Developer ile Bağlantı ve BOOK Tablosu Oluşturma

## 📌 Amaç
Oracle SQL Developer kullanarak Oracle veritabanına bağlanmak ve `BOOK` adında bir tablo oluşturmak.

## 🔧 Kurulum ve Bağlantı

1. Oracle veritabanı **Docker** kullanılarak çalıştırıldı:
   ```bash
   docker run -d --name oraclexe -p 1521:1521 -p 5500:5500 -e ORACLE_PWD=sifre123 oracle/database:21.3.0-xe
   ```

2. Oracle veritabanı çalıştıktan sonra **SQL Developer** veya **DBeaver** ile bağlantı kuruldu:
   - Hostname: `localhost`
   - Port: `1521`
   - SID: `XE`
   - Username: `C##YUSUF`
   - Password: `sifre123`

> Gerekirse kullanıcıya tablo oluşturma yetkisi verildi:
```sql
ALTER USER C##YUSUF QUOTA UNLIMITED ON USERS;
```

## 📘 Oluşturulan Tablo

```sql
CREATE TABLE BOOK (
    ID NUMBER,
    NAME VARCHAR2(128),
    ISBN VARCHAR2(32),
    CREATE_DATE DATE DEFAULT SYSDATE
);
```

## ✅ Test

Tabloya örnek veri eklendi ve kontrol edildi:

```sql
INSERT INTO BOOK (ID, NAME, ISBN) 
VALUES (1, 'Clean Code', '9780132350884');

SELECT * FROM BOOK;
```

## 📝 Notlar
- Kullanıcı adı Oracle 21c Express sürümünde `C##` prefixiyle başlamak zorundadır.
- Docker container ilk başlatıldığında birkaç dakika “starting” modunda kalabilir. `STATUS: healthy` olduktan sonra bağlantı kurulmalıdır.
