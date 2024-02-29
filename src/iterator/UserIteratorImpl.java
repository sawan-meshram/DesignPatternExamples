package iterator;

import java.util.List;

public class UserIteratorImpl implements UserIterator{
	
	private List<User> userList;
	private int length;
	private int position = 0;
	
	public UserIteratorImpl(List<User> userList) {
		this.userList = userList;
		this.length = userList.size();
	}

	@Override
	public boolean hasNext() {
		if(position >= length)
			return false;
		return true;
	}

	@Override
	public Object next() {
//		User user = userList.get(position);
//		position++;
		
		return userList.get(position++);
	}
}
