package testUsabile;

public class Computer implements Usabile {

	
	//per le interfaccie si usa implements e non extends
	
	@Override
	public void usa() {
		System.out.println("il pc si usa con la tastiera");
	}

}
