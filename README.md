# Springboot - RabbitMQ #
Untuk memulai menggunakan message queue pada RabbitMQ, silahkan perhatikan *Pre-Requisites* berikut:

## Pre-Requisites ##
- Java >= 17
- VSCode IDE dengan ekstensi:
  - Extension Pack for Java
  - Maven for Java (karena pada sample di repo ini, saya menggunakan **Maven** sebagai package manager)
  - Spring Initializr Java Support

## Getting Started ##
Jadi, untuk meng-implementasi message queue, kita membutuhkan minimal 2 sample project, dimana pada repo ini, setiap bagian akan mempunyai 2 buah direktori.

Berikut ini adalah list dari apa yang di-implementasikan pada repo ini:
- `basic`: Direktori ini berisi basic penggunaan message queue **RabbitMQ**. (Consumer/Publisher)
- `rpc`: Direktori ini berisi penggunaan sistem *RPC* pada **RabbitMQ**.

## Instalasi ##
- Masuk ke direktori pada setiap bagian yang ini kamu coba
- Lalu, masuk ke salah satu direktori, misalnya `client`
- Lalu, pada VSCode, buka terminal dan jalankan `./mvnw clean install`
- Dan selanjutnya, kamu dapat menjalankan aplikasi pada ekstensi **Spring Boot Dashboard**