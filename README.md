# CRM Optimizasyon Sistemi

Bu proje, **müşteri temsilcisi yönlendirme** ve **pazarlama kampanyası optimizasyonu** için geliştirilmiş bir CRM sistemidir. 
Sistem, müşteri taleplerine göre en uygun müşteri temsilcilerini atamayı ve bütçe kısıtları altında en iyi pazarlama 
kampanyalarını seçerek yatırım getirisini (ROI) maksimize etmeyi amaçlamaktadır.

##  Kullanılan Teknolojiler  
- **Programlama Dili:** Java  
- **Algoritmalar:** Dinamik Programlama, Açgözlü Algoritma (Greedy)

## Proje İçeriği  

### 1️ Müşteri Temsilcisi Yönlendirme  
- **Amaç:** Müşteri temsilcilerini, belirli başarı puanlarına göre en uygun müşterilere yönlendirmek.  
- **Kullanılan Algoritma:** Açgözlü Algoritma  
- **Çalışma Prensibi:**  
  - Her müşteri için en iyi temsilci seçilir.  
  - Bir temsilci yalnızca bir müşteriye atanır.  
  - Seçim yapılırken en yüksek başarı puanı dikkate alınır.  

### 2️ Pazarlama Kampanyası Optimizasyonu  
- **Amaç:** Belirlenen bütçe dahilinde en yüksek yatırım getirisini (ROI) sağlamak.  
- **Kullanılan Algoritma:** Dinamik Programlama (Knapsack Problemi Yaklaşımı)  
- **Çalışma Prensibi:**  
  - Bütçeyi aşmadan maksimum getiri sağlayacak kampanyalar seçilir.  
  - **Knapsack (Çanta Problemi)** mantığıyla en iyi kombinasyon bulunur.  
  - ROI değeri **(Getiri - Maliyet) / Maliyet** formülü ile hesaplanır.  

##  Dosya Açıklamaları  
- **Main.java:** Ana dosya, müşteri yönlendirme ve pazarlama kampanyası fonksiyonlarını çalıştırır.  
- **CustomerAssignment.java:** Müşteri temsilcisi yönlendirme işlemini gerçekleştiren sınıf.  
- **MarketingOptimization.java:** Pazarlama kampanyalarının ROI hesaplamasını yapan sınıf.  

##  Çalıştırma Talimatları  
1. Java'nın kurulu olduğundan emin olun.  
2. Terminal veya komut satırında proje klasörüne gidin.  
3. Aşağıdaki komutları sırasıyla çalıştırın:  
   ```sh
   javac Main.java CustomerAssignment.java MarketingOptimization.java  
   java Main  


## Hazırlayan

Recep Efe Eren

1230505035
