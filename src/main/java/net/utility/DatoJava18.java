package net.utility;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class DatoJava18 {

    public void a(){

        LocalTime now = LocalTime.now();
        LocalTime later = now.plus(2, ChronoUnit.HOURS);
    }
}
