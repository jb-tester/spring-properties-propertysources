package org.example.springpropertiespropertysources;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * *
 * <p>Created by Irina on 1/22/2025.</p>
 * *
 */
@Configuration
@PropertySource("classpath:application-main.properties")
@Profile("!test")
public class DefaultConfiguration {
}
