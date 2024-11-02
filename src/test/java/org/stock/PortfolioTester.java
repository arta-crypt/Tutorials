package org.stock;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/**
 * Portfolioのテストを実行するクラス
 * @author arta-crypt
 */
public class PortfolioTester {

    /**
     * テスト対象のPortfolioオブジェクトを保持します
     */
    Portfolio portfolio;
    /**
     * テスト対象のPortfolioオブジェクトのStockServiceを指定します<br>
     * {@link Portfolio#getMarketValue()}のテストのために、このフィールドに設定された
     * StockServiceはmockupオブジェクトを使用します。
     */
    StockService stockService;

    /**
     * Portfolioのテストを実行する
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        PortfolioTester tester = new PortfolioTester();
        tester.setUp();
        System.out.println(tester.testMarketValue() ? "pass" : "fail");
    }


    /**
     * Portfolioのテスト用の設定を行う
     */
    public  void setUp() {
        // Create a portfolio object which is to be tested
        portfolio = new Portfolio();

        // Create the mock object of stock service
        stockService = mock(StockService.class);

        // set the stockService to the portfolio
        portfolio.setStockService(stockService);
    }


    /**
     * {@link Portfolio#getMarketValue()}のテスト
     * @return テスト結果
     */
    public boolean testMarketValue() {
        // Creates a list of stocks to be added to the portfolio
        List<Stock> stocks = new ArrayList<>();
        Stock googleStock = new Stock("1", "Google", 10);
        Stock microsoftStock = new Stock("2", "Microsoft", 100);

        stocks.add(googleStock);
        stocks.add(microsoftStock);

        // add stocks to the portfolio
        portfolio.setStocks(stocks);

        // mock the behavior of the stock service to return the value of various stocks
        when(stockService.getPrice(googleStock)).thenReturn(50.0);
        when(stockService.getPrice(microsoftStock)).thenReturn(1000.0);

        double marketValue = portfolio.getMarketValue();
        return marketValue == 100500.0;
    }
}