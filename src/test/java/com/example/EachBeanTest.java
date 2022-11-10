package com.example;

import java.util.List;
import java.util.stream.Collectors;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@MicronautTest
public class EachBeanTest {
    @Inject
    List<EachBeanInst> list;
    @Test
    void verifyInstances() {
        Assertions.assertEquals(3, list.size());
        List<String> names = list.stream().map(EachBeanInst::getValue).collect(Collectors.toList());
        Assertions.assertTrue(names.contains("value1"));
        Assertions.assertTrue(names.contains("value2"));
        Assertions.assertTrue(names.contains("value3"));
        Assertions.assertTrue(names.contains("valueImpl"));
    }
}
