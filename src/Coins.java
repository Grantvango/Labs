public class Coins {
	
	final static int HEADS = 1;
	final static int TAILS = 0;
	
	static int value;
	static int bias;
	static int state;
	static int count;
	
	static int num;
	
	public Coins(int CoinsValue, int CoinsState, int CoinsBias, int CoinsCount){
		value = CoinsValue;
		state = CoinsState;
		bias = CoinsBias;
		count = CoinsCount;
		
		flip();
	}
	
	public void flip(){
		num = (int)(Math.random()*101);
		if(num < bias){
			state = HEADS;
		} else {
			state = TAILS;
		}
	}

	/**
	 * @return
	 * Coins Values
	 */
	public int getValue(){
		return value;
	}
	public int getState(){
		return state;
	}
	public int getBias(){
		return bias;
	}
	
	/**
	 * @param x
	 * Sets Coins Values
	 */
	public void setBias(int x){
		bias = x;
	}
	public void setValue(int x){
		value = x;
	}
	
	public void coinCount(){
		count++;
	}
	
	public String getStringState(){
		if(state == 1){
			return "HEADS";
		} else {
			return "TAILS";
		}
		
	}
}