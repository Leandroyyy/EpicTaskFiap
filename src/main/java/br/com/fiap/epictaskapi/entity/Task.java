package br.com.fiap.epictaskapi.entity;


import javax.persistence.Entity;

@Entity
public class Task {

    private String title;
    private String description;
    private Integer score;
    private Integer status;
}
