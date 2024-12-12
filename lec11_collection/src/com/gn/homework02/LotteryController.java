package com.gn.homework02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LotteryController {

	private Set<Lottery> lottery = new HashSet<Lottery>();
	private Set<Lottery> win = new HashSet<Lottery>();
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}
	
	public boolean deleteObject(Lottery l) {
		boolean result = false;
		
		if(lottery.remove(l) && win.isEmpty()) {
			win.remove(l);
			result = true;
		}
		
		return result;
	}
	
	public Set<Lottery> searchObject() {
		return lottery;
	}
	
	public Set<Lottery> winObject() {
		
		if(lottery.size() < 4) {
			return null;
		}
		
		List<Lottery> tempList = new ArrayList<Lottery>();
		Iterator<Lottery> iterator = lottery.iterator();
		while(iterator.hasNext()) {
			Lottery lott = iterator.next();
			tempList.add(lott);
		}
		
		int winnerCount = 4;
		List<Integer> choose = new ArrayList<Integer>();
		while(winnerCount != 0) {
			int index = (int)(Math.random() * tempList.size());
			if(!choose.contains(index)) {
				win.add(tempList.get(index));
				choose.add(index);
				winnerCount--;
			}
		}
		
		return win;
	}
	
	public Set<Lottery> sortedWinObject() {
		Set<Lottery> sortWin = new TreeSet<Lottery>(win);
		
		return sortWin;
	}
	
	public boolean searchWinnder(Lottery l) {
		boolean result = false;
		
		if(win.contains(l)) {
			result = true;
		}
		
		return result;
	}

}
