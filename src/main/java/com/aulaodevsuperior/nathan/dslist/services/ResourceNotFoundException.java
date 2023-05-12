package com.aulaodevsuperior.nathan.dslist.services;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(Long id){
        super("Resource not found. ID:" + id);
    }
}
