package one;

import java.io.Serializable;
import java.util.LinkedList;

public class List implements Serializable  {
	
	List prev;
	List next;
	java.util.List<intern> sukran = new LinkedList<>(); 
	
	public void setPrev(List prev){
		this.prev = prev;
	}
	public List getPrev(){
		return this.prev;
	}
	public void setNext(List next){
		this.next = next;
	}
	public List getNext(){
		return this.next;
	}
}
