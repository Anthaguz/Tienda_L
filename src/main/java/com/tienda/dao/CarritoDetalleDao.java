package com.tienda.dao;

import org.springframework.data.repository.CrudRepository;
import com.tienda.domain.CarritoDetalle;
import com.tienda.domain.Articulo;
import java.util.List;
import java.util.Optional;

public interface CarritoDetalleDao extends CrudRepository<CarritoDetalle, Long> {
    
    public Optional<CarritoDetalle> findByIdCarritoAndArticulo(Long idCarrito, Articulo articulo);
    
    public List<CarritoDetalle> findByIdCarrito(Long idCarrito);
    
    public void deleteByIdCarrito(Long idCarrito);
}