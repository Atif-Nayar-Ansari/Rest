package com.apps;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address {

		private int aid;
		private String loc;
		
		
		public int getAid() {
			return aid;
		}
		public void setAid(int aid) {
			this.aid = aid;
		}
		public String getLoc() {
			return loc;
		}
		public void setLoc(String loc) {
			this.loc = loc;
		}
		@Override
		public String toString() {
			return "Address [aid=" + aid + ", loc=" + loc + "]";
		}
		
}
