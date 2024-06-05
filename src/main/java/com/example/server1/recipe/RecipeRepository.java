package com.example.server1.recipe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    @Query(value="SELECT * FROM Recipes s ORDER BY RAND() LIMIT ?1", nativeQuery = true)
    List<Recipe> findAllSample(int k);

}
