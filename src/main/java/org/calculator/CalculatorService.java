package org.calculator;

/**
 * 計算機サービスインターフェース
 * このインターフェースは基本的な算術演算を定義します。
 *
 * @author arta-crypt
 */
public interface CalculatorService {

    /**
     * 2つの数値を足し算します。
     *
     * @param input1 足し算の第1の数値
     * @param input2 足し算の第2の数値
     * @return 足し算の結果
     */
    public double add(double input1, double input2);

    /**
     * 2つの数値を引き算します。
     *
     * @param input1 引き算の第1の数値
     * @param input2 引き算の第2の数値
     * @return 引き算の結果
     */
    public double subtract(double input1, double input2);

    /**
     * 2つの数値を掛け算します。
     *
     * @param input1 掛け算の第1の数値
     * @param input2 掛け算の第2の数値
     * @return 掛け算の結果
     */
    public double multiply(double input1, double input2);

    /**
     * 2つの数値を割り算します。input2が0の場合、動作は未定義です。
     *
     * @param input1 割り算の被除数
     * @param input2 割り算の除数
     * @return 割り算の結果
     */
    public double divide(double input1, double input2);
}
