package com.tiy.match;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by josh on 4/11/17.
 */

/**
 * @Controller is used to tell spring What class is is the controller
 * This is useed to scan for annotations like @RequestMapping.
 * Which is a Annotation that specifies what HTTP request
 * gets handing by the controller. Then it will declare what page needs
 * rendering to the browser
 */


@Controller
public class MatchController {
	/**
	 *This allow the property to connect to
	 * it class and access the data with out making a new instance
	 */
	@Autowired
	private MatchRepository repository;


	/**
	 * Here is an example of a RequestMapping that directs the browser to the url of /
	 * Im you were to try and go to the HTML page itself like you would with a HTMl page that
	 * sits in the static fold, the website will crash. unless you have your controller mapped
	 * out to that path with an @RequestMapping()
	 * @param model
	 * @return
	 */
	@RequestMapping("/")
	public String index(Model model){
		/**
		 *  The model that you see here allows use to send content to the webpage.
		 *  a model map takes a key and an object, you then would access that object
		 *  from the html using the key that you set. ex: ${key}
		 */
		model.addAttribute("images",repository.getImages());
		model.addAttribute("action","head");
		model.addAttribute("push","push it");
		/**
		 * Returns the page that you would like to show in the browser
		 * you do not need the whole file path Sping will find it for you.
		 */
		return "index";
	}
}
