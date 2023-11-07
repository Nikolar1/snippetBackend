package com.nikolar.snippetparser.service;

import com.nikolar.snippetparser.dto.AuthorDto;
import com.nikolar.snippetparser.mapper.AuthorMapper;
import com.nikolar.snippetparser.model.Author;
import com.nikolar.snippetparser.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;
    @Autowired
    AuthorMapper authorMapper;
    public AuthorDto getAuthorById(long id){
        return authorMapper.entityToDto(authorRepository.findById(id));
    }

    public AuthorDto getAuthorByName(String name){
        return authorMapper.entityToDto(authorRepository.findByName(name));
    }

    public AuthorDto saveAuthor(AuthorDto authorDto){
        Author author = authorMapper.dtoToEntity(authorDto);
        return authorMapper.entityToDto(authorRepository.save(author));
    }
}
