package model;

import java.util.List;

public class PostMutterLogic {
	public void execute(Mutter mutter, List<Mutter> mutterList) {
		for(Mutter a : mutterList) {
			System.out.println(a.getText());
		}
		mutterList.add(0, mutter);

	}
}
