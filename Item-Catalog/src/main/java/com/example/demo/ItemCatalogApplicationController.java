package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class ItemCatalogApplicationController {

  @GetMapping
  public String getPhotos(){      
      return "hello";
   }
}
