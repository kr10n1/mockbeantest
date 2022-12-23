package com.example;

import io.micronaut.context.ApplicationContext;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class LocalEachTest {

    @Inject
    ApplicationContext applicationContext;

    @BeforeEach
    public void before() {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    void submodule() {

        assertEquals(2, applicationContext.getBeansOfType(LocalEach.class).size());
    }
}
