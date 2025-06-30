package accessModifier02;

import accessModifier01.Parents;

public class OuterClass {
	public void printAccess() {
		Parents p = new Parents();
		System.out.println(p.publicVar);
		
		
		
	}
}
