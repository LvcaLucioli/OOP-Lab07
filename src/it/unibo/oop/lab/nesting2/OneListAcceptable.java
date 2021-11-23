package it.unibo.oop.lab.nesting2;

import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {
	private final List<T> acceptableList;
	
	public OneListAcceptable(List<T> list){
		this.acceptableList = list;
	}
	
	@Override
	public Acceptor<T> acceptor() {
		
		return new Acceptor<OneListAcceptable.T>() {
		};
	}

}
