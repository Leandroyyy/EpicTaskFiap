package br.com.fiap.epictaskapi.dto;

public record TaskDTO (
        String title,
        String description,
        Integer score,
        Integer status) {
}
