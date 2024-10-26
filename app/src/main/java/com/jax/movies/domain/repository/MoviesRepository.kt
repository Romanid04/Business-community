package com.jax.movies.domain.repository

import com.jax.movies.domain.entity.Movie
import kotlinx.coroutines.flow.StateFlow

interface MoviesRepository {
    suspend fun getPremiersList():StateFlow<Result<List<Movie>>>
}