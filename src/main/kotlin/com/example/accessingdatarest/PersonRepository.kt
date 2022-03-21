package com.example.accessingdatarest

import org.springframework.data.repository.*
import org.springframework.data.repository.query.*
import org.springframework.data.rest.core.annotation.*

@Suppress("unused")
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
interface PersonRepository : PagingAndSortingRepository<Person, Long> {

    fun findByLastName(@Param("name") name: String): List<Person>
}
