package com.dsb.api.distribucion.config;

import io.sentry.Sentry;
import io.sentry.dsn.InvalidDsnException;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;


/**
 * The type Sentry config.
 *
 * @author acrispin
 * @since 01/08/2020
 */
@Configuration
public class SentryConfig {

    private static final Logger log = org.apache.logging.log4j.LogManager.getLogger(SentryConfig.class);

    @Value("${app.config.sentry.dsn}")
    private String sentryDSN;

    /**
     * Sentry exception resolver handler exception resolver.
     *
     * @return the handler exception resolver
     */
    @Bean
    public HandlerExceptionResolver sentryExceptionResolver() {
        try {
            if (sentryDSN != null && !sentryDSN.isEmpty()) {
                Sentry.init(sentryDSN);
                log.info("Sentry, configuracion correcta.");
            } else {
                log.error("Sentry, error en configuracion de DSN.");
            }
        } catch (InvalidDsnException ex) {
            log.error(ex.getMessage(), ex);
        }

        return new io.sentry.spring.SentryExceptionResolver();
    }

    /**
     * Sentry servlet context initializer servlet context initializer.
     *
     * @return the servlet context initializer
     */
    @Bean
    public ServletContextInitializer sentryServletContextInitializer() {
        return new io.sentry.spring.SentryServletContextInitializer();
    }

}
