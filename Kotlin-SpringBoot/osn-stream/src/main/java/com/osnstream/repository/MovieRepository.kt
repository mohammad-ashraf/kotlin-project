package com.osnstream.repository

import com.osnstream.entity.Movie
import org.springframework.data.repository.CrudRepository

interface MovieRepository : CrudRepository<Movie,Int> {
}