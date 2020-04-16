package com.leona.parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
    private String id;
    private LocalDateTime enter; //進場時間
    private LocalDateTime leave; //離場時間

    public Car(String id, LocalDateTime enter) {
        this.id = id;
        this.enter = enter;
    }

    //進場~出場時間
    public long getMinutes() {
        Duration duration = Duration.between(enter, leave);
        return duration.toMinutes();
    }

    //進場~出場時間
    public long getDuration() {
        Duration duration = Duration.between(enter, leave);
        return duration.toMinutes();
    }
    public void leave() {  //出場時間
        leave = LocalDateTime.now();
    }

    public void setLeave(LocalDateTime leave) {
        if (leave.isAfter(enter)) {
            this.leave = leave;
        }
    }
}
