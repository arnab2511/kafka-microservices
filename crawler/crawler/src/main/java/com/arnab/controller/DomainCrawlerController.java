/**
 * 
 */
package com.arnab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arnab.service.DomainCrawlerService;

/**
 * @author arnab
 *
 */
@RestController
@RequestMapping("/domain")
public class DomainCrawlerController {

	@Autowired
	DomainCrawlerService service;
	
	@GetMapping("/lookup/{name}")
	public String lookup(@PathVariable("name") String name) {
		service.crawl(name);
		return "The domain crwaler has scrapped your data : "+name;
		
	}
	
	
}
