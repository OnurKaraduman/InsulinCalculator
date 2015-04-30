package com.iuce.constants;

public class Constant {
	public static long SLEEP_TIME = 2500; // Thread Calisma Suresi
	public static String PACKAGE_NAME = "com.iuce.insulinHesaplama";
	public static String PROJECT_TAG = "DiaryProject";

	// genel bilgiler
	public static String DATABASE_NAME = "insulin.db";
	public static int DATABASE_VERSION = 1;
	public static String INSULIN_TABLE = "insulin";

	public static String DB_PATH = "content://" + PACKAGE_NAME + "/insulin";

	// insulin tablosu kolon isimleri
	public static String INSULIN_ID = "id";
	public static String INSULIN_KANSEKERI = "kanSekeri";
	public static String INSULIN_MIKTARI = "insuliMiktari";
	public static String INSULIN_TARIH = "insulinDate";

	// insulin tablo create
	public static String CREATE_INSULIN_TABLE = "create table " + INSULIN_TABLE
			+ "( " + INSULIN_ID + " integer primary key autoincrement, "
			+ INSULIN_KANSEKERI + " float, " + INSULIN_MIKTARI + " float, "
			+ INSULIN_TARIH + " text);";

	// Kahvaltiliklerin 100 gr üzerinden kalori degerleri...
	public static int kaloripeynir = 393;
	public static int kaloridereotu = 55;
	public static int kalorizeytin = 353;
	public static int kaloribal = 304;
	public static int kaloridomates = 17;
	public static int kaloritereyag = 717;
	public static int kalorisalatalik = 12;
	public static int kalorirecel = 285;
	public static int kaloriyumurta = 210;
	public static int kalorikasar = 413;
	public static int kaloriyogurt = 66;
	public static int kaloriekmek = 256;
	public static int kalorikaymak = 208;
	public static int kaloricay = 0;
	public static int kalorimarul = 16;
	public static int kalorimeyvesuyu = 45;
	public static int kalorisucuk = 452;
	public static int kalorisut = 45;

	// Ýlaçlarýn deðerleri...
	public static double lantus = 30.1;
	public static double humulin = 62;

	// Aylar...
	public static String aylar[] = { null, "Ocak", "Þubat", "Mart", "Nisan",
			"Mayýs", "Haziran", "Temmuz", "Aðustos", "Eylül", "Ekim", "Kasým",
			"Aralýk" };

	public static String aylarIng[] = { null, "Jan", "Feb", "Mar", "Apr",
			"May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	// Raporlama için Sabit...
	public static int karar;
	public static String secim;

}