package com.fuhrmannmaciej.mybookapp.service;

import com.fuhrmannmaciej.mybookapp.entity.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;


@Service
public class NewsService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${operations.serviceURL}")
    String serviceURL;

    @Transactional
    public News findAllNews() {
        return restTemplate.getForObject(serviceURL, News.class);
    }

    @Bean
    public RestTemplate rest() {
        return new RestTemplate();
    }
}
