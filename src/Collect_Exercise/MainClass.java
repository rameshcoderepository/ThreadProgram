package Collect_Exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass {

	public static void main(String abvs[]) {

		ResponseClass responseClass = new ResponseClass();

		List<PrimaryData> primaryresponse = responseClass.getPrimaryDataResponse();
		List<SecondaryData> secondaryresponse = responseClass.getSecondaryDataResponse();

		Map<String, PrimaryData> primaryMap = new HashMap<String, PrimaryData>();
		if (primaryresponse != null) {

			for (PrimaryData pd : primaryresponse) {

				if (pd != null) {

					String mob = pd.getMobileNumber();
					String name = pd.getName();
					primaryMap.put(mob, pd);
					System.out.println("MobileNUmber:" + " " + mob + "Name:" + " " + name);
				}
			}
		}

		if (secondaryresponse != null) {

			for (SecondaryData sd : secondaryresponse) {
				if (sd != null) {
					String mon = sd.getMobileNumber();
					PrimaryData pdata = primaryMap.get(mon);

					String m= pdata.getMobileNumber();
					String n= pdata.getName();
//					String a=sd.getAddress();
//					
//					stmt.executeUpdate(insert into table(mob,name,addr) values('"+m+"'));
				}
			}
		}

	}

}
