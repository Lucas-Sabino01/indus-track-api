package br.com.industrack.indus_track_api.repository;

import br.com.industrack.indus_track_api.model.Ativo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtivoRepository extends JpaRepository<Ativo, Long> {
}