package com.service;

import com.entity.XoaArchives;

import java.util.List;

public interface ArchivesService {

    public List<XoaArchives> queryList();

    public void deletebyid(String id);
}
