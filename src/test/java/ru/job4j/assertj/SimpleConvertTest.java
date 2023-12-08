package ru.job4j.assertj;

import org.assertj.core.data.Index;
import org.junit.jupiter.api.Test;

import java.util. *;

import static org.assertj.core.api.Assertions.assertThat;

class SimpleConvertTest {
    @Test
    void checkArray() {
        SimpleConvert simpleConvert = new SimpleConvert();
        String[] array = simpleConvert.toArray("first", "second", "three", "four", "five");

        assertThat(array)
                .hasSize(5)
                .contains("second")
                .contains("first", Index.atIndex(0))
                .containsAnyOf("zero", "second", "six")
                .doesNotContain("first", Index.atIndex(1));

        assertThat(array)
                .containsExactly("first", "second", "three", "four", "five")
                .startsWith("first")
                .endsWith("five");
    }

    @Test
    void checkList() {
        SimpleConvert simpleConvert = new SimpleConvert();
        List<String> list = simpleConvert.toList("first", "second", "three", "four", "five");

        assertThat(list)
                .hasSize(5)
                .contains("second")
                .contains("first", Index.atIndex(0))
                .containsAnyOf("zero", "second", "six")
                .doesNotContain("first", Index.atIndex(1));

        assertThat(list)
                .containsExactly("first", "second", "three", "four", "five")
                .doesNotHaveDuplicates();
    }

    @Test
    void checkSet() {
        SimpleConvert simpleConvert = new SimpleConvert();
        Set<String> set = simpleConvert.toSet("first", "second", "three", "four", "five");

        assertThat(set)
                .hasSize(5)
                .contains("second")
                .contains("first")
                .containsAnyOf("zero", "second", "six")
                .doesNotContain("six");

        assertThat(set)
                .containsExactlyInAnyOrder("first", "second", "three", "four", "five");
    }

    @Test
    void checkMap() {
        SimpleConvert simpleConvert = new SimpleConvert();
        Map<String, Integer> map = simpleConvert.toMap("first", "second", "three", "four", "five");

        assertThat(map)
                .hasSize(5)
                .containsKeys("first", "second", "three")
                .containsEntry("first", 0)
                .containsEntry("second", 1)
                .doesNotContainKey("six");
    }
}