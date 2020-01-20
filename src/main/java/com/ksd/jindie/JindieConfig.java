package com.ksd.jindie;



public class JindieConfig {
	//sx!87yb_
	public static String name(String josn,String sFormId ) throws Exception {
		//InvokeHelper.POST_K3CloudURL = "http://desktop-5bj1dnp/k3cloud/";
		InvokeHelper.POST_K3CloudURL = "http://laptop-1c8i08f9/K3Cloud/";
		//String dbId = "5dcc21fa491102";

		String dbId = "5e1bc7219f7260";  //
		String uid = "Administrator";
		String pwd = "ksd2019@";
		int lang = 2052;
		String result = null;
		if (InvokeHelper.Login(dbId, uid, pwd, lang)) {

			// 销售订单保存测试
			// 业务对象Id
			// 需要保存的数据
			// 如下字段可能需要根据自己实际值做修改
			// FCustId FSalerId FMaterialId FUnitID
		 result=InvokeHelper.Save(sFormId, josn);
			System.out.println("hola success");
		}
	     	return result;
	}

}
