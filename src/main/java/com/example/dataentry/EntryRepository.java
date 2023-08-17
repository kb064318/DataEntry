package com.example.dataentry;

import org.springframework.data.repository.CrudRepository;

public interface EntryRepository extends CrudRepository<DataModel, Long> {
    // Used to find the last element entered into the CrudRepository
    DataModel findTopByOrderByIdDesc();
}
