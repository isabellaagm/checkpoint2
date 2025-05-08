package br.com.fiap.checkpoint2.dto.profissional;

import java.time.LocalDateTime;

public class ProfissionalRequestUpdate {
    
    private String especialidade;
    private Double valorHora;
    private LocalDateTime updatedAt;
    
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
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = LocalDateTime.now();
    }
}
