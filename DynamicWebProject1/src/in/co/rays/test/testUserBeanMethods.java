package in.co.rays.test;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

public class testUserBeanMethods {
	public static void main(String[] args) throws Exception {
//		testInsert();
//		testUpdate();
//		testDelete();
//		testNextPK();
	}

	private static void testNextPK() throws Exception {
		UserModel model = new UserModel();
		model.nextPK();
	}

	private static void testDelete() throws Exception {
		UserModel model = new UserModel();
		model.deleteMethod();
	}

	private static void testUpdate() throws Exception {
		UserModel modal = new UserModel();
		modal.updateMethod();
	}

	private static void testInsert() throws Exception {
		UserModel modal = new UserModel();
		UserBean ubean = new UserBean();
		ubean.setId(1);
		ubean.setFirstName("Shubham");
		ubean.setLastName("Prajapati");
		ubean.setLoginId("prajapati56587@gmail.com");
		ubean.setPassword("Jyoti@2004");
		ubean.setAddress("243, Ward no. 8, Lunhera Bujurg");

		modal.insertMethod(ubean);
	}

}
