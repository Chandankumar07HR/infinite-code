package com.example.Book1.BookLibrary1.Exception;

public class HndLibraryException extends Exception{
    String msgs;

    public HndLibraryException(String msgs){
        this.msgs = msgs;
    }

    public String getMsgs(){
        return  this.msgs;
    }

}
