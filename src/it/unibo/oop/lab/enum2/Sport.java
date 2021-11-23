/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

	BASKET(Place.INDOOR, 5, "basketball"), VOLLEY(Place.INDOOR, 6, "volleyball"),
	TENNIS(Place.OUTDOOR, 1, "tennis"), BIKE(Place.OUTDOOR, 1, "biking"), F1(Place.OUTDOOR, 1, "formula 1"),
	MOTOGP(Place.OUTDOOR, 1, "motogp"), SOCCER(Place.OUTDOOR, 11, "soccer");
	
    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
	private Place place;
	private int noTeamMembers;
	private String actualName;
    
	private Sport(final Place place, final int noTeamMembers, final String actualName) {
		this.place = place;
		this.noTeamMembers = noTeamMembers;
		this.actualName = actualName;
	}

	public boolean isIndividualSport() {
		return (this.noTeamMembers == 1);
	}
	
	public boolean isIndoorSport() {
		return (this.place.equals(Place.INDOOR));
	}
	
	public Place getPlace() {
		return this.place;
	}
	
	public String toString() {
		return this.actualName + " is played " + this.place + " by " + this.noTeamMembers + " player/s";
	}
}
