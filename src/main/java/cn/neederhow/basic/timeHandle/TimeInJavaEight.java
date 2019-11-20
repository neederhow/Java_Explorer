package cn.neederhow.basic.timeHandle;

import java.time.*;

public class TimeInJavaEight {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        localDate.withMonth(1);
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        Instant instant = Instant.now();
    }
}
