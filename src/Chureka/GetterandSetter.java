package Chureka;

 class man {
	   private String name; // private = restricted access

	  // Getter
	  public String getName() {
	    return name;
	  }

	  // Setter
	  public void setName(String newName) {
	    this.name = newName;
	  }
	}
public class GetterandSetter {

	public static void main(String[] args) {
		man s= new man();
		s.setName("chandan");
		System.out.println(s.getName());
	}

}
