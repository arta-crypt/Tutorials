package org.stock;

/**
 * 株式を表すクラス
 * @author arta-crypt
 */
public class Stock {
    private final String stockId;
    private final String name;
    private final int quantity;

    /**
     * コンストラクタ
     * 
     * @param stockId 株式ID
     * @param name 株式名
     * @param quantity 数量
     */
    public Stock(String stockId, String name, int quantity) {
        this.stockId = stockId;
        this.name = name;
        this.quantity = quantity;
    }

    /**
     * 数量を取得
     *
     * @return 数量
     */
    public int getQuantity() {
        return quantity;
    }

}