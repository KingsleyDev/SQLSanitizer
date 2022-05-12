package co.za.flash.sqlsanitizer.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity(name ="sanitizer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Words {

    @Id
    private Integer id;

    @Column(name = "words")
    private String words;
}
