package ru.netology.mesler_roman.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@ConfigurationProperties(prefix = "operation.processing")
public class OperationProcessingProperties {
    private int timeout;
}
