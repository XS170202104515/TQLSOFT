package com.tqlsoft.dao;

import java.util.ArrayList;
import java.util.List;

import com.tqlsoft.entity.TGame;
import com.tqlsoft.entity.TGameLibrary;

public interface GameDao {
	List<TGame> choseGame();
	List<TGame> getGame();
	List<TGameLibrary> getPersonalGame(String username);
}
