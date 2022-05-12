package co.za.flash.sqlsanitizer.configs;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.spi.MappingContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.time.Instant;

@Configuration
public class GenericConfigs implements WebMvcConfigurer {

    @Bean
    @SuppressWarnings({"squid:S1604", "Convert2Lambda"})
    public ModelMapper modelMapper() {
        Converter<Instant, Long> instantToLong = new Converter<>() {
            public Long convert(MappingContext<Instant, Long> context) {
                return context.getSource() == null ? null : context.getSource().toEpochMilli();
            }
        };

        var modelMapper = new ModelMapper();
        modelMapper.addConverter(instantToLong);
        return modelMapper;

    }

    @Bean
    ObjectMapper defaultObjectMapper() {

        var objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper;
    }
}
