package com.tqlsoft.dao;

import java.util.ArrayList;
import java.util.Set;
import java.util.List;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.tqlsoft.entity.TGame;



public class Forumlmpl implements Forum {
	private HibernateTemplate hibernateTemplate;
	private TGame tgame;
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	public TGame getTgame() {
		return tgame;
	}


	public void setTgame(TGame tgame) {
		this.tgame = tgame;
	}


	public List<TGame> LoginCheck() {
		String queryString="FROM TGame";
		List<TGame> ls=(List<TGame>)hibernateTemplate.find(queryString);
		return ls;
	}



}
