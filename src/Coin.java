
public class Coin {
	
	final static int HEADS = 1;
	final static int TAILS = 0;
	
	static int CoinsValue;
	static int CoinsBias;
	static int CoinsState;
	
	static int state;
	static int bias;
	static int value;
	
	static int num;
	
	/**
	 * 0 = value
	 * 1 = state
	 * 2 = bias
	 */
	int[] Coin = new int[3];
	
	public Coin(){
		
		Coin[0] = CoinsValue;
		Coin[1] = CoinsState;
		Coin[2] = CoinsBias;
		
		flip();
	}

	public void flip(){
		num = (int)(Math.random()*101);
		if(num < Coin[2]){
			Coin[1] = HEADS;
		} else {
			Coin[1] = TAILS;
		}
	}

	/**
	 * @return
	 * Coins Values
	 */
	public int getValue(){
		return Coin[0];
	}
	public int getState(){
		return Coin[1];
	}
	public int getBias(){
		return Coin[2];
	}
	
	/**
	 * @param x
	 * Sets Coins Values
	 */
	public void setBias(int x){
		Coin[2] = x;
	}
	public void setValue(int x){
		Coin[0] = x;
	}
	
	public int isHeads(){
		if(CoinsState == HEADS){
			return 1;
		} else {
			return 0;
		}
	}
	public String getStringState(){
		if(Coin[1] == 1){
			return "HEADS";
		} else {
			return "TAILS";
		}
		
	}
}
