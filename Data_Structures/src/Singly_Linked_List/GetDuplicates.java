package Singly_Linked_List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetDuplicates {
	
	private  List<Character> removeduplicate(String str){
		
		
		Map<Character,Integer> map=new HashMap<>();
		List<Character> list=new ArrayList<>();
		
		for(char ch:str.toCharArray()){
			map.put(ch,map.getOrDefault(ch, 0)+1);
		}
		
		for(char c:map.keySet()){
			if(map.get(c)>1){
				list.add(c);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="GaneshBabu";
		
		name=name.toLowerCase();
		
		GetDuplicates getDuplicates = new GetDuplicates();
		System.out.println(getDuplicates.removeduplicate(name));
		
	}

}
