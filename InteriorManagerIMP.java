package tx2;

import java.util.*;



public class InteriorManagerIMP implements InteriorManager{
	private  ArrayList<Product> ListInterior ; 
	
	public InteriorManagerIMP() {
		ListInterior = new ArrayList<>();
    }

    public InteriorManagerIMP(ArrayList<Product> ListInterior) {
        this.ListInterior = ListInterior;
    }
	
	
	@Override
	public boolean addInterior(Interior i) {
		this.ListInterior.add(i);
		return true;
	}
	
	@Override
	public boolean editInterior(Interior i) {
	    // Tìm kiếm Interior cần sửa đổi trong ListInterior
	    for (Product product : ListInterior) {
	        if (product instanceof Interior) {
	            Interior existingInterior = (Interior) product;
	            // So sánh ID hoặc các thuộc tính khác để xác định có phải Interior cần sửa không
	            if (existingInterior.getProduct_id().equals(i.getProduct_id())) {
	            	System.out.println("------------------------------------------------------");
	                System.out.println("Found Interior to edit: " + existingInterior.toString());
	                // Sửa đổi thông tin theo yêu cầu từng phần
	                // Ví dụ: chỉ sửa đổi một số thông tin cần thiết
	                existingInterior.setProduct_name(i.getProduct_name());
	                existingInterior.setProduct_price(i.getProduct_price());
	                existingInterior.setInterior_type(i.getInterior_type());
	                existingInterior.setInterior_shape(i.getInterior_shape());
	                existingInterior.setInterior_color(i.getInterior_color());

	                // In ra thông tin sau khi sửa đổi
	                System.out.println("Updated Interior: " + existingInterior.toString());
	                System.out.println("------------------------------------------------------");
	                
	                // Trả về true để thể hiện sửa đổi đã được thực hiện thành công
	                return true;
	            }
	        }
	    }
	    // Trả về false nếu không tìm thấy Interior cần sửa trong ListInterior
	    return false;
	}


	@Override
	public boolean delInterior(Interior i) {
		// TODO Auto-generated method stub
		for (Product product : ListInterior) {
	        if (product instanceof Interior) {
	            Interior existingInterior = (Interior) product;
	            // So sánh ID hoặc các thuộc tính khác để xác định có phải Interior cần sửa không
	            if (existingInterior.getProduct_id().equals(i.getProduct_id())) {
	                ListInterior.remove(existingInterior);
	                // Trả về true để thể hiện sửa đổi đã được thực hiện thành công
	                return true;
	            }
	        }
	    }
		return false;
	}

	@Override
	// tim kiem theo ten 
	public List<Interior> searchInterior(String name) {
	    List<Interior> results = new ArrayList<>();
	    for (Product product : ListInterior) {
	        if (product instanceof Interior) {
	            Interior existingInterior = (Interior) product;
	            // Kiểm tra null trước khi sử dụng equals
	            if (existingInterior.getProduct_name() != null && existingInterior.getProduct_name().equals(name)) {
	                results.add(existingInterior);
	            }
	        }
	    }
	    return results;
	}


	@Override
	public List<Interior> sortedInterior(double price) {
		Collections.sort(this.ListInterior, Comparator.comparing(Product::getProduct_price));
		return (List) (this.ListInterior);
	}



}
