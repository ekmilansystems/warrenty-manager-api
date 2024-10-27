package com.ssjmkc.warrenty;

import com.ssjmkc.warrenty.config.AsyncSyncConfiguration;
import com.ssjmkc.warrenty.config.EmbeddedRedis;
import com.ssjmkc.warrenty.config.EmbeddedSQL;
import com.ssjmkc.warrenty.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { WarrentymanagerApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedRedis
@EmbeddedSQL
public @interface IntegrationTest {
}
