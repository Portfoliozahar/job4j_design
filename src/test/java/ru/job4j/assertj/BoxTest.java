package ru.job4j.assertj;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BoxTest {

    @Test
    void isSphere() {
        Box box = new Box(0, 10);
        assertThat(box.whatsThis()).isEqualTo("Sphere");
        assertThat(box.getNumberOfVertices()).isEqualTo(0);
        assertThat(box.isExist()).isTrue();
        assertThat(box.getArea()).isEqualTo(4 * Math.PI * (10 * 10));
    }

    @Test
    void isCube() {
        Box box = new Box(8, 7);
        assertThat(box.whatsThis()).isEqualTo("Cube");
        assertThat(box.getNumberOfVertices()).isEqualTo(8);
        assertThat(box.isExist()).isTrue();
        assertThat(box.getArea()).isEqualTo(6 * (7 * 7));
    }

    @Test
    void isTetrahedron() {
        Box box = new Box(4, 5);
        assertThat(box.whatsThis()).isEqualTo("Tetrahedron");
        assertThat(box.getNumberOfVertices()).isEqualTo(4);
        assertThat(box.isExist()).isTrue();
        assertThat(box.getArea()).isEqualTo(Math.sqrt(3) * (5 * 5));
    }

}