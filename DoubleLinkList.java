package one;


import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class DoubleLinkList implements Serializable{
	

	private static final long serialVersionUID = -2038399718035716792L;
	
	private List<intern>  interHolder = new LinkedList<intern>();
	
	protected void addIntern(intern arg){
		
		this.interHolder.add(arg);
	}
	
	protected intern getIntern(int index){
		
		if(this.interHolder.size()==0)
			return null;
			
		return this.interHolder.get(index);
	}
	
	
	protected List<intern> getInternHolder(){
		
		return this.interHolder;
	}
}
