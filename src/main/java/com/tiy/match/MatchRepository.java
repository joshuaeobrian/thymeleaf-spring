package com.tiy.match;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by josh on 4/11/17.
 */

/**
 * @Component allows you to connect class together when using @Autowire
 * This is needed if you are going to use a class and not initiating it
 * Spring will do all that for you.
 */
@Component
public class MatchRepository {
	private Random random = new Random();
	List<Image> images = Arrays.asList(new Image("java","svg"),
										new Image("react","png"),
			new Image("python","png"),
			new Image("mongo","png"),
			new Image("beer","svg"),
			new Image("ruby","png")
			);


	public ArrayList<Image> getImages(){
		ArrayList<Image> newList = new ArrayList<>();
		for(int i = 0; i < 24; i++){
			newList.add(images.get(random.nextInt(images.size())));
		}
		return newList;
	}
}
