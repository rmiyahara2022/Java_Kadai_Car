class Car4 {
	// メンバ変数
	private int no;
	static private int count = 0;
	//private int count = 0;
	
	// コンストラクタ
	public Car4(){
		no = 0;
		count++;
		System.out.println("ナンバーなしを作りました");
	}
	public Car4(int n){
		no = n;
		count++;
		System.out.println("ナンバー" + no + "を作りました");
	}
	
	// メソッド
	public void display() {
		System.out.println(count + "台作成済みです");
	}
}
