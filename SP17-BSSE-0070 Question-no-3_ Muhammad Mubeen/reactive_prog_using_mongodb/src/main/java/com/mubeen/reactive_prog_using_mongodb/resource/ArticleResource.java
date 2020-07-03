/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mubeen.reactive_prog_using_mongodb.resource;

import com.mubeen.reactive_prog_using_mongodb.document.Article;
import com.mubeen.reactive_prog_using_mongodb.repository.RepositoryOfArticle;
import java.util.List;
import java.util.Arrays;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mubeen
 */


@RestController
@RequestMapping("/restservice/article")


public class ArticleResource {
    
    private RepositoryOfArticle articleRepository;
    
    public ArticleResource(RepositoryOfArticle articleRepository){
		this.articleRepository= articleRepository;
	}
	
	@GetMapping("/insertnew")
        public String insertrow(@RequestParam(name="id") int id,
                @RequestParam(name="description")String description,
                @RequestParam(name="label") String label,
                @RequestParam(name="vendor")String vendor) {
            Article classObject = new Article(id,label,description,vendor);
            articleRepository.insert(classObject);
            return "Single row has been inserted !!";
        }
        
        @GetMapping("/findall")
	public List<Article> getAll(){
            return  articleRepository.findAll();
	}
        
        @GetMapping("/deleteall")
        public String deleteAll(){
            articleRepository.deleteAll();
            return "All data deleted from Database";
        }
        
        @GetMapping("/deletebyid")
        public String deleteById(@RequestParam int id) {
            articleRepository.deleteById(id);
            return "The row has been deleted";
        }
        
        @GetMapping("/findbyid")
        public List findbyid(@RequestParam int id) {
            Article returnedObject = articleRepository.findById(id).get();
            List convertedToList = Arrays.asList(returnedObject);
            return convertedToList;
        }
}