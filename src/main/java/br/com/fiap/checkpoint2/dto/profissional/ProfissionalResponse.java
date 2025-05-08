package br.com.fiap.checkpoint2.dto.profissional;

import java.time.LocalDateTime;

import br.com.fiap.checkpoint2.model.Profissional;

public class ProfissionalResponse {
    private Long id;
    private String nome;
    private String especialidade;
    private Double valorHora;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ProfissionalResponse toDto(Profissional profissional) {
        this.setId(profissional.getId());
        this.setNome(profissional.getNome());
        this.setEspecialidade(profissional.getEspecialidade());
        this.setValorHora(profissional.getValorHora());
        this.setCreatedAt(profissional.getCreatedAt());
        this.setUpdatedAt(profissional.getUpdatedAt());
        
        return this;
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public Double getValorHora() {
        return valorHora;
    }
    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
