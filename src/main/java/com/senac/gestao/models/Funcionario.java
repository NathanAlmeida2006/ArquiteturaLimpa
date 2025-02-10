package com.senac.gestao.models;

import com.senac.gestao.models.enums.Departamento;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Funcionario extends Pessoa {
    private Double salario;
    private String cargo;
    private Departamento departamento;
}
