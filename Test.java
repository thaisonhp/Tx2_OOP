/**
 * 
 */
package tx2;
import java.util.*;
/**
 * 
 */
public class Test {

	/**
	 * @param args
	 */
	private static  ArrayList<Product> ListInterior ; 

	public void generateInterior(int n) {
		ListInterior = new ArrayList<>();
		// TODO Auto-generated method stub
		// sinh ngau nhien ten Interior 
        String[] name = {"Lighting","Pillows","Paints","Rugs","Aromatherapy Diffusers"};
        
        String[] color = {"Red","Gray","Green","Blue","Brown","Yellow","Black","White"};
        
        String[] shape = {"Rectangle","Circle","Square","Triangle","Oval","Cone","Crescent"};
        
        String[] type = {"ocal","Global","Out Source","Public",};
        int cnt;
        for (int i = 0; i < n; i++) {
            // cap phat dong cho phan tu Students thu i
            Interior interior = new Interior();
            // tạo mã ngẫu nhiênet
            interior.setProduct_id("Interior" + i + "2004");
            // tạo tên ngẫu nhiên
            cnt = (int) (Math.random() * name.length);
            interior.setProduct_name(name[cnt]);
            // tao gia ngau nhien
            interior.setProduct_price((int) (Math.random()*1000000));
            interior.setProduct_total((int)(Math.random()*100));
            cnt = (int) (Math.random() * color.length);
            interior.setInterior_color(color[cnt]);
            cnt = (int) (Math.random() * shape.length);
            interior.setInterior_shape(shape[cnt]);
            cnt = (int) (Math.random() * type.length);
            interior.setInterior_type(type[cnt]);
            this.ListInterior.add(interior);
        }
	}	

	public void printListInterior(List<Interior> results) {
		// TODO Auto-generated method stub
		results.forEach(go->{
			System.out.println(go);
		});
	}
	public void printListInterior() {
		// TODO Auto-generated method stub
		ListInterior.forEach(go->{
			System.out.println(go);
		});
	}
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n = 20 + (int)(Math.random()*100);
		int n = 5 ;
		Test mot = new Test();
		// tao danh sach
		mot.generateInterior(n);
		mot.printListInterior();         
		//
		InteriorManagerIMP manager = new InteriorManagerIMP(ListInterior);
		// thuc hien them phan tu
        manager.addInterior(new Interior("Interior52004","Lighting", n, n, null, null, null));
        System.out.println("Danh sach sau khi them:");
        mot.printListInterior();
        System.out.println("------------------------------------------------------");
        // thuc hien sua phan tu
        manager.editInterior(new Interior("Interior02004",null, n, n, null, null, null));
        System.out.println("Danh sach sau khi sua la:");
        mot.printListInterior();  
        System.out.println("------------------------------------------------------");
        // thuc hien xoa phan tu 
        manager.delInterior(new Interior("Interior02004",null, n, n, null, null, null));
        System.out.println("Danh sach sau khi  xoa la:");
        mot.printListInterior();
        System.out.println("------------------------------------------------------");
        // thuc hien tim theo ten
        System.out.println("Danh sach tim theo ten la:");
        List<Interior> results = manager.searchInterior("Lighting");
        mot.printListInterior(results);
        System.out.println("------------------------------------------------------");
        // thuc hien xap xep theo gia 
        System.out.println("Danh sach sau khi sap xep:");
        mot.printListInterior(manager.sortedInterior(100));
        
	}

}
