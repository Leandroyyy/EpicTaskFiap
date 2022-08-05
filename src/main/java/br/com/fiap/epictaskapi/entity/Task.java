package br.com.fiap.epictaskapi.entity;

public record Task (
        String title,
        String description,
        Integer score,
        Integer status) {}
