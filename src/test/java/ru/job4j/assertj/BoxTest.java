package ru.job4j.assertj;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BoxTest {

    @Test
    void testWhatsThis() {
        Box box1 = new Box(0, 10);
        Box box2 = new Box(4, 10);
        assertThat(box1.whatsThis()).isEqualTo("Sphere");
        assertThat(box2.whatsThis()).isEqualTo("Tetrahedron");
    }

    @Test
    void testGetNumberOfVertices() {
        Box box1 = new Box(0, 10);
        Box box2 = new Box(4, 10);
        assertThat(box1.getNumberOfVertices()).isEqualTo(0);
        assertThat(box2.getNumberOfVertices()).isEqualTo(4);
    }

    @Test
    void testIsExist() {
        Box box1 = new Box(0, 10);
        Box box2 = new Box(4, 0);
        assertThat(box1.isExist()).isTrue();
        assertThat(box2.isExist()).isFalse();
    }

    @Test
    void testGetArea() {
        Box box1 = new Box(0, 5);
        Box box2 = new Box(4, 10);
        assertThat(box1.getArea()).isEqualTo(4 * Math.PI * (5 * 5));
        assertThat(box2.getArea()).isEqualTo(Math.sqrt(3) * (10 * 10));
    }
}
