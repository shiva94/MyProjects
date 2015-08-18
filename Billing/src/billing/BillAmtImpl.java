package billing;

import javax.jws.WebService;

@WebService(endpointInterface="billing.BillAmt")
public class BillAmtImpl implements BillAmt{

	@Override
	public float disAmt(float a, float b) {
		// TODO Auto-generated method stub
		return  ((a*b)/100);
	}
	
}
