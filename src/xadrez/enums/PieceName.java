package xadrez.enums;

public enum PieceName {
	
	PAWN(0),
	TOWER(1),
	HORSE(2),
	BISHOP(3),
	QUEEN(4),
	KING(5),
	UNNAMED(6);
	
	private Integer code;
	
	private PieceName(Integer code) {
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
}
