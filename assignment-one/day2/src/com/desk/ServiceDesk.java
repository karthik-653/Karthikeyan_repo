package com.desk;

import com.restraunt.Restraunt;

public class ServiceDesk {
	private Restraunt r;

	public ServiceDesk(Restraunt r) {
		super();
		this.r = r;
	}
	public String placeOrder(String food) {
		return r.prepareFood(food);
	}

}
