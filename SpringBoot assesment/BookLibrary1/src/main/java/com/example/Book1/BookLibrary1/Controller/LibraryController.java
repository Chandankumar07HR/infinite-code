package com.example.Book1.BookLibrary1.Controller;


import com.example.Book1.BookLibrary1.DTO.LibraryDto;
import com.example.Book1.BookLibrary1.Exception.HndLibraryException;
import com.example.Book1.BookLibrary1.Service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @PostMapping("/add")
    public LibraryDto addLibBook(@RequestBody LibraryDto libraryDto){
        return this.libraryService.addLibBook(libraryDto);
    }

    @PutMapping("/update/{id}")
    public LibraryDto updateLibBook(@RequestBody LibraryDto libraryDto, @PathVariable("id")int id){
        return  this.libraryService.updateLibBook(libraryDto,id);
    }

    @GetMapping("/get/{id}")
    public LibraryDto getById(@PathVariable("id") int id){
        return this.libraryService.getById(id);
    }

    @GetMapping("/get")
    public List<LibraryDto> getAllBooks(){
        List<LibraryDto> list = this.libraryService.getAllBooks();
        return list;
    }


    @DeleteMapping("/delete/{id}")
    public void deleteLibBook(@PathVariable("id") int id) throws HndLibraryException{
         LibraryDto libraryDto = this.libraryService.getById(id);
         if (libraryDto==null){
             throw new HndLibraryException("Service.Library_Book_NOt_found");

         }else
             this.libraryService.deleteLibBook(id);
    }




}
