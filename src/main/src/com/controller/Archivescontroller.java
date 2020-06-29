package com.controller;

import com.entity.XoaArchives;
import com.service.ArchivesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/xoa/cache")
public class Archivescontroller {
    @Autowired
    private ArchivesService archivesService;

    @RequestMapping("/query")
    @ResponseBody
    public List<XoaArchives> query(String id){
            return archivesService.queryList();
    }


    @RequestMapping("/del")
    @ResponseBody
    @CacheEvict(value = "archives",allEntries = true)
    public void del(@RequestParam(value = "id",required =true) String id){
        archivesService.deletebyid(id);
    }
}
