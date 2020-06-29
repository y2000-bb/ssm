package com.service.impl;

import com.dao.XoaArchivesDao;
import com.entity.XoaArchives;
import com.service.ArchivesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArchivesServiceImpl implements ArchivesService {

    @Autowired
    private XoaArchivesDao xoaArchivesDao;
    @Cacheable(value = "archives")
    @Override
    public List<XoaArchives> queryList() {
        List<XoaArchives> list = xoaArchivesDao.queryXoaarchives();
        return list;
    }

    @Override
    public void deletebyid(String id) {
        xoaArchivesDao.deleteXoarchives(id);
    }
}
