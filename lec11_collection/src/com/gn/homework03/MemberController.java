package com.gn.homework03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MemberController {

	private Map<String, Member> map = new HashMap<String, Member>();
	
	public boolean joinMember(String id, Member m) {
		boolean result = false;
		
		if(map.containsKey(id)) {
			result = false;
		} else {
			map.put(id, m);
			result = true;
		}
		
		return result;
	}
	
	public String login(String id, String password) {
		
		if(map.containsKey(id)) {
			if(map.get(id).getPassword().equals(password)) {
				return map.get(id).getName();
			} else {
				return null;
			}
		}
		return null;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		boolean result = false;
		
		if(map.containsKey(id) && oldPw.equals(map.get(id).getPassword())) {
			map.get(id).setPassword(newPw);
			return true;
		}
		return result;
	}
	
	public String changeName(String id, String pwd, String newName) {
		
		String name = "";
		
		if(map.get(id).getPassword().equals(pwd)) {
			name =  map.get(id).getName();
			map.get(id).setName(newName);
		}
		
		return name;
	}
	
	public TreeMap<String, String> sameName(String name) {
		TreeMap<String, String> samePeoples = new TreeMap<String, String>();
		
		Set<Entry<String, Member>> memberSet = map.entrySet();
		Iterator<Entry<String, Member>> entryIterator = memberSet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Member> member = entryIterator.next();
			String key = member.getKey();
			Member value = member.getValue();
			if(map.get(key).getName().equals(name)) {
				samePeoples.put(key, value.getName());
			}
		}
		
		return samePeoples;
	}
}
