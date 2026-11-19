package com.andesfresh.portal.service;
 
import com.andesfresh.portal.model.Producto;
import com.andesfresh.portal.repository.ProductoRepository;
import org.springframework.stereotype.Service;
 
import java.util.List;
import java.util.Optional;
 
@Service
public class ProductoService {
 
    private final ProductoRepository repo;
 
    public ProductoService(ProductoRepository repo) {
        this.repo = repo;
    }
 
    public List<Producto> listar() { return repo.findAll(); }
    public Optional<Producto> buscarPorId(Long id) { return repo.findById(id); }
    public boolean existe(Long id) { return repo.existsById(id); }
    public Producto guardar(Producto p) { return repo.save(p); }
    public void eliminar(Long id) { repo.deleteById(id); }
}
