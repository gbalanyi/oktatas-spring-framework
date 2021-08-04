package io.github.gbalanyi.spring.framework.service;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import org.springframework.stereotype.Service;

@Service
public class MyFirstSpringService {

    private final Clock clock;

    public MyFirstSpringService(Clock clock) {
        this.clock = clock;
    }

    public String getCurrentTimestamp() {
        return DateTimeFormatter.ISO_ZONED_DATE_TIME.format(ZonedDateTime.now(clock).truncatedTo(ChronoUnit.SECONDS));
    }
}
