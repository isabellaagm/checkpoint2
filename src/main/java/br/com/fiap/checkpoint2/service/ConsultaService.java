package br.com.fiap.checkpoint2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint2.dto.consulta.ConsultaRequestCreate;
import br.com.fiap.checkpoint2.dto.consulta.ConsultaRequestUpdate;
import br.com.fiap.checkpoint2.model.Consulta;

@Service
public class ConsultaService {

    private List<Consulta> consultas = new ArrayList<>();
    private Long sequence = 1L;

    public Consulta createConsulta(ConsultaRequestCreate dto) {
        Consulta consulta = new Consulta(); 
        consulta.setId(sequence++);
        consulta.setProfissionalId(dto.getProfissionalId());
        consulta.setPacienteId(dto.getPacienteId());
        consulta.setDataConsulta(dto.getDataConsulta());
        consulta.setStatusConsulta(dto.getStatusConsulta());
        consulta.setQtdHoras(dto.getQtdHoras());
        consulta.setValorConsulta(dto.getValorConsulta());
        consulta.setCreatedAt(dto.getCreatedAt());
        consultas.add(consulta);

        return consulta;
    }

    public Optional<Consulta> getConsultaById(Long id) {
        return consultas.stream()
        .filter(p -> p.getId().equals(id))
        .findFirst();
    }

    public List<Consulta> getAll() {
        return consultas;
    }

    public Optional<Consulta> updateConsulta(Long id, ConsultaRequestUpdate dto) {
            return consultas.stream()
            .filter(e -> e.getId().equals(id))
            .findFirst()
            .map(p -> {
                p.setDataConsulta(dto.getDataConsulta());
                p.setStatusConsulta(dto.getStatusConsulta());
                p.setQtdHoras(dto.getQtdHoras());
                p.setValorConsulta(dto.getValorConsulta());
                p.setUpdatedAt(dto.getUpdatedAt());
                return p;
            });
    }

    public boolean deleteConsulta(Long id) {
        return consultas.removeIf(p -> p.getId().equals(id));
    }
}