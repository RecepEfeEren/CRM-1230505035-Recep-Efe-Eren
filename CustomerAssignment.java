import java.util.Arrays;

public class CustomerAssignment {
    
    public static int[][] assignCustomers(int N, int M, int[][] S) {
        int[] assignedRep = new int[N]; // Müşterilere atanmış temsilcileri tutar
        boolean[] repUsed = new boolean[M]; // Temsilcilerin kullanılıp kullanılmadığını takip eder

        // Temsilci ataması yapılmadığını göstermek için -1 ile doldur
        Arrays.fill(assignedRep, -1);
        Arrays.fill(repUsed, false);

        // Her müşteri için en iyi temsilciyi bul ve ata
        for (int i = 0; i < N; i++) {
            int bestRep = -1; // En uygun temsilciyi saklar
            int bestScore = Integer.MIN_VALUE; // En iyi başarı puanı

            // Tüm temsilciler arasında en uygun olanı seç
            for (int j = 0; j < M; j++) {
                if (!repUsed[j] && S[i][j] > bestScore) { 
                    bestScore = S[i][j]; // En yüksek başarı puanını güncelle
                    bestRep = j; // En uygun temsilciyi güncelle
                }
            }

            // Eğer uygun bir temsilci bulunduysa müşteriye ata
            if (bestRep != -1) {
                assignedRep[i] = bestRep; // Müşteriye en iyi temsilciyi ata
                repUsed[bestRep] = true; // Temsilci artık kullanıldı olarak işaretlenir
            }
        }

        // Müşteri-temsilci eşleşmelerini saklayan bir matris oluştur
        int[][] result = new int[N][2];
        for (int i = 0; i < N; i++) {
            result[i][0] = i; // Müşteri ID
            result[i][1] = assignedRep[i]; // Atanan temsilci ID
        }

        return result; // Eşleşmeleri döndür
    }
}
