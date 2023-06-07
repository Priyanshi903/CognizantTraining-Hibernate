package com.cognizant.truyum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.truyum.dao.MenuItemDao;
import com.cognizant.truyum.dao.MenuItemDaoCollectionImpl;
import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.repository.MenuItemRepository;

@Service
public class MenuItemService {
	
	@Autowired
	private MenuItemRepository menuItemRepository;


	@Transactional
	public void saveMenuItem(MenuItem menuItem) {
		menuItemRepository.save(menuItem);
	}
	
	@Transactional
	public List<MenuItem> getMenuItemListAdmin() {
		return menuItemRepository.findAll();
	}

	@Transactional
	public List<MenuItem> getMenuItemListCustomer() {
		return menuItemRepository.findByActiveDateOfLaunchLessThan();
	}

	@Transactional
	public MenuItem getMenuItem(long id) {
		return menuItemRepository.findById((long) id).get();
	}

	@Transactional
	public void modifyMenuItem(long id,float price) {
		MenuItem menuItem=menuItemRepository.findById((long) id).get();
		menuItem.setPrice(price);
		menuItemRepository.save(menuItem);
	}


}
