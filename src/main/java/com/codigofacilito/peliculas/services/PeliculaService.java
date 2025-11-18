package com.codigofacilito.peliculas.services;

import com.codigofacilito.peliculas.dao.IpeliculaRepository;
import com.codigofacilito.peliculas.entities.Pelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaService implements IPeliculaService{

    @Autowired
    private IpeliculaRepository repo;

    @Override
    public void save(Pelicula pelicula) {
        repo.save(pelicula);

    }

    @Override
    public Pelicula findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Pelicula> findAll() {
        return (List<Pelicula>) repo.findAll();
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
