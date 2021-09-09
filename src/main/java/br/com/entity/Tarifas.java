package br.com.entity;

import com.sun.javafx.beans.IDProperty;

import javax.annotation.Generated;

@Entity
public class Tarifas {

    @Id
    @Column(name = "id_tarifa")
    @GeneratedValue(strategy = GenerationTye.IDENTITY)

}
