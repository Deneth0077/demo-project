package edu.me.crm.model;
import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private String name; // private kara visibility level eka low karanna
    private String email;
    private String contactNumber;
}


//Encapculation enpose karanava kiyanne private karala setter eka hadala vitharak encapsiyulate venne nehe eka validate karanna ona