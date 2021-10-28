package com.example.crsswebservice.controller;

import com.example.crsswebservice.model.Item;
import com.example.crsswebservice.repos.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class ItemController {
    @Autowired
    ItemRepository itemRepo;

    @RequestMapping("/items")
    @ResponseBody
    public ResponseEntity<List<Item>> getAllItems(){
        List<Item> items =  itemRepo.findAll();
        return new ResponseEntity<List<Item>>(items, HttpStatus.OK);
    }

    @GetMapping("/item/{itemId}")
    @ResponseBody
    public ResponseEntity<Item> getItem(@PathVariable Long itemId){
        Optional<Item> item = itemRepo.findById(itemId);
        return new ResponseEntity<Item>(item.get(), HttpStatus.OK);
    }

    @PostMapping(value = "/add",consumes = {"application/json"},produces = {"application/json"})
    @ResponseBody
    public ResponseEntity<Item> addItem(@RequestBody Item item, UriComponentsBuilder builder){
        itemRepo.save(item);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/addItem/{id}").buildAndExpand(item.getId()).toUri());
        return new ResponseEntity<Item>(headers, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    @ResponseBody
    public ResponseEntity<Item> updateItem(@RequestBody Item item){
        if(item != null){
            itemRepo.save(item);
        }
        return new ResponseEntity<Item>(item, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public ResponseEntity<Void> deleteItem(@PathVariable Long id){
        Optional<Item> item = itemRepo.findById(id);
        itemRepo.delete(item.get());
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }
}
