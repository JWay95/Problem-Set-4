
public class Problem05 {

	public static void main(String[] args) {
		Item x = precedes("U");
		// x should equal "T"
	}
	
	public Item precedes(Item data) {
		if (data == first.item)
			return null;
		else {
			Node temp = first;
			return prcedes(data, temp);
		}		
	}
	
	public Item precedes(Item data, Node temp) {
		if (temp.next == null)
			return null;
		else if (temp.next.item.equals(data)){
			return temp.item;
		}
		else {
			temp = temp.next;
			return precedes(data, temp);
		}
	}
}