public class MarketingOptimization {
   
    public static double calculateROI(int N, int B, int[] C, int[] R) {
        int[][] dp = new int[N + 1][B + 1]; // DP tablosu (dinamik programlama için)

        // Dinamik Programlama: Knapsack (Çanta Problemi) Mantığı
        for (int i = 1; i <= N; i++) { // Kampanyalar üzerinden geç
            for (int b = 0; b <= B; b++) { // Tüm bütçeleri dene
                if (C[i - 1] <= b) { // Eğer kampanya bütçeye sığıyorsa:
                    // Bu kampanyayı al ya da alma, maksimum olanı seç
                    dp[i][b] = Math.max(dp[i - 1][b], dp[i - 1][b - C[i - 1]] + R[i - 1]);
                } else { 
                    // Eğer kampanya bütçeyi aşıyorsa, önceki en iyi değeri al
                    dp[i][b] = dp[i - 1][b];
                }
            }
        }

        int maxReturn = dp[N][B]; // Maksimum elde edilen getiri

        // Seçilen kampanyaların toplam maliyetini hesapla
        int totalCost = 0;
        for (int i = 0; i < N; i++) {
            if (maxReturn - R[i] >= 0 && B - C[i] >= 0) { // Eğer kampanya dahil edildiyse:
                totalCost += C[i]; // Maliyeti ekle
            }
        }

        // ROI hesaplama formülü: ROI = (Getiri - Maliyet) / Maliyet
        return totalCost == 0 ? 0 : ((double) maxReturn - totalCost) / totalCost;
    }
}
