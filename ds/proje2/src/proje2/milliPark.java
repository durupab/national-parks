package proje2;
public class milliPark {
	String milliPark_Adi;
	String il_Adlari;
	String ilan_Yili;
	Double yuz_Olcumu;
	
	public milliPark() {
		this.milliPark_Adi = null;
		this.il_Adlari = null;
		this.ilan_Yili = null;
		this.yuz_Olcumu = 0.0;
	}
	public milliPark(String milliPark_Adi,String il_Adlari,String ilan_Yili,Double yuz_Olcumu) {
		this.milliPark_Adi = new String(milliPark_Adi);
		this.il_Adlari = new String(il_Adlari);
		this.ilan_Yili = ilan_Yili;
		this.yuz_Olcumu= yuz_Olcumu;
	}

	public String getMilliPark_Adi() {
		return milliPark_Adi;
	}
	public void setMilliPark_Adi(String milliPark_Adi) {
		this.milliPark_Adi = milliPark_Adi;
	}
	public String getIl_Adlari() {
		return il_Adlari;
	}
	public void setIl_Adlari(String il_Adlari) {
		this.il_Adlari = il_Adlari;
	}
	public String getIlan_Yili() {
		return ilan_Yili;
	}
	public void setIlan_Yili(String ilan_Yili) {
		this.ilan_Yili = ilan_Yili;
	}
	public Double getYuz_Olcumu() {
		return yuz_Olcumu;
	}
	public void setYuz_Olcumu(Double yuz_Olcumu) {
		this.yuz_Olcumu = yuz_Olcumu;
	} 
	public String toString() {
		return milliPark_Adi+"   " + il_Adlari+ "    " + yuz_Olcumu+ "    " + ilan_Yili + "\n";
	} 

}
