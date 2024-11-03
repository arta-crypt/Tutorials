package org.calculator;

/**
 * MathApplicationクラス
 * このクラスはCalculatorServiceを使用して基本的な算術演算を実行します。
 */
public class MathApplication {
    /**
     * CalculatorServiceインスタンス
     * 算術演算を提供するサービス
     */
    private CalculatorService calcService;

    /**
     * CalculatorServiceを設定します。
     *
     * @param calcService 設定するCalculatorServiceのインスタンス
     */
    public void setCalcService(CalculatorService calcService) {
        this.calcService = calcService;
    }

    /**
     * 2つの数値を足し算します。
     *
     * @param input1 足し算の第1の数値
     * @param input2 足し算の第2の数値
     * @return 足し算の結果
     */
    public double add(double input1, double input2) {
        return calcService.add(input1, input2);
    }

    /**
     * 2つの数値を引き算します。
     *
     * @param input1 引き算の第1の数値
     * @param input2 引き算の第2の数値
     * @return 引き算の結果
     */
    public double subtract(double input1, double input2) {
        return calcService.subtract(input1, input2);
    }

    /**
     * 2つの数値を掛け算します。
     *
     * @param input1 掛け算の第1の数値
     * @param input2 掛け算の第2の数値
     * @return 掛け算の結果
     */
    public double multiply(double input1, double input2) {
        return calcService.multiply(input1, input2);
    }

    /**
     * 2つの数値を割り算します。input2が0の場合、動作は未定義です。
     *
     * @param input1 割り算の被除数
     * @param input2 割り算の除数
     * @return 割り算の結果
     */
    public double divide(double input1, double input2) {
        return calcService.divide(input1, input2);
    }
}