package it.unibo.oop.lab.nesting2;

import java.util.Iterator;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {
	private final List<T> acceptableList;
	
	public OneListAcceptable(List<T> list){
		this.acceptableList = list;
	}
	
	@Override
	public Acceptor<T> acceptor() {
		
		return new Acceptor<T>() {
			private Iterator<T> iterator = acceptableList.iterator();
			@Override
			public void accept(T newElement) throws ElementNotAcceptedException, EndNotAcceptedException {
				if(!(iterator.hasNext())) {
					throw new EndNotAcceptedException();
				}
				if(!(newElement.equals(iterator.next()))){
					throw new ElementNotAcceptedException(newElement);
				}
				
			}

			@Override
			public void end() throws EndNotAcceptedException {
				if(iterator.hasNext()) {
					throw new EndNotAcceptedException();
				}
			}
			
		};
	}

}
