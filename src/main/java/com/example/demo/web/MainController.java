/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.demo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Joe Grandja
 */
@Controller
public class MainController {

	Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/")
	public String root() {
		return "redirect:/index";
	}

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/user/index")
	public String userIndex(HttpServletRequest httpRequest) {
		log.error("用户:{}",httpRequest.getRemoteUser());
		log.error("用户:{}",httpRequest.getUserPrincipal());
		log.error("用户:{}",httpRequest.isUserInRole("USER"));
		return "user/index";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping("/login-error")
	public String loginError(Model model) {
		model.addAttribute("loginError", true);
		return "login";
	}
	AtomicInteger i = new AtomicInteger();
	@GetMapping("/test")
	@CrossOrigin
	@ResponseBody
	public String test(){
		i.getAndIncrement();
		ResponseEntity<String> responseEntity = restTemplate.getForEntity("https://www.baidu.com/s?ie=utf-8&f=3&rsv_bp=1&rsv_idx=1&tn=baidu&wd=%E5%B1%B1%E4%B8%9C%E5%AF%8C%E5%A3%AB%E7%94%B5%E6%A2%AF&oq=%25E9%25A1%25BA%25E4%25B8%25B0&rsv_pq=efa7451d0004506a&rsv_t=55aaO6aFjDz%2BX0xzktDDSspPh3FT2jYxVBjwd1mFQ5qkM1uGZB35gxH3Wy8&rqlang=cn&rsv_enter=0&rsv_sug3=7&rsv_sug1=7&rsv_sug7=100&rsv_sug2=1&prefixsug=sdf&rsp=0&inputT=2648&rsv_sug4=2649", String.class);
		return responseEntity.getBody();
	}

}
