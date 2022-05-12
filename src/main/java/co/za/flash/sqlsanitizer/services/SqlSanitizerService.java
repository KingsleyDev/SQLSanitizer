package co.za.flash.sqlsanitizer.services;

import co.za.flash.sqlsanitizer.entities.Words;
import co.za.flash.sqlsanitizer.repository.WordsRepository;
import co.za.flash.sqlsanitizer.services.model.SentenceRequest;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SqlSanitizerService {

  WordsRepository wordsRepository;

  public String filterSentence(SentenceRequest sentenceRequest) {

    var list = wordsRepository.findAll();

    //find and replace logic


    return null;
  }

}
