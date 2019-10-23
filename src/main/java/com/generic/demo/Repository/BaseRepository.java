package com.generic.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author Gamze on 21.10.2019
 *
 */

@NoRepositoryBean
interface BaseRepository<T> extends CrudRepository<T, Long> {
}
