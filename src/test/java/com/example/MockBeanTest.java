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
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

@MicronautTest
public class MockBeanTest {

    @Inject
    ApplicationContext applicationContext;

    @BeforeEach
    public void before() {
        MockitoAnnotations.openMocks(this);
    }

    @MockBean(bean = TestClass.class)
    @Named( "TestClass")
    TestClass TestClass() {
        TestClass client = mock(TestClass.class);
        applicationContext.registerSingleton(TestClass.class, client, Qualifiers.byName("TestClass"));
        return client;
    }

    @MockBean(bean = TestClass.class, named = "TestClass2")
    @Named( "TestClass2")
    TestClass TestClass2() {
        return mock(TestClass.class);
    }

    @MockBean(bean = TestClass.class, named = "TestClass3")
    @Named( "TestClass3")
    TestClass TestClass3() {
        TestClass client = mock(TestClass.class);
        applicationContext.registerSingleton(TestClass.class, client, Qualifiers.byName("TestClass3"));
        return client;
    }
    @MockBean(bean = TestClass.class, named = "TestClass4")
    @Named( "TestClass4")
    TestClass TestClass4() {
        return mock(TestClass.class);
    }
    @MockBean(bean = TestClass.class)
    @Named( "TestClass5")
    TestClass TestClass5() {
        return mock(TestClass.class);
    }

    @Test
    public void mockTest() {
        applicationContext.getBean(TestClass.class);
    }

    @Test
    public void qualifier() {
        Qualifier<TestClass> TestClassQualifier = applicationContext
                .getBeanDefinitions(TestClass.class).stream()
                .map(BeanDefinition::getDeclaredQualifier).collect(toList())
                .get(0);
        assertNotNull(TestClassQualifier);
        String s = TestClassQualifier.toString();
        assertEquals(s,"TestClass");
    }

    @Test
    public void testclass() {
        TestClass TestClassQualifier = applicationContext
                .getBean(TestClass.class, Qualifiers.byName("TestClass"));
    }
    @Test
    public void testclass2() {
        TestClass TestClassQualifier = applicationContext
                .getBean(TestClass.class, Qualifiers.byName("TestClass2"));
    }
    @Test
    public void testclass3() {
        TestClass TestClassQualifier = applicationContext
                .getBean(TestClass.class, Qualifiers.byName("TestClass3"));
    }
    @Test
    public void testclass4() {
        TestClass TestClassQualifier = applicationContext
                .getBean(TestClass.class, Qualifiers.byName("TestClass4"));
    }
    @Test
    public void testclass5() {
        TestClass TestClassQualifier = applicationContext
                .getBean(TestClass.class, Qualifiers.byName("TestClass5"));
    }

    interface TestClass{}
}
