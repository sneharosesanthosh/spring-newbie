package com.sneha.repository;

import java.util.List;

public interface CrudRepository<T> {


    List<T> findAll();
}
