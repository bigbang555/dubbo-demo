package com.deepexi.user.util;

import com.deepexi.user.domain.vo.ResultVO;

public class ResultUtil {

    public static ResultVO success(Object data, int page, int count) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(data);
        resultVO.setPage(page);
        resultVO.setCount(count);
        return resultVO;
    }

    public static ResultVO failure(int code, String msg) {
        ResultVO resultVo = new ResultVO();
        resultVo.setCode(code);
        resultVo.setMsg(msg);
        return resultVo;
    }

    public static ResultVO success() {
        return success(null, 0, 0);
    }


}
