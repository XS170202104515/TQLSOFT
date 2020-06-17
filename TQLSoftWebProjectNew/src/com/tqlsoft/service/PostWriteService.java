package com.tqlsoft.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import com.tqlsoft.dao.PostDaoImpl;
import com.tqlsoft.dao.PostWriteDao;
import com.tqlsoft.entity.TPost;
import com.tqlsoft.entity.TPost;

@Transactional
public class PostWriteService {

	private PostWriteDao postwritedao;
	
	public PostWriteDao getPostwritedao() {
		return postwritedao;
	}

	public void setPostwritedao(PostWriteDao postwritedao) {
		this.postwritedao = postwritedao;
	}



	public void add(String forumid,String posttitle ,String postcontent){
		System.out.println("到达service层");
		postwritedao.add(forumid, posttitle , postcontent);
	}
}
