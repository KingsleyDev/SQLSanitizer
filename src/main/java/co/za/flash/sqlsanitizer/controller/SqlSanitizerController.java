package co.za.flash.sqlsanitizer.controller;


import co.za.flash.sqlsanitizer.controller.models.ResponseDto;
import co.za.flash.sqlsanitizer.controller.models.SentenceRequest;
import co.za.flash.sqlsanitizer.services.SqlSanitizerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/flash")
public class SqlSanitizerController {
    ModelMapper modelMapper;
    SqlSanitizerService sqlSanitizerService;
    
    @PostMapping("/filter")
    public ResponseEntity <ResponseDto<String>> filterSentence (@RequestBody SentenceRequest sentenceRequest) {

        var requestMapping = modelMapper.map(sentenceRequest, co.za.flash.sqlsanitizer.services.model.SentenceRequest.class);
        var results = sqlSanitizerService.filterSentence(requestMapping);

        return null;
    }

}
