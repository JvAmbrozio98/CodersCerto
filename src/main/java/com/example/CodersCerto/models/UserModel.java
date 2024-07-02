package com.example.CodersCerto.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table
@Entity
public class UserModel {
    @Id
    @GeneratedValue (strategy = GenerationType.UUID)
    private UUID id;
    @NotBlank
    private String userName;
    @CPF
    private String cpf;
    @NotBlank @NonNull
    private String password;
}
