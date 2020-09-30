package com.app;

public class Customer {

		private int cid;
		private String cname;
		private double amt;
		
		
		public Customer() {

		}


		public int getCid() {
			return cid;
		}


		public void setCid(int cid) {
			this.cid = cid;
		}


		public String getCname() {
			return cname;
		}


		public void setCname(String cname) {
			this.cname = cname;
		}


		public double getAmt() {
			return amt;
		}


		public void setAmt(double amt) {
			this.amt = amt;
		}


		@Override
		public String toString() {
			return "Customer [cid=" + cid + ", cname=" + cname + ", amt=" + amt + "]";
		}
}
