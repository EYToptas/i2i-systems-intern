# Spring Boot Kitap Uygulaması

Bu proje, Spring Boot kullanılarak geliştirilmiş basit bir kitap yönetim uygulamasıdır. Web arayüzü ve REST API içerir. H2 veritabanı kullanılarak veri işlemleri yapılmaktadır.

## 🔧 Kullanılan Teknolojiler

- Java 17
- Spring Boot
  - Spring Web
  - Spring Data JPA
  - Spring Security (özelleştirilmiş)
  - Thymeleaf
- H2 In-Memory Database
- Maven

## 📁 Proje Yapısı

```
src/
├── main/
│   ├── java/com/odev/webapp/
│   │   ├── controller/
│   │   ├── exception/
│   │   ├── model/
│   │   ├── repository/
│   │   └── Application.java
│   └── resources/
│       ├── templates/home.html
│       └── application.properties
```

## 🚀 Uygulama Nasıl Çalıştırılır?

1. Projeyi indir veya klonla.
2. Bir Java IDE'si ile aç (ör: IntelliJ IDEA).
3. Maven ile bağımlılıkları indir.
4. `Application.java` sınıfını çalıştır.
5. Tarayıcıdan şu adrese git:  
   👉 `http://localhost:8081`

## 🌐 Web Arayüzü

- Anasayfada uygulama adı ve kitap listesi görüntülenir.
- Kitap ekleme bağlantısı yer alır (Thymeleaf destekli).

## 📦 API Endpoint’leri

| HTTP | URL                         | Açıklama                  |
|------|-----------------------------|---------------------------|
| GET  | `/api/books`                | Tüm kitapları getirir     |
| GET  | `/api/books/{id}`           | ID’ye göre getirir        |
| GET  | `/api/books/title/{title}`  | Başlığa göre arama        |
| POST | `/api/books`                | Yeni kitap ekler          |
| PUT  | `/api/books/{id}`           | Kitap günceller           |
| DELETE | `/api/books/{id}`         | Kitap siler               |

## 🔐 Güvenlik

Spring Security varsayılan olarak eklendi ancak tüm istekler izinli hale getirildi (`permitAll`).

## 🗃️ Veritabanı

H2 bellek içi veritabanı kullanılmıştır.

- Konsola ulaşmak için:  
  👉 `http://localhost:8081/h2-console`  
- JDBC URL: `jdbc:h2:mem:bootapp`

---

## 📌 Not

Bu proje, Spring Boot temel kavramlarını öğretmeyi amaçlamaktadır. Gerçek projelerde DTO kullanımı, validasyonlar, testler ve detaylı güvenlik katmanları önerilir.