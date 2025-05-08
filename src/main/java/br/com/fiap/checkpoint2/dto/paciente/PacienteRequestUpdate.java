package br.com.fiap.checkpoint2.dto.paciente;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PacienteRequestUpdate {
    private String endereco;
    private String bairro;
    private String email;
    private String telefone_completo;
    private LocalDate dataNascimento;
    private LocalDateTime updatedAt;
    
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone_completo() {
        return telefone_completo;
    }
    public void setTelefone_completo(String telefone_completo) {
        this.telefone_completo = telefone_completo;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = LocalDateTime.now();
    }

    
}