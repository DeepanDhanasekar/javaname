package selenium;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class allname {
	public static void main(String[] args) {
		all a =new all();
		a.setUsername("java");
		a.setId(23456);
				all b=new all();
				b.setUsername("name");
	            b.setId(567);
	            java.util.List<all> li=new ArrayList();
	            li.add(a);
	            li.add(b);
	            for (int i = 0; i < li.size(); i++) {
					all all = li.get(i);
					System.out.println(all.getUsername());
	            	System.out.println(all.getId());
	            	
				}
	            
	            
	            
	            
	          //  List<all> li=new ArrayList<>();
//Set<all> n =new HashSet();
//n.add(a);
//n.add(b);
//for (all al : n) {
//	System.out.println(al.getUsername());
//System.out.println(al.getId());
//}
//	
//	            Map<Integer, all> m=new HashMap<>();
//	            m.put(45, a);
//	            m.put(78, b);
//	           Set<Entry<Integer,all>> entrySet = m.entrySet();
//	           for (Entry<Integer, all> entry : entrySet) {
//                  all value = entry.getValue();
//                  String username = value.getUsername();
//	        	   System.out.println(username);
//	        	   int id = value.getId();
//	        	   System.out.println(id);
//	        	   
//			}
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	}

}
