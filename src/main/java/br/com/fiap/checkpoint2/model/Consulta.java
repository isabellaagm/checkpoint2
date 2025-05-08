package br.com.fiap.checkpoint2.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Profissional profissionalId;

    @ManyToOne
    private Paciente pacienteId;

    private LocalDateTime dataConsulta;
    private String statusConsulta;
    private int qtdHoras;
    private Double valorConsulta;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Profissional getProfissionalId() {
        return profissionalId;
    }
    public void setProfissionalId(Profissional profissionalId) {
        this.profissionalId = profissionalId;
    }
    public Paciente getPacienteId() {
        return pacienteId;
    }
    public void setPacienteId(Paciente pacienteId) {
        this.pacienteId = pacienteId;
    }
    public LocalDateTime getDataConsulta() {
        return dataConsulta;
    }
    public void setDataConsulta(LocalDateTime dataConsulta) {
        this.dataConsulta = dataConsulta;
    }
    public String getStatusConsulta() {
        return statusConsulta;
    }
    public void setStatusConsulta(String statusConsulta) {
        this.statusConsulta = statusConsulta;
    }
    public int getQtdHoras() {
        return qtdHoras;
    }
    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }
    public Double getValorConsulta() {
        return valorConsulta;
    }
    public void setValorConsulta(Double valorConsulta) {
        this.valorConsulta = valorConsulta;
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
