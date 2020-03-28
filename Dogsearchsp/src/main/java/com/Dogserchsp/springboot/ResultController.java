package com.Dogserchsp.springboot;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Dogserchsp.springboot.form.SearchForm;



@Controller
public class ResultController {


	@Autowired
	private JdbcTemplate jdbc;

	@RequestMapping(value="/search*", method=RequestMethod.GET)
	private ModelAndView list(@RequestParam(value="hair",required=false)String hair,
			@RequestParam(value="size",required=false)String size,
			@RequestParam(value="specialties",required=false)String specialties,
			ModelAndView mav) {

		SearchForm sf = new SearchForm();
		sf.setHair(hair);
		sf.setSize(size);
		sf.setSpecialties(specialties);

		String sql = "SELECT species,specialty FROM dogs WHERE hair =" + "'"+ hair +"'"+ " AND size = " +"'"+ size +"'"+ " AND specialty LIKE '%"+specialties+"%'";
		List<Map<String,Object>> dogs = jdbc.queryForList(sql);
		mav.addObject("dogs",dogs);
		mav.setViewName("results");
		return mav;


	}
}

