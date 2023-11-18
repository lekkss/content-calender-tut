package com.lekkss.contentcalendartut.repository;

import com.lekkss.contentcalendartut.model.Content;
import com.lekkss.contentcalendartut.model.Status;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {

    List<Content> findAllByTitleContains(String keyword);
    List<Content> findAllByStatus(Status status);

}
