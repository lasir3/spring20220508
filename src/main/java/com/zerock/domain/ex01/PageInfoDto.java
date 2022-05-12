package com.zerock.domain.ex01;

public class PageInfoDto {
	private int current;
	private int end;
	public void setCurrent(int current) {
		this.current = current;
	}
	public int getCurrent() {
		return current;
	}
	public int getLeft() {
		return Math.max(current - 3, 1);
	}
	public int getRight() {
		return Math.min(current + 3, end);
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getEnd() {
		return end;
	}
}


