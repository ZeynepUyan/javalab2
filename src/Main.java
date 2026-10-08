import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Değerleri String olarak tanımlamak hassasiyet kaybını tamamen önler
        BigDecimal productCost = new BigDecimal("9.99");
        BigDecimal vatRate = new BigDecimal("0.05");

        // Tek ürün için KDV
        BigDecimal singleUnitVat = productCost.multiply(vatRate);

        // Başlangıç değerleri
        BigDecimal totalNetSales = BigDecimal.ZERO;
        BigDecimal totalVatAmount = BigDecimal.ZERO;

        // 10.000 kere döngü
        for (int i = 0; i < 10000; i++) {
            totalNetSales = totalNetSales.add(productCost);
            totalVatAmount = totalVatAmount.add(singleUnitVat);
        }

        // Toplam brüt değer
        BigDecimal totalGrossValue = totalNetSales.add(totalVatAmount);

        // Çıktılar
        System.out.println(singleUnitVat);
        System.out.println(totalNetSales);
        System.out.println(totalVatAmount);
        System.out.println(totalGrossValue);
    }
}