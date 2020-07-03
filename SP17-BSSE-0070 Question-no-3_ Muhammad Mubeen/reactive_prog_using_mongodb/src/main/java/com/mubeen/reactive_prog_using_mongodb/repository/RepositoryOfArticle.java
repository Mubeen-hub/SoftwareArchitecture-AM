/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mubeen.reactive_prog_using_mongodb.repository;
import com.mubeen.reactive_prog_using_mongodb.document.Article;
import org.springframework.data.mongodb.repository.MongoRepository;


/**
 *
 * @author mubeen
 */


public interface RepositoryOfArticle extends MongoRepository <Article, Integer>{
    
}
