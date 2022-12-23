package com.example;

import io.micronaut.context.ApplicationContext;
import io.micronaut.context.Qualifier;
import io.micronaut.inject.BeanDefinition;
import io.micronaut.inject.qualifiers.Qualifiers;
import io.micronaut.test.annotation.MockBean;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

@MicronautTest
public class SubModuleTest {

    @Inject
    ApplicationContext applicationContext;

    @BeforeEach
    public void before() {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    void submodule() {

        assertEquals(2, applicationContext.getBeansOfType(SubmoduleEach.class).size());
    }
}
