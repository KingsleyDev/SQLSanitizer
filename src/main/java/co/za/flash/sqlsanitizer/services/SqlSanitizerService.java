package co.za.flash.sqlsanitizer.services;

import co.za.flash.sqlsanitizer.entities.Words;
import co.za.flash.sqlsanitizer.repository.WordsRepository;
import co.za.flash.sqlsanitizer.services.model.SentenceRequest;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.StringJoiner;

@Service
@RequiredArgsConstructor
public class SqlSanitizerService {

  WordsRepository wordsRepository;

  public String filterSentence(SentenceRequest sentenceRequest) {

    var words = sentenceRequest.getSentence().split( " ");

    var joiner = new StringJoiner(" ");
    for(var word : words) {
      var exists = wordsRepository.existsByWordsIgnoreCase(word);
      if(exists) {
        word = "*".repeat(word.length());
      }
      joiner.add(word);
    }
    return joiner.toString();
  }
}
