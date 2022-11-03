package com.example.Book1.BookLibrary1.Repository;

import com.example.Book1.BookLibrary1.DTO.LibraryDto;
import org.springframework.data.repository.CrudRepository;

public interface LibraryRepo extends CrudRepository<LibraryDto,Integer> {

    public LibraryDto findById(int libraryId);
}
