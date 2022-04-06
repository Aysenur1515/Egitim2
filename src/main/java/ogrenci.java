public class ogrenci {
            
	public int id;
	
	public String isim;
	
	public String soyisim;
	
	private int yas;
	
	public void bilgileriYazdır() {
		
		System.out.println("İd : " + id);
		System.out.println("İsim : " + isim);
		System.out.println("Soyisim : " + soyisim);
			
	}
	
	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}
}
