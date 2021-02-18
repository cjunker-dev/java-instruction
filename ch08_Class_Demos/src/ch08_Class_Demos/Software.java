package ch08_Class_Demos;

import Product;

public class Software extends Product {
		private String version;

		public Software(String code, String description, double price, String version) {
			super(code, description, price);
			this.version = version;
		}

		@Override
		public String toString() {
			return "Software [version=" + version + ", toString()=" + super.toString() + "]";
		}

		public String getVersion() {
			return version;
		}

		public void setVersion(String version) {
			this.version = version;
		}
		
		
	}


