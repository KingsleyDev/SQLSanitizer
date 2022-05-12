package co.za.flash.sqlsanitizer.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name ="sanitizer")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Words {
    @Id
    private Integer id;

    @Column(name = "words")
    private String words;
}
