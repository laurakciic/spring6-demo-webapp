package com.laurakovacic.spring6demowebapp.repositories;

import com.laurakovacic.spring6demowebapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
