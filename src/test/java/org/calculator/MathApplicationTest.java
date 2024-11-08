package org.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MathApplicationTest {


    @Nested
    public class MockitoManualTest {
        private CalculatorService calcService;
        private MathApplication mathApplication;

        @BeforeEach
        void initService() {
            calcService = mock(CalculatorService.class);
            mathApplication = new MathApplication();
            mathApplication.setCalcService(calcService);
        }

        @Test
        void testAdd() {
            when(calcService.add(10.0, 20.0)).thenReturn(30.00);

            assertEquals(30.0, mathApplication.add(10.0, 20.0), 0);
        }
    }

    @Nested
    @ExtendWith(MockitoExtension.class)
    class MockitoExtensionInjectMocksTest {
        @InjectMocks
        MathApplication mathApplication = new MathApplication();

        @Mock
        CalculatorService calcService;

        @Test
        void testAdd() {
            when(calcService.add(10.0, 20.0)).thenReturn(30.00);

            assertEquals(30.0, mathApplication.add(10.0, 20.0), 0);
        }
    }

}