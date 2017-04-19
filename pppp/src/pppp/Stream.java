package pppp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	// 使用命令式范式实现
	public static String getNamesStringImperatively(List<String> nameList) {
		List<String> namelist = new ArrayList<>();
		/*if(nameList.get(0) == ""){
			return null;
		}else*/
		    for(int i = 0; i < nameList.size(); i++){
			    if(nameList.get(i).length() != 1){
				
				namelist.add(operator(nameList.get(i)));
//			    namelist.add(namelist.get(i).substring(0,1).toUpperCase() + namelist.get(i).substring(1));
			    };
			
		    };
		return String.join(",",namelist);
	}

	// 使用函数式范式实现
	public static String getNamesStringFunctionally(List<String> nameList) {
		return nameList.stream()
				       .filter(a -> a.length() != 1)
				       .map(b -> (Character.toUpperCase(b.charAt(0)) +b.substring(1)))
				       .collect(Collectors.joining(","));
	 }

	private static String operator(String name){
    	return name.substring(0,1).toUpperCase()+name.substring(1);
    }
}

