package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    //요구사항1
    @Test
    void splitNums(){
        String[] actual2 = "1,2".split(",");
        assertThat(actual2).containsExactly("1","2");
    }

    @Test
    void splitNum(){
        String[] actual3= "1".split(",");
        assertThat(actual3).contains("1");
    }

    //요구사항2
    @Test
    void remove(){
        String actual4 = "(1,2)".substring(1,4);
        assertThat(actual4).isEqualTo("1,2");
    }


    //요구사항3
    @Test
    @DisplayName("String 의 CharAt() 메소드를 이용하여 특정 위치의 문자를 가져온다")
    void testException(){
        assertThatThrownBy (()-> {
            char actual6 = "abc".charAt(4);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 4");
    }

}
