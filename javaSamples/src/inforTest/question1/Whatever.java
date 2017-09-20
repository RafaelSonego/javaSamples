package inforTest.question1;

import java.util.Map;

public class Whatever {

	public void processOrder1(Order order, Map<Long, String> reliefOrderMap, OrderSummary sum) {
		for (int d = 0; d < order.getOrderDetails().size();) {
			OrderDetail dtl = order.getOrderDetails().get(d);
			sum.setWork(true);
			verifyIsReliefOrder(reliefOrderMap, sum, dtl);
			break;
		}
	}

	private void verifyIsReliefOrder(Map<Long, String> reliefOrderMap, OrderSummary sum, OrderDetail dtl) {
		if (dtl.getRelblkId() != null && dtl.getOrdersumRefId() != null && dtl.getOrdersumParentId() != null) {
			sum.setIsReliefOrder("Y");
			reliefOrderMap.put(dtl.getOrdersumId(), "Y");
		}
	}
	
	public void processOrder(Order order, Map<Long, String> reliefOrderMap, OrderSummary sum) {
        for (int d = 0; d < order.getOrderDetails().size(); ) {
            OrderDetail dtl = order.getOrderDetails().get(d);
            if (dtl.getOrderstatId() == 0 || dtl.getOrderstatId() == 2 || dtl.getOrderstatId() == 4) {
                sum.setWork(true);
                if (dtl.getRelblkId() != null && dtl.getOrdersumRefId() != null && dtl.getOrdersumParentId() != null) {
                    sum.setIsReliefOrder("Y");
                    reliefOrderMap.put(dtl.getOrdersumId(), "Y");
                }
            } else {
                if (dtl.getRelblkId() != null && dtl.getOrdersumRefId() != null && dtl.getOrdersumParentId() != null) {
                    sum.setWork(true);
                    sum.setIsReliefOrder("Y");
                    reliefOrderMap.put(dtl.getOrdersumId(), "Y");
                } else {
                    sum.setWork(true);
                }
            }
            break;
        }
    }

}
