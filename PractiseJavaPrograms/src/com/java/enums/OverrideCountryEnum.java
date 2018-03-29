package com.java.enums;

public enum OverrideCountryEnum {

	IN{
		@Override
		public String toString() {
			return "India";
		}
	},
	US{
		@Override
		public String toString() {
			return "UnitedStates";
		}
	},
	UK{
		@Override
		public String toString() {
			return "Unitedkingdom";
		}
	},
	AUS{
		@Override
		public String toString() {
			return "Austrelia";
		}
	}
}
