package com.shiyizhonghua.controller;

import com.shiyizhonghua.bean.Poetry;
import com.shiyizhonghua.service.PoetryService;
import com.shiyizhonghua.util.Result;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @ClassName: PoetryController
 * @Description: 诗词控制类，涉及诗词的查询，修改删除等等
 * @Author: zhuaowei
 * @Date: 2021/11/15
 * @Version: 1.0
 */

@RestController
@RequestMapping("poetry")
public class PoetryController {

    @Resource
    private PoetryService poetryService;

    @GetMapping("/s")
    public ModelAndView searchPage() {
        return new ModelAndView("user/indexDemo.html");
    }


    /**\
     * 关键词搜索
     * @param keywords
     * @param page 分页所在当前页
     * @param limit 分页大小
     * @return 返回result对象，包含查询数据，状态码等信息。
     */
    @GetMapping("search")
    public Result listByKeywords(
            @RequestParam(defaultValue = "") String keywords,
            @RequestParam(required = false, defaultValue = "0") int page,
            @RequestParam(required = false, defaultValue = "10") int limit) {

        return null;
    }

    /**\
     * 根据id查询诗词字段
     * @param id 诗词的id
     * @return 返回包装的诗词对象
     */
    @GetMapping("get")
    public Result getById(@RequestParam(defaultValue = "") String id) {
        if ("".equals(id.trim())) {
            return Result.error(400, "查询字段为空！");
        }
        Poetry poetry = poetryService.getById(id);
        return Result.success(poetry);
    }

    /**\
     * 按诗词类型查询
     * @param type 查询的类别名
     * @param page 分页所在当前页
     * @param limit 分页大小
     * @return 返回result对象，包含查询数据，状态码等信息。
     */
    @GetMapping("type")
    public Result listByType(
            @RequestParam(defaultValue = "") String type,
            @RequestParam(required = false, defaultValue = "0") int page,
            @RequestParam(required = false, defaultValue = "10") int limit) {

        if ("".equals(type.trim())) {
            return Result.error(400, "查询字段为空！");
        }
        Page<Poetry> poetryPage = poetryService.listByType(type, page, limit);
        return Result.success(poetryPage);
    }

    /**\
     * 按作者名字查询
     * @param authorName 作者名字
     * @param page 分页所在当前页
     * @param limit 分页大小
     * @return 返回result对象，包含查询数据，状态码等信息。
     */
    @GetMapping("name")
    public Result listByAuthorName(
            @RequestParam(defaultValue = "") String authorName,
            @RequestParam(required = false, defaultValue = "0") int page,
            @RequestParam(required = false, defaultValue = "10") int limit) {

        if ("".equals(authorName.trim())) {
            return Result.error(400, "查询字段为空！");
        }
        Page<Poetry> poetryPage = poetryService.listByAuthorName(authorName, page, limit);
        return Result.success(poetryPage);
    }

    /**\
     * 按作者朝代分页查询
     * @param authorTime
     * @param page 分页所在当前页
     * @param limit 分页大小
     * @return 返回result对象，包含查询数据，状态码等信息。
     */
    @GetMapping("time")
    public Result listByAuthorTime(
            @RequestParam(defaultValue = "") String authorTime,
            @RequestParam(required = false, defaultValue = "0") int page,
            @RequestParam(required = false, defaultValue = "10") int limit) {

        if ("".equals(authorTime.trim())) {
            return Result.error(400, "查询字段为空！");
        }
        Page<Poetry> poetryPage = poetryService.listByAuthorTime(authorTime, page, limit);
        return Result.success(poetryPage);
    }

    /**\
     * 按诗词的内容查询
     * @param content 查询的诗词内容
     * @param page 分页所在当前页
     * @param limit 分页大小
     * @return 返回result对象，包含查询数据，状态码等信息。
     */
    @GetMapping("content")
    public Result listByContent(
            @RequestParam(defaultValue = "") String content,
            @RequestParam(required = false, defaultValue = "0") int page,
            @RequestParam(required = false, defaultValue = "10") int limit) {

        if ("".equals(content.trim())) {
            return Result.error(400, "查询字段为空！");
        }
        Page<Poetry> poetryPage = poetryService.listByContent(content, page, limit);
        return Result.success(poetryPage);
    }
}
