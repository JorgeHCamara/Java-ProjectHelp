package br.com.projecthelp.dominio.model;

import jakarta.persistence.*;

@Entity
@Table(
        name = "TB_EQUIPAMENTO"
)
public class Equipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_EQUIPAMENTO")
    @SequenceGenerator(
            name = "SQ_EQUIPAMENTO",
            sequenceName = "SQ_EQUIPAMENTO",
            initialValue = 1,
            allocationSize =
    )
    private Long id;


}
