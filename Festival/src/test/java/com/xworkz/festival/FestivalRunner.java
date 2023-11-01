package com.xworkz.festival;

import java.text.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.festival.app.Bakrid;
import com.xworkz.festival.app.Christmas;
import com.xworkz.festival.app.Diwali;
import com.xworkz.festival.app.Dussehra;
import com.xworkz.festival.app.Eid;
import com.xworkz.festival.app.Festival;
import com.xworkz.festival.app.GaneshChaturthi;
import com.xworkz.festival.app.RakshaBandhan;
import com.xworkz.festival.app.Ramanavami;
import com.xworkz.festival.app.Sankranti;
import com.xworkz.festival.app.Ugadi;
import com.xworkz.festival.config.FestivalConfig;

public class FestivalRunner {
	//spring core -> beans - creates objects or methods
	//spring mvc
	//spring jpa
	public static void main(String[] args) {
		// loose coupling and tight coupling

//		Dussehra fest = new Dussehra();//tightly coupled
//		Diwali fest1 = new Diwali();
//		Festival fest = new Dussehra();//loosley coupled
		
		ApplicationContext context = new AnnotationConfigApplicationContext(FestivalConfig.class);// we are getting the  object from spring																							
		Festival fest = context.getBean(Diwali.class);
		fest.celebrate();
		
		Festival fest0 = context.getBean(Dussehra.class);
		fest0.celebrate();
		
		Festival fest1 = context.getBean(Sankranti.class);
		fest1.celebrate();
		
		Festival fest2 = context.getBean(Bakrid.class);
		fest2.celebrate();
		
		Festival fest3 = context.getBean(Christmas.class);
		fest3.celebrate();
		
		Festival fest4 = context.getBean(GaneshChaturthi.class);
		fest4.celebrate();
		
		Festival fest5 = context.getBean(RakshaBandhan.class);
		fest5.celebrate();
		
		Festival fest6 = context.getBean(Ramanavami.class);
		fest6.celebrate();
		
		Festival fest7 = context.getBean(Ugadi.class);
		fest7.celebrate();
		
		Festival fest8 = context.getBean(Eid.class);
		fest8.celebrate();
	}
}
