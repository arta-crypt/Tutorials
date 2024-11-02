package org.stock;

/**
 * 株式の価格を取得するインターフェース
 * @author arta-crypt
 */
public interface StockService {
    /**
     * 株式の価格を取得
     * @param stock 株式
     * @return 株式の価格
     */
    double getPrice(Stock stock);
}