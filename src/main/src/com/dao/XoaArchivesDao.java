package com.dao;

import com.entity.XoaArchives;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface XoaArchivesDao {


    public List<XoaArchives> queryXoaarchives();

    public void deleteXoarchives(String id);
}
