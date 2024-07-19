package calc;

import io.qameta.allure.Step;

public class CalcSteps {

    @Step("Складываем числа {a}+ {b}")
    public int sum(int a, int b){
        return a+b;
    }
    @Step("Проверяем что {res} > 0")
    public boolean isPositive(int res){
        return res>0;
    }
}
