package com.web.dao;

import java.util.List;

import com.web.entity.Resource;

public interface resourceDao {
	List<Resource> getResources();
	Resource getResource(Long resourceId);
	List<Resource> getResourcesBykw(String keyword);
}
