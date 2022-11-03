package com.example.Book1.BookLibrary1.Service;

import com.example.Book1.BookLibrary1.DTO.LibraryDto;
import com.example.Book1.BookLibrary1.Repository.LibraryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LibraryService {

    @Autowired
    public LibraryRepo libraryRepo;


    public List<LibraryDto> getAllBooks(){
        List<LibraryDto> list = (List<LibraryDto>) this.libraryRepo.findAll();
        return list;
    }

    public LibraryDto getById(int id){
        LibraryDto lib =null;
        try{
            lib = this.libraryRepo.findById(id);

        }catch (Exception ex){
            System.out.println(ex);
        }
        return lib;
    }


    public LibraryDto addLibBook(LibraryDto lib1){
        LibraryDto res = this.libraryRepo.save(lib1);
        return res;
    }

    public void deleteLibBook(int id ){

        libraryRepo.deleteById(id);
    }

    public LibraryDto updateLibBook(LibraryDto libraryDto,int id){
        libraryDto.setBookId(id);
        libraryRepo.save(libraryDto);
        return libraryDto;
    }

}
