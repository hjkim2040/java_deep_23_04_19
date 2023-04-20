package com.ll.exam2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

class MyHashMapTest {
    @Test
    @DisplayName("size()")
    void t01() {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        assertThat(map.size()).isEqualTo(0);
    }

}