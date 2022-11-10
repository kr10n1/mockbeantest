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
    List<SingletonInstance> list2;
    @Inject
    List<EachBeanInst> list;
    @Inject
    ConfigurationProps props;
    @Inject
    ConfigurationPropsInst inst;
    @Test
    void verifyConfigurationProperties() {
        Assertions.assertNotNull(inst);
        Assertions.assertNotNull(props);
    }
    @Test
    void verifyInstances() {
        Assertions.assertEquals(4, list.size());
        List<String> names = list.stream().map(EachBeanInst::getValue).collect(Collectors.toList());
        Assertions.assertTrue(names.contains("value1"));
        Assertions.assertTrue(names.contains("value2"));
        Assertions.assertTrue(names.contains("value3"));
        Assertions.assertTrue(names.contains("valueImpl"));
    }

    @Test
    void verifySingletonInstances() {
        Assertions.assertEquals(2, list2.size());
        List<String> values = list2.stream().map(s -> s.getSingle().getValue()).collect(Collectors.toList());
        Assertions.assertTrue(values.contains("value1"));
        Assertions.assertTrue(values.contains("value2"));

    }
}
