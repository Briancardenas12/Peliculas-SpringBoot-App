package com.codigofacilito.peliculas.dao;

import com.codigofacilito.peliculas.entities.Pelicula;
import org.springframework.data.repository.CrudRepository;

public interface IpeliculaRepository extends CrudRepository<Pelicula, Long> {
}
