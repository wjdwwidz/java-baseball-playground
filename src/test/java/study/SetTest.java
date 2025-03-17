import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }


    //요구사항1
    @Test
    void size(){
        assertThat(3).isEqualTo(numbers.size());
    }


    //요구사항2
    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void contains (int input) {
        assertThat(numbers.contains(input)).isTrue();
    }

    //요구사항3
    @DisplayName("CsvSource를 이용하여 Set에서 특정 값의 존재 여부 확인")
    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"} , delimiter = ':')
    void containsOneTwoThree (String input, boolean expected) {
        boolean actualValue = numbers.contains(Integer.parseInt(input));
        assertEquals(expected, actualValue);
    }


}
