package Calculator;

    import org.junit.jupiter.api.*;
    import org.junit.jupiter.params.ParameterizedTest;
    import org.junit.jupiter.params.provider.ValueSource;
    
    import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {

    private Calculator calculator;
    
    @Test
    @DisplayName("Проверка правильности вычисления цены со скидкой")
    void discountPriceTest(int price, int discount){
        assertThat(calculator.calculateDiscount(500, 30)).isEqualTo(350);
    }

    @Test
    @DisplayName("Проверка нулевой цены")
    void priceTest(int price, int discount){
        assertThatThrownBy(() -> calculator.calculateDiscount(0, 45)).isInstanceOf(ArithmeticException.class).hasMessage("Сумма покупки некорректна");
    }

    @Test
    @DisplayName("Проверка превышения границы скидки в меньшую сторону")
    void negativeDiscountTest(int price, int discount){
        assertThatThrownBy(() -> calculator.calculateDiscount(500, -30)).isInstanceOf(ArithmeticException.class).hasMessage("Скидка должна быть от 0 до 50%");
    }

    @Test
    @DisplayName("Проверка превышения границы скидки в большую сторону")
    void bigDiscountTest(int price, int discount){
        assertThatThrownBy(() -> calculator.calculateDiscount(500, 51)).isInstanceOf(ArithmeticException.class).hasMessage("Скидка должна быть от 0 до 50%");
    }

}
    
    
