package com.beehive.beehiveNest.model.forms;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MeasureForm {
    private LocalDateTime time;
    private String beehiveSerial;
    private double temperature;
    private double humidity;
    private double weight;
    private MultipartFile audioRecording;
}
