public class Main {
    public static void main(String[] args) {
        // Müşteri temsilcisi yönlendirme 
        int N = 3, M = 3; // N: Müşteri sayısı, M: Temsilci sayısı
        int[][] S = {
            {10, 5, 8},  // 1. müşterinin temsilcilerle olan başarı puanları
            {7, 12, 9},  // 2. 
            {5, 6, 10}   // 3. 
        };

        // Müşteri-temsilci eşleştirmesini gerçekleştir
        int[][] assignments = CustomerAssignment.assignCustomers(N, M, S);
        System.out.println("Musteri Temsilcisi Eslesmeleri:");
        for (int[] pair : assignments) {
            System.out.println("Musteri " + pair[0] + " -> Temsilci " + pair[1]);
        }

        // Pazarlama kampanyası optimizasyon senaryosu
        int campaignCount = 4; // Kampanya sayısı
        int budget = 10; // bütçe
        int[] costs = {3, 5, 2, 8}; // maliyetleri
        int[] returns = {40, 50, 30, 100}; // Kampanyalardan beklenen getiriler

        // Pazarlama kampanyaları için ROI hesapla
        double roi = MarketingOptimization.calculateROI(campaignCount, budget, costs, returns);
        System.out.println("Toplam ROI: " + roi);
    }
}
