package co.za.flash.sqlsanitizer.services.model;


import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class SentenceRequest {

    @NotNull
    private String sentence;

}
