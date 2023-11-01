package com.xworkz.festival.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xworkz.festival.app.Bakrid;
import com.xworkz.festival.app.Christmas;
import com.xworkz.festival.app.Diwali;
import com.xworkz.festival.app.Dussehra;
import com.xworkz.festival.app.Eid;
import com.xworkz.festival.app.GaneshChaturthi;
import com.xworkz.festival.app.RakshaBandhan;
import com.xworkz.festival.app.Ramanavami;
import com.xworkz.festival.app.Sankranti;
import com.xworkz.festival.app.Ugadi;


@Configuration
public class FestivalConfig {// beans can be class or xml

//public String getString() {
//	String str = new String();
//	return str;
//	}

	@Bean
	public Dussehra getDussehra() { // beans generates objects
		Dussehra obj = new Dussehra();
		return obj;
	}

	@Bean
	public Diwali getDiwali() {
		return new Diwali();

	}

	@Bean
	public Sankranti getSankranti() {
		return new Sankranti();
	}

	@Bean
	public Bakrid getBakrid() {
		return new Bakrid();
	}

	@Bean
	public Christmas getChristmas() {
		return new Christmas();
	}

	@Bean
	public GaneshChaturthi getGaneshChaturthi() {
		return new GaneshChaturthi();
	}

	@Bean
	public RakshaBandhan getRakshaBandhan() {
		return new RakshaBandhan();
	}

	@Bean
	public Ramanavami getRamanavami() {
		return new Ramanavami();
	}

	@Bean
	public Ugadi getUgadi() {
		return new Ugadi();
	}
	
	@Bean
	public Eid getEid() {
		return new Eid();
	}

}
