/**
 * 
 */
package tx2;

/**
 * 
 */
public class Product {

	/**
	 * @param args
	 */
	
	protected String product_id ; 
	protected String product_name ;
	protected int product_price ;
	protected int product_total ;

	
	public Product() {
		
		
	}

	public Product(String product_id, String product_name, int product_price, int product_total) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_total = product_total;
	}

	
	
	public String getProduct_id() {
		return product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public int getProduct_price() {
		return product_price;
	}

	public int getProduct_total() {
		return product_total;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	public void setProduct_total(int product_total) {
		this.product_total = product_total;
	}

	@Override
	public String toString() {
		return "id=" + product_id + ", name=" + product_name + ", price="
				+ product_price + ", total=" + product_total + ",";
	}

}
