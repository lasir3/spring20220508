package com.zerock.mapper.ex01;

import org.apache.ibatis.annotations.Select;

public interface Ex01Mapper {

	@Select("SELECT 100")
	public int selectNumber();
		
}
