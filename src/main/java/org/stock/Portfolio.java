package org.stock;

import java.util.List;

/**
 * 株式ポートフォリオを表すクラス。<br>
 * 複数の株式を管理し、それらの市場価値を計算します。
 *
 * @author arta-crypt
 */
public class Portfolio {
    private StockService stockService;
    private List<Stock> stocks;

    /**
     * 使用するStockServiceを設定します。
     *
     * @param stockService 設定するStockServiceインスタンス
     */
    public void setStockService(StockService stockService) {
        this.stockService = stockService;
    }

    /**
     * 保有する株式を設定します。
     *
     * @param stocks 設定する株式のリスト
     */
    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }

    /**
     * 保有する全ての株式の市場価値を計算して取得します。
     * 各株式の価格はStockServiceを使用して取得されます。
     *
     * @return 市場価値の合計
     */
    public double getMarketValue() {
        double marketValue = 0.0;

        for (Stock stock : stocks) {
            marketValue += stockService.getPrice(stock) * stock.getQuantity();
        }

        return marketValue;
    }
}