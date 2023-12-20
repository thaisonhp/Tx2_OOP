/**
 * 
 */
package tx2;

/**
 * 
 */
public class Interior extends Product {

	private String Interior_type ; 
	private String Interior_shape ; 
	private String Interior_color ; 

	public Interior() {
		
	}



	public Interior(String product_id, String product_name, int product_price, int product_total, String interior_type,
			String interior_shape, String interior_color) {
		super(product_id, product_name, product_price, product_total);
		Interior_type = interior_type;
		Interior_shape = interior_shape;
		Interior_color = interior_color;
	}




	public String getInterior_type() {
		return Interior_type;
	}


	public String getInterior_shape() {
		return Interior_shape;
	}


	public String getInterior_color() {
		return Interior_color;
	}


	public void setInterior_type(String interior_type) {
		Interior_type = interior_type;
	}


	public void setInterior_shape(String interior_shape) {
		Interior_shape = interior_shape;
	}


	public void setInterior_color(String interior_color) {
		Interior_color = interior_color;
	}

	@Override
	public String toString() {
		return "Interior ["+super.toString()+"type=" + Interior_type + ", shape=" + Interior_shape + ", color="
				+ Interior_color + "]";
	}

	


}
