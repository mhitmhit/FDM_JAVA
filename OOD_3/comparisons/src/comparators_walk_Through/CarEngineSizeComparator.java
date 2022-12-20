package comparators_walk_Through;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarEngineSizeComparator implements Comparator<Car> {

	public int compare(Car car1, Car car2) {
		if (car1.getEngineSize() < car2.getEngineSize())
			return -1;
		else if (car1.getEngineSize() > car2.getEngineSize())
			return 1;
		else
			return 0;
	}

}
