package br.com.fiap.checkpoint2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint2.dto.profissional.ProfissionalRequestCreate;
import br.com.fiap.checkpoint2.dto.profissional.ProfissionalRequestUpdate;
import br.com.fiap.checkpoint2.model.Profissional;

@Service
public class ProfissionalService {
    private List<Profissional> profissionais = new ArrayList<>();
    private Long sequence = 1L;

    public Profissional createProfissional(ProfissionalRequestCreate dto) {
        Profissional profissional = new Profissional(); 
        profissional.setId(sequence++);       
        profissional.setNome(dto.getNome());
        profissional.setEspecialidade(dto.getEspecialidade());
        profissional.setValorHora(dto.getValorHora());
        profissional.setCreatedAt(dto.getCreatedAt());

        profissionais.add(profissional);

        return profissional;
    }

    public Optional<Profissional> getProfissionalById(Long id) {
        return profissionais.stream()
        .filter(p -> p.getId().equals(id))
        .findFirst();
    }

    public List<Profissional> getAll() {
        return profissionais;
    }

    public Optional<Profissional> updateProfissional(Long id, ProfissionalRequestUpdate dto) {
            return profissionais.stream()
            .filter(e -> e.getId().equals(id))
            .findFirst()
            .map(p -> {
                p.setEspecialidade(dto.getEspecialidade());
                p.setValorHora(dto.getValorHora());
                p.setUpdatedAt(dto.getUpdatedAt());
                return p;
            });
    }

    public boolean deleteProfissional(Long id) {
        return profissionais.removeIf(p -> p.getId().equals(id));
    }
}
