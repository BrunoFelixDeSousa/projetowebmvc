package br.com.fourcatsdev.projetowebmvc.repository;

import br.com.fourcatsdev.projetowebmvc.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
