package br.com.fiap.checkpoint2.dto.consulta;

import java.time.LocalDateTime;

public class ConsultaRequestUpdate {
    
    private LocalDateTime dataConsulta;
    private String statusConsulta;
    private int qtdHoras;
    private Double valorConsulta;
    private LocalDateTime updatedAt;
    
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
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = LocalDateTime.now();
    }
    
}