package co.za.flash.sqlsanitizer.controller.models;


import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class SentenceRequest {

    @NotNull
    private String sentence;


}
