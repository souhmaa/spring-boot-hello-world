package com.training.hello.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProcessResult {

    private String message;

    public static ProcessResult done() {
        return new ProcessResult("Process is done successfully");
    }


}
